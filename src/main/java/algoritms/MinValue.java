package algoritms;

public class MinValue {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5,6,7,8,9,10,11};

        int maxValue = 0;
        int maxValueIndex = 0;

        for (int i : array) {
            if (i>maxValue) {
                maxValue = i;
                maxValueIndex++;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxValueIndex-1);
    }
}
