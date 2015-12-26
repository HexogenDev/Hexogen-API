package net.hexogendev.hexogen.api;

import org.apache.logging.log4j.Logger;

import net.hexogendev.hexogen.api.command.ICommandManager;
import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.entity.EntityManager;
import net.hexogendev.hexogen.api.lang.ILanguageManager;
import net.hexogendev.hexogen.api.management.OperatorsManager;
import net.hexogendev.hexogen.api.management.PlayerManager;
import net.hexogendev.hexogen.api.management.WhitelistManager;
import net.hexogendev.hexogen.api.network.NetworkServer;
import net.hexogendev.hexogen.api.plugins.IPluginManager;
import net.hexogendev.hexogen.api.scheduler.Scheduler;
import net.hexogendev.hexogen.api.storage.StorageManager;
import net.hexogendev.hexogen.api.utils.Registry;
import net.hexogendev.hexogen.api.utils.ServerConfiguration;
import net.hexogendev.hexogen.api.world.WorldManager;

public class Hexogen {

	private static Server server;

	/**
	 * 
	 * Инициализация сервера
	 * 
	 * @param init
	 *            - Сервер
	 */
	public static void initServer(Server init) {
		if (getServer() != null) {
			server.getLogger().warn("Cannot redefine singleton Server");
			return;
		}
		server = init;
		getServer().getLogger().info("Starting minecraft server " + getServer().getModName() + " (Minecraft Version: " + getServer().getMCVersion() + ")");
		getServer().start();
	}

	/**
	 * Возвращает сервер
	 * 
	 * @return Сервер
	 */
	public static Server getServer() {
		return server;
	}

	/**
	 * 
	 * Название реализационого сервера
	 * 
	 * @return Название
	 */
	public static String getModName() {
		return getServer().getModName();
	}

	/**
	 * Версия Minecraft
	 * 
	 * @return Версия
	 */
	public static String getMCVersion() {
		return getServer().getMCVersion();
	}

	/**
	 * Тип реализации (Например: Standalone или Platform)
	 * 
	 * @return ImplementationType
	 */
	public static ImplementationType getImplementationType() {
		return getServer().getImplementationType();
	}

	/**
	 * Возвращает логгер
	 * 
	 * @return Логгер из org.apache.logging.log4j
	 */
	public static Logger getLogger() {
		return getServer().getLogger();
	}

	/**
	 * Менеджер белого списка
	 * 
	 * @return
	 */
	public static WhitelistManager getWhitelistManager() {
		return getServer().getWhitelistManager();
	}

	/**
	 * Менеджер операторов
	 * 
	 * @return
	 */
	public static OperatorsManager getOperatorsManager() {
		return getServer().getOperatorsManager();
	}

	/**
	 * Менеджер для создания класса игрока и его взаимнодействия. Например заход игрока на сервер.
	 * 
	 * @return
	 */
	public static PlayerManager getPlayerManager() {
		return getServer().getPlayerManager();
	}

	/**
	 * Сервер для обработки с пакетами.
	 * 
	 * @return
	 */
	public static NetworkServer getNetworkServer() {
		return getServer().getNetworkServer();
	}

	/**
	 * Менеджер для регистрации/удаления сущностей.
	 * 
	 * @return
	 */
	public static EntityManager getEntityManager() {
		return getServer().getEntityManager();
	}

	/**
	 * Отправить сообщение в глобальный чат (В том числе сервер).
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public static void broadcastMessage(String message) {
		getServer().broadcastMessage(message);
	}

	/**
	 * Выключить сервер с сообщением
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public static void shutdown(String message) {
		getServer().shutdown(message);
	}

	/**
	 * Менеджер языковых пакетов
	 */
	public static ILanguageManager getLanguageManager() {
		return getServer().getLanguageManager();
	}

	/**
	 * Регистратор блоков и предметов
	 */
	public static Registry getRegistry() {
		return getServer().getRegistry();
	}

	/**
	 * Менеджер для регистрации плагинов
	 */
	public static IPluginManager getPluginManager() {
		return getServer().getPluginManager();
	}

	/**
	 * Менеджер для регистрации/удаления команд
	 * 
	 * @return
	 */
	public static ICommandManager getCommandManager() {
		return getServer().getCommandManager();
	}

	/**
	 * Консоль
	 * 
	 * @return
	 */
	public static ICommandSender getConsoleCommandSender() {
		return getServer().getConsoleCommandSender();
	}

	/**
	 * Настройки сервера
	 */
	public static ServerConfiguration getServerConfiguration() {
		return getServer().getServerConfiguration();
	}

	/**
	 * Менеджер для работ с мирами
	 */
	public static WorldManager getWorldManager() {
		return getServer().getWorldManager();
	}

	/**
	 * 
	 */
	public static Scheduler getScheduler() {
		return getServer().getScheduler();
	}

	/**
	 * 
	 */
	public static Side getSide() {
		return getServer().getSide();
	}

	/**
	 * 
	 */
	public StorageManager getStorageManager() {
		return getServer().getStorageManager();
	}

	// From Platform
	/**
	 * 
	 * @param manager
	 */
	public void setPlayerManager(PlayerManager manager) {
		getServer().setPlayerManager(manager);
	}

	/**
	 * 
	 * @param netserver
	 */
	public void setNetworkServer(NetworkServer netserver) {
		getServer().setNetworkServer(netserver);
	}

	/**
	 * 
	 * @param manager
	 */
	public void setEntityManager(EntityManager manager) {
		getServer().setEntityManager(manager);
	}

	/**
	 * Экстренное выключение сервера
	 */
	public void shutdownNow() {
		getServer().shutdownNow();
	}

	/**
	 * 
	 * @param sender
	 */
	public void setConsoleCommandSender(ICommandSender sender) {
		getServer().setConsoleCommandSender(sender);
	}

	/**
	 * 
	 * @param manager
	 */
	public void setWorldManager(WorldManager manager) {
		getServer().setWorldManager(manager);
	}

	/**
	 * 
	 */
	public void setScheduler(Scheduler scheduler) {
		getServer().setScheduler(scheduler);
	}
}
