package pattern.command;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CommandProxyHandler implements InvocationHandler {

    private Liqht light;

    public CommandProxyHandler(Liqht light) {
        this.light = light;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("PRE COMMAND!!");
        return method.invoke(light, args);
    }
}
