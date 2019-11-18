package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {
    LocalDate date;
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date.minusDays(5);
        date.plusDays(5);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/yyyy");
        System.out.println(date.format(dateTimeFormatter));

    }
}
