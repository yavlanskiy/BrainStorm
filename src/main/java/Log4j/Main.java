package Log4j;
import jdk.internal.net.http.common.Log;
import org.apache.log4j.Logger;


public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Текст ошибки");
        log.trace("Трэйс");
    }
}
