package Log4j;

import org.apache.log4j.Logger;

public class TestClass {
    protected Logger log = Logger.getLogger(getClass().getName(), new MyLog4JFactory());

    public void helloMethodInTestClass(){
        log.trace("trace");
        log.debug("debug");
    }
}
