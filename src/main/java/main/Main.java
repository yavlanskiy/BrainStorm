package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);

            Scanner in = new Scanner(System.in);
            System.out.println("Input а: ");

            int a = in.nextInt();
            in.nextLine();

            System.out.println("выводим а: ");
            System.out.println(a);
            in.close();
        }
    }
}
