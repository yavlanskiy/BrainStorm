package java8.autoQA.A2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,-1,-100};
        for (int number : numbers) {
            if (number > 0) System.out.print(number);
        }

        // Терминальные/Промежуточные
         IntStream.of(numbers).filter(value -> value > 0).forEach(System.out::println);

        // Виды стримов
        Stream<String> stream = Arrays.stream(new String[]{"a", "s", "d", "f", "g"});
        IntStream stream1 = Arrays.stream(new int[]{1, 2, 3, 4, 5, 65});
        LongStream stream2 = Arrays.stream(new long[]{1, 2, 3, 4, 5, 65});

        // Универсальное создание
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<String> stringStream = Stream.of("1", "2", "3");

        // Use
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Max","Nata","Ira","Poros","Belcos");
        list.stream().filter(s -> s.length()>=4).forEach(System.out::println);

        // Фильтация и перебор
        Stream<String> v1 = Stream.of("V1", "V2", "V3", "V4", "V5", "V6", "V7");
        //v1.skip(2).forEach(System.out::print);
        //v1.limit(3).forEach(System.out::print);

        // Map
        Stream<Film> filmStream = Stream.of(new Film("Joker", 100.3), new Film("Hentay", 1000.3));
        // filmStream.map(Film::getPrise).forEach(System.out::println);
        // filmStream.map(Film::getTitle).forEach(System.out::println);

        // Сведение allMatch/anyMatch/noneMatch
        Stream<Integer> mixedNumbers = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(mixedNumbers.allMatch(integer -> integer > 0));

        Stream<Integer> positiveNumbers = Stream.of(1, 2);
        System.out.println(positiveNumbers.allMatch(integer -> integer > 0));

        Stream<Integer> negativeNumbers = Stream.of(-2, -1);
        System.out.println(negativeNumbers.allMatch(integer -> integer > 0));

        // count
        Stream<Integer> mixedNumbers2 = Stream.of(-2, -1, 0, 1, 2);
        System.out.println(mixedNumbers2.count());

        // Min/Max
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A",100));
        tickets.add(new Ticket("B",200));
        Ticket ticketMin = tickets.stream().min(Ticket::compare).get();
        Ticket ticketMax = tickets.stream().max(Ticket::compare).get();

        // Reduse

        // Приведение к коллекции
    }
}
