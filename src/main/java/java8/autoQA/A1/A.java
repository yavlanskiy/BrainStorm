package java8.autoQA.A1;

import java.util.function.Consumer;

public class A {

    public static void main(String[] args) {
        Consumer<String> println = A::println;
        println.accept("HELLO");

        Database database = User::new;
        User max = database.create("Max", "123");
        System.out.println(max.getName() + "---" + max.getPass());

        System.out.println(getOperation('*').getResult(2, 2));
        System.out.println(getOperation('+').getResult(2, 2));
    }

    private static void println(String text){
        System.out.println();
    }

    private static Operation getOperation(char symbol) {
        switch (symbol){
            case '*':
                return ((value1, value2) -> value1 * value2);
            case '+':
                return ((value1, value2) -> value1 + value2);
            case '/':
                return ((value1, value2) -> value1 / value2);
            default:
                return (value1, value2) -> 0;
        }
    }
}
