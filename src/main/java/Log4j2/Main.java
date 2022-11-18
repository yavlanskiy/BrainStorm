package Log4j2;

public class Main {
    //Base Loger
    //private static final Logger LOGGER = getLogger();

    // Wrapper
    private static final ExtLogger LOGGER = ExtLogger.create(Main.class);

    // Custom Loggers
    //private static final Log LOGGER = Log.create(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("This is a fatal message");
        LOGGER.notice("custom logger");
        //LOGGER.defcon1("hello");
    }

    // info - 400, warn - 300, error - 200, success - 400, caution - 250
}
