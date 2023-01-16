package pattern.command;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CommandProxyHandler implements InvocationHandler {

    private LightImpl light;

    public CommandProxyHandler(LightImpl light) {
        this.light = light;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("PRE COMMAND!!");
        return method.invoke(light, args);
    }
}
