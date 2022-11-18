package Log4j2;

import java.io.Serializable;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

/**
 * Custom Logger interface with convenience methods for
 * the INFO, WARN, ERROR, SUCCESS and CAUTION custom log levels.
 * <p>Compatible with Log4j 2.6 or higher.</p>
 */
public final class Log implements Serializable {
    private static final long serialVersionUID = 334061453627750L;
    private final ExtendedLoggerWrapper logger;

    private static final String FQCN = Log.class.getName();
    private static final Level INFO = Level.forName("INFO", 400);
    private static final Level WARN = Level.forName("WARN", 300);
    private static final Level ERROR = Level.forName("ERROR", 200);
    private static final Level SUCCESS = Level.forName("SUCCESS", 400);
    private static final Level CAUTION = Level.forName("CAUTION", 250);

    private Log(final Logger logger) {
        this.logger = new ExtendedLoggerWrapper((AbstractLogger) logger, logger.getName(), logger.getMessageFactory());
    }

    /**
     * Returns a custom Logger with the name of the calling class.
     * 
     * @return The custom Logger for the calling class.
     */
    public static Log create() {
        final Logger wrapped = LogManager.getLogger();
        return new Log(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified name of the Class as
     * the Logger name.
     * 
     * @param loggerName The Class whose name should be used as the Logger name.
     *            If null it will default to the calling class.
     * @return The custom Logger.
     */
    public static Log create(final Class<?> loggerName) {
        final Logger wrapped = LogManager.getLogger(loggerName);
        return new Log(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified name of the Class as
     * the Logger name.
     * 
     * @param loggerName The Class whose name should be used as the Logger name.
     *            If null it will default to the calling class.
     * @param messageFactory The message factory is used only when creating a
     *            logger, subsequent use does not change the logger but will log
     *            a warning if mismatched.
     * @return The custom Logger.
     */
    public static Log create(final Class<?> loggerName, final MessageFactory messageFactory) {
        final Logger wrapped = LogManager.getLogger(loggerName, messageFactory);
        return new Log(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified class name of the value
     * as the Logger name.
     * 
     * @param value The value whose class name should be used as the Logger
     *            name. If null the name of the calling class will be used as
     *            the logger name.
     * @return The custom Logger.
     */
    public static Log create(final Object value) {
        final Logger wrapped = LogManager.getLogger(value);
        return new Log(wrapped);
    }

    /**
     * Returns a custom Logger using the fully qualified class name of the value
     * as the Logger name.
     * 
     * @param value The value whose class name should be used as the Logger
     *            name. If null the name of the calling class will be used as
     *            the logger name.
     * @param messageFactory The message factory is used only when creating a
     *            logger, subsequent use does not change the logger but will log
     *            a warning if mismatched.
     * @return The custom Logger.
     */
    public static Log create(final Object value, final MessageFactory messageFactory) {
        final Logger wrapped = LogManager.getLogger(value, messageFactory);
        return new Log(wrapped);
    }

    /**
     * Returns a custom Logger with the specified name.
     * 
     * @param name The logger name. If null the name of the calling class will
     *            be used.
     * @return The custom Logger.
     */
    public static Log create(final String name) {
        final Logger wrapped = LogManager.getLogger(name);
        return new Log(wrapped);
    }

    /**
     * Returns a custom Logger with the specified name.
     * 
     * @param name The logger name. If null the name of the calling class will
     *            be used.
     * @param messageFactory The message factory is used only when creating a
     *            logger, subsequent use does not change the logger but will log
     *            a warning if mismatched.
     * @return The custom Logger.
     */
    public static Log create(final String name, final MessageFactory messageFactory) {
        final Logger wrapped = LogManager.getLogger(name, messageFactory);
        return new Log(wrapped);
    }

    /**
     * Logs a message object with the {@code INFO} level.
     * 
     * @param message the message object to log.
     */
    public void info(final String message) {
        logger.logIfEnabled(FQCN, INFO, null, message, (Throwable) null);
    }

    /**
     * Logs the specified Message at the {@code WARN} level.
     * 
     * @param msg the message string to be logged
     */
    public void warn(final String msg) {
        logger.logIfEnabled(FQCN, WARN, null, msg, (Throwable) null);
    }

    /**
     * Logs a message object with the {@code ERROR} level.
     * 
     * @param message the message object to log.
     */
    public void error(final String message) {
        logger.logIfEnabled(FQCN, ERROR, null, message, (Throwable) null);
    }

    /**
     * Logs a message object with the {@code SUCCESS} level.
     * 
     * @param message the message object to log.
     */
    public void success(final String message) {
        logger.logIfEnabled(FQCN, SUCCESS, null, message, (Throwable) null);
    }

    /**
     * Logs the specified Message at the {@code CAUTION} level.
     * 
     * @param msg the message string to be logged
     */
    public void caution(final Message msg) {
        logger.logIfEnabled(FQCN, CAUTION, null, msg, (Throwable) null);
    }
}

