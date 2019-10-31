package java8;

/**
 https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1%D0%BE%D0%B2%D0%B8%D0%B4%D0%BD%D0%BE%D0%B5_%D0%BD%D0%B0%D1%81%D0%BB%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5
 */
public class DefaultMethods {
    public static void main(String[] args) {
        A a = new B();
        a.hello();
    }
}

interface A {
    void hello();

    default void sayHello(){
        System.out.println("sayHello");
    }

    static void sayHello2(){
        System.out.println("sayHello2");
    }
}

interface C {
}

class B implements A,C {
    @Override
    public void hello() {
        System.out.println("Hello B");
    }
}
