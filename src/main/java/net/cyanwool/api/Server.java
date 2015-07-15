package net.cyanwool.api;

import java.util.List;

import net.cyanwool.api.command.CommandManager;
import net.cyanwool.api.command.ConsoleCommandSender;
import net.cyanwool.api.entity.EntityManager;
import net.cyanwool.api.io.IOManager;
import net.cyanwool.api.lang.LanguageManager;
import net.cyanwool.api.management.OperatorsManager;
import net.cyanwool.api.management.PlayerManager;
import net.cyanwool.api.management.WhitelistManager;
import net.cyanwool.api.network.NetworkServer;
import net.cyanwool.api.packs.ServerPack;
import net.cyanwool.api.plugins.PluginManager;
import net.cyanwool.api.scheduler.Scheduler;
import net.cyanwool.api.utils.Registry;
import net.cyanwool.api.utils.ServerConfiguration;
import net.cyanwool.api.world.WorldManager;

import org.apache.logging.log4j.Logger;

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
	 * Возвращает логгер
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
	public LanguageManager getLanguageManager();

	/**
	 * Выключить сервер с сообщением
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public void shutdown(String message);

	/**
	 * Список разработчиков
	 * 
	 * @return
	 */
	public List<String> getDevelopers();

	/**
	 * Регистратор блоков и предметов
	 */
	public Registry getRegistry();

	/**
	 * Менеджер для регистрации плагинов
	 */
	public PluginManager getPluginManager();

	/**
	 * Менеджер для регистрации/удаления команд
	 * 
	 * @return
	 */
	public CommandManager getCommandManager();

	/**
	 * Консоль
	 * 
	 * @return
	 */
	public ConsoleCommandSender getConsoleCommandSender();

	/**
     * 
     */
	public ServerPack getServerPack();

	/**
	 * Настройки сервера
	 */
	public ServerConfiguration getServerConfiguration();

	/**
	 * Менеджер для чтения/записи (Input/Output)
	 */
	public IOManager getIOManager();

	/**
	 * Менеджер для работ с мирами
	 */
	public WorldManager getWorldManager();

	/**
     * 
     */
	public Scheduler getScheduler();
}
