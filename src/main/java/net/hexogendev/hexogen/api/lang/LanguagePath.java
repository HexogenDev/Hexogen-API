package net.hexogendev.hexogen.api.lang;

public class LanguagePath {

	public static class COMMON {
		public static final String HEXOGEN_API_VERSION = "system.hexogenAPIVersion";

		public static final String ENABLED = "system.common.enabled";
		public static final String DISABLED = "system.common.disabled";
		public static final String UNKNOWN = "system.common.unknown";
	}

	public static class PLUGINS {
		public static final String PLUGIN = "system.plugins.plugin";
		public static final String DESCRIPTON = "system.plugins.description";
		public static final String VERSION = "system.plugins.version";
		public static final String DEVELOPER = "system.plugins.developer";
		public static final String DEVELOPERS = "system.plugins.developers";
		public static final String MINIMUM_VERSION_API = "system.plugins.minimumVersionAPI";
		public static final String STATUS = "system.plugins.status";
	}

	public static class MESSAGES {
		public static final String DEFAULT_SHUTDOWN_MESSAGE = "system.messages.shutdown";
		public static final String DEFAULT_KICK_MESSAGE = "system.messages.kick";
		public static final String DEFAULT_KICK_MESSAGE_FOR_PLAYER = "system.messages.kickPlayer";
	}

	public static class COMMANDS {
		public static final String UNKNOWN_COMMAND = "system.commands.unknownCommand";

		public static class INFO {
			public static final String DESCRIPTION = "system.commands.info.description";
			public static final String ABOUT_SERVER = "system.commands.info.aboutServer";
		}

		public static class PLUGINS {
			public static final String DESCRIPTION = "system.commands.plugins.description";
			public static final String INSTALLED_PLUGINS = "system.commands.plugins.installedPlugins";
		}

		public static class SHUTDOWN {
			public static final String DESCRIPTION = "system.commands.shutdown.description";
		}
	}
}
