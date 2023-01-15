package Log4j2;

import Log4j.TestClass;

public class Main {
    //Base Loger
    //private static final Logger LOGGER = getLogger();

    // Wrapper
    private static final ExtLogger LOGGER = ExtLogger.create(Main.class);

    // Custom Loggers
    //private static final Log LOGGER = Log.create(Main.class);

    public static void main(String[] args) {
        new TestClass().helloMethodInTestClass();
        //LOGGER.defcon1("hello");
    }

    // info - 400, warn - 300, error - 200, success - 400, caution - 250
}
