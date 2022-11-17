package Log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MyLogger1 extends Logger {
    private static final String FQCN = MyLogger1.class.getName();

    protected MyLogger1(String name) {
        super(name);
    }

    @Override
    public void debug(Object message) {
        super.log(FQCN, Level.DEBUG,message,null);
        System.out.println("Отправить в БД debug");
    }

    @Override
    public void trace(Object message) {
        super.log(FQCN, Level.TRACE,message,null);
        System.out.println("Отправить в БД trace");
    }

    @Override
    public void info(Object message) {
        super.log(FQCN, Level.INFO,message,null);
        System.out.println("Отправить в БД info");
    }
}
