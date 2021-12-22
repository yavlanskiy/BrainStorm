package algoritms;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class BubleSort {
    public static void main(String[] args) {
        int [] array = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] =temp;
                isSorted = false;
            }
        }}



        Arrays.stream(array).forEach(iner-> System.out.print(iner +" "));
    }
}
