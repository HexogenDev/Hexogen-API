package net.hexogendev.hexogen.api.plugins.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import net.hexogendev.hexogen.api.configuration.file.YamlConfiguration;
import net.hexogendev.hexogen.api.plugins.IPluginDescription;
import net.hexogendev.hexogen.api.plugins.IPluginLoader;
import net.hexogendev.hexogen.api.plugins.InvalidPluginException;

public class PluginLoader extends ClassLoader implements IPluginLoader {
	private Map<String, Class<?>> cacheClass = new HashMap<String, Class<?>>();
	private ClassLoader parent;

	public PluginLoader(ClassLoader parent) {
		this.parent = parent;
	}

	@Override
	public IPluginDescription loadPlugin(String pluginPath) throws InvalidPluginException {
		JarFile pluginJar = null;
		InputStream inputStream = null;
		try {
			pluginJar = new JarFile(pluginPath);
			JarEntry jarEntry = pluginJar.getJarEntry("plugin.yml");
			if (jarEntry == null) {
				extracted(pluginPath);
			}
			inputStream = pluginJar.getInputStream(jarEntry);

			YamlConfiguration config = YamlConfiguration.loadConfiguration(inputStream);

			String name = config.getString("name");
			String main = config.getString("mainClass");
			String version = config.getString("version");
			String description = config.getString("description");
			int minimumAPI = config.getInt("minimumAPI");
			List<String> depends = config.getStringList("depends");
			List<String> developers = config.getStringList("developers");
			IPluginDescription descrption = new PluginDescription(name, main, developers, version, description, minimumAPI, depends);

			Enumeration<JarEntry> entries = pluginJar.entries();
			while (entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();
				if (entry.isDirectory())
					continue;

				if (isClass(entry.getName())) {
					byte[] classData = loadClassData(pluginJar, entry);
					if (classData != null) {
						Class<?> clazz = defineClass(canonicalClassName(entry.getName()), classData, 0, classData.length);
						cacheClass.put(clazz.getName(), clazz);
					}
				}
			}
			return descrption;
		} catch (Exception e) {
			throw new InvalidPluginException(e);
		} finally {
			if (pluginJar != null) {
				try {
					pluginJar.close();
				} catch (IOException e) {
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
				}
			}
		}
	}

	private void extracted(String pluginPath) throws InvalidPluginException {
		throw new InvalidPluginException("\"plugin.yml\" not found in \"" + pluginPath + "\"");
	}

	private boolean isClass(String className) {
		return className.endsWith(".class");
	}

	private String canonicalClassName(String className) {
		return className.replace('/', '.').substring(0, className.length() - 6);
	}

	private byte[] loadClassData(JarFile pluginJar, JarEntry jarEntry) throws InvalidPluginException {
		if (jarEntry.getSize() > Integer.MAX_VALUE) {
			throw new InvalidPluginException("Class size too long");
		}

		return loadData(pluginJar, jarEntry);
	}

	private byte[] loadData(JarFile pluginJar, JarEntry jarEntry) throws InvalidPluginException {
		long size = jarEntry.getSize();
		if (size <= 0)
			return null;

		byte[] buffer = new byte[(int) size];

		try {
			InputStream is = pluginJar.getInputStream(jarEntry);
			is.read(buffer);
		} catch (IOException e) {
			throw new InvalidPluginException(e);
		}

		return buffer;
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		Class<?> result = cacheClass.get(name);

		if (result == null) {
			result = parent.loadClass(name);
		}

		return result;
	}
}
