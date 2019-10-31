package java8;

import java.util.stream.Stream;

public class MethodReferences {
    public static void main(String[] args) {
        Stream.of("one", "two").map(aS -> aS.toUpperCase());
        Stream.of("one", "two").map(String::toUpperCase);

        Stream.of(new QAAutomation("Max"), new QAAutomation("Dima")).
                map(QAAutomation::getName).
                      forEach(System.out::println);

        Stream.of("Nata", "Ira").map(x -> new QAAutomation(x)).forEach(x -> System.out.print(x.getName() + " "));
    }
}

class QAAutomation {
    String name;

    public QAAutomation(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }
}
