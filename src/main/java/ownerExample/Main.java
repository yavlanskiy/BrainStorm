package ownerExample;

import org.aeonbits.owner.ConfigFactory;

public class Main {

    public static void main(String[] args) {
        ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
        System.out.println("Server " + cfg.hostname() + ":" + cfg.port() +
                " will run " + cfg.maxThreads());
    }
}
