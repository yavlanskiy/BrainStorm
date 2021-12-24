package algoritms;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int [] array = new int[] {11,10,9,8,7,6,5,4,3,2,1};

        for (int step = 0; step < array.length; step++) {
            final int minIndex = minValue(array,step);

            int tmp = array[step];
            array[step] = array[minIndex];
            array[minIndex] = tmp;
        }

        //swap
        System.out.println(Arrays.toString(array));
    }

    private static int minValue(int[] array, int start) {
        int minValue = array[start];
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex++;
            }
        }
        return minIndex;
    }
}
