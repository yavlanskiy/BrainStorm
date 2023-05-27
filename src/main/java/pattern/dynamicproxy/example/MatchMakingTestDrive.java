package pattern.dynamicproxy.example;

import pattern.dynamicproxy.Person;
import pattern.dynamicproxy.example.handlers.NonOwnerInvocationHandler;
import pattern.dynamicproxy.example.handlers.OwnerInvocationHandler;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, PersonBeen> datingDB = new HashMap<>();

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void drive() {
        PersonBeen maxYav = getPersonFromDatabase("Max Yav");

        PersonBeen ownerProxy = getOwnerProxy(maxYav);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("guitar");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Нельзя установить рейтинг если Вы владелец");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBeen nonOwnerProxy = getNonOwnerProxy(maxYav);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Guitar");
        } catch (Exception e) {
            System.out.println("Ну куда ты лезешь? Так нельзя.");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBeen getPersonFromDatabase(String name) {
        return (PersonBeen) datingDB.get(name);
    }

    void initializeDatabase() {
        PersonBeanImpl max = new PersonBeanImpl();
        max.setName("Max Yav");
        max.setInterests("cars, computers, music");
        max.setHotOrNotRating(7);
        datingDB.put(max.getName(), max);

        PersonBeanImpl alena = new PersonBeanImpl();
        alena.setName("Alena Yav");
        alena.setInterests("ebay, movies, music");
        alena.setHotOrNotRating(10);
        datingDB.put(alena.getName(), alena);
    }

    PersonBeen getOwnerProxy(PersonBeen personBeen) {
        return (PersonBeen) Proxy.newProxyInstance(
                personBeen.getClass().getClassLoader(),
                personBeen.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBeen));
    }

    PersonBeen getNonOwnerProxy(PersonBeen personBeen) {
        return (PersonBeen) Proxy.newProxyInstance(
                personBeen.getClass().getClassLoader(),
                personBeen.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBeen));
    }
}
