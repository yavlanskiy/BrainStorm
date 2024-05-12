package pattern.dynamicproxy.example.handlers;

import pattern.dynamicproxy.example.PersonBeen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBeen person;

    public NonOwnerInvocationHandler(PersonBeen person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException("У вас нет доступа к этому методу!");
            }
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
