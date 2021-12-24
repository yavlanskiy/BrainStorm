package algoritms;

public class MinValue {
    public static void main(String[] args) {
        int [] array = new int[] {11,10,9,8,7,6,5,4,3,2,1};

        final int i = minValue(array);
        System.out.println(i);

    }

    private static int minValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
