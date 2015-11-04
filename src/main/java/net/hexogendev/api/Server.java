package net.hexogendev.api;

import org.apache.logging.log4j.Logger;

import net.hexogendev.api.command.ConsoleCommandSender;
import net.hexogendev.api.command.ICommandManager;
import net.hexogendev.api.entity.EntityManager;
import net.hexogendev.api.lang.ILanguageManager;
import net.hexogendev.api.management.OperatorsManager;
import net.hexogendev.api.management.PlayerManager;
import net.hexogendev.api.management.WhitelistManager;
import net.hexogendev.api.network.NetworkServer;
import net.hexogendev.api.plugins.IPluginManager;
import net.hexogendev.api.scheduler.Scheduler;
import net.hexogendev.api.utils.Registry;
import net.hexogendev.api.utils.ServerConfiguration;
import net.hexogendev.api.world.WorldManager;

public interface Server {

	/**
	 * Название реализационого сервера
	 * 
	 * @return Название
	 */
	public String getModName();

	/**
	 * Версия Minecraft
	 * 
	 * @return Версия
	 */
	public String getMCVersion();

	/**
	 * Тип реализации (Например: Standalone или Platform)
	 * 
	 * @return ImplementationType
	 */
	public ImplementationType getImplementationType();

	/**
	 * Запуск сервера
	 */
	public void start();

	/**
	 * Отправить сообщение в глобальный чат (В том числе сервер).
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public void broadcastMessage(String string);

	/**
	 * Логгер
	 * 
	 * @return Логгер из org.apache.logging.log4j
	 */
	public Logger getLogger();

	/**
	 * Менеджер белого списка
	 * 
	 * @return
	 */
	public WhitelistManager getWhitelistManager();

	/**
	 * Менеджер операторов
	 * 
	 * @return
	 */
	public OperatorsManager getOperatorsManager();

	/**
	 * Менеджер для создания класса игрока и его взаимнодействия. Например вход игрока на сервер.
	 * 
	 * @return
	 */
	public PlayerManager getPlayerManager();

	/**
	 * Сервер для обработки с пакетами.
	 * 
	 * @return
	 */
	public NetworkServer getNetworkServer();

	/**
	 * Менеджер для регистрации/удаления сущностей.
	 * 
	 * @return
	 */
	public EntityManager getEntityManager();

	/**
	 * Менеджер языковых пакетов
	 */
	public ILanguageManager getLanguageManager();

	/**
	 * Выключить сервер с сообщением
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public void shutdown(String message);

	/**
	 * Регистратор блоков и предметов
	 */
	public Registry getRegistry();

	/**
	 * Менеджер для регистрации плагинов
	 */
	public IPluginManager getPluginManager();

	/**
	 * Менеджер для регистрации/удаления команд
	 * 
	 * @return ICommandManager
	 */
	public ICommandManager getCommandManager();

	/**
	 * Консоль
	 * 
	 * @return ConsoleSender
	 */
	public ConsoleCommandSender getConsoleCommandSender();

	/**
	 * Настройки сервера
	 * 
	 * @return Configuration
	 */
	public ServerConfiguration getServerConfiguration();

	/**
	 * Менеджер для работ с мирами
	 * 
	 * @return WorldManager
	 */
	public WorldManager getWorldManager();

	/**
	 * 
	 */
	public Scheduler getScheduler();

	/**
	 * 
	 */
	public Side getSide();
}
