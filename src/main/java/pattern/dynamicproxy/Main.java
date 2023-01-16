package pattern.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Man max = new Man("Max", 30,"Харьков", "Украина");
        final ClassLoader classLoader = max.getClass().getClassLoader();
        final Class<?>[] interfaces = max.getClass().getInterfaces();

        final Person proxyMax = (Person) Proxy.
                newProxyInstance(classLoader, interfaces, new PersonInvocationHandler(max));

        proxyMax.introduce(max.getName());
    }
}
