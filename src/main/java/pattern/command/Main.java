package pattern.command;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(final String[] arguments) {
        LightImpl lamp = new LightImpl();

        final ClassLoader classLoader = lamp.getClass().getClassLoader();
        final Class<?>[] interfaces = lamp.getClass().getInterfaces();

        final Liqht light = (Liqht) Proxy.newProxyInstance(classLoader, interfaces, new CommandProxyHandler(lamp));

        light.turnOn();
    }
}
