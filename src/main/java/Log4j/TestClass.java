package Log4j;

import Log4j2.ExtLogger;
import Log4j2.Main;
import org.apache.log4j.Logger;

public class TestClass {
    //protected Logger log = Logger.getLogger(getClass().getName(), new MyLog4JFactory());
    private static final ExtLogger LOGGER = ExtLogger.create(TestClass.class);


    public void helloMethodInTestClass(){
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("This is a fatal message");
        LOGGER.notice("custom logger");
    }
}
