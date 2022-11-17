package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class MyLog4JFactory implements LoggerFactory {

    @Override
    public Logger makeNewLoggerInstance(String name) {
        return new MyLogger1(name);
    }
}
