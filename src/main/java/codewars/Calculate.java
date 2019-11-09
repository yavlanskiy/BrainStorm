package codewars;

public class Calculate {
    public static String bmi(double weight, double height) {

        double result = weight/Math.pow(height,2);

        if (result <= 18.5) {
            return "Underweight";
        }
        else if (result <= 25.0) {
            return "Normal";
        }
        else if (result <= 30.0) {
            return "Overweight";
        }
        else {
            return "Obese";

        }
    }

    public static void main(String[] args) {
        System.out.println(bmi(55.0,1.60));
    }
}
