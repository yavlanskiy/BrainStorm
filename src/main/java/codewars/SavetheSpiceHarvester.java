package codewars;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Goal:
 * As a spotter pilot, you are responsible for handling dispatch of Carryalls in your vicinity. Your goal is to determine whether a carryall should be sent for rescue, or if it must be forfeited because there is not enough time.
 *
 * Each test input will consist of an object data, which has the following properties:
 *
 * harvester: location of the spice harvester
 *
 * worm: location and travel speed of the spotted sandworm in the form [location, movement speed])
 *
 * carryall: location and travel speed of the nearest carryall in the form [location, movement speed])
 *
 * Conditions / Restrictions:
 * All coordinates (location) are in the form: [x, y] and may be positive or negative. For example: [45,225]
 * Assume that the sandworm and Carryall each are moving toward the harvester in a straight line at a constant speed.
 * A Carryall takes 1 minute to lift the harvester to a safe altitude in order to avoid being devoured by the sandworm. Take this into account when formulating your solution.
 * Distance is measured in kilometers (in the 213th century, the metric system is the universal standard)
 * Movement speed is measured in km/minute.
 * Input argument is always valid.
 * Return value should be a String type value.
 * Do not mutate the input.
 * Output:
 * If the harvester can be saved (that is, lifted to a safe altitude before the sandworm reaches the target location), the function should return The spice must flow! Rescue the harvester! otherwise, it should return Damn the spice! I'll rescue the miners!
 */
public class SavetheSpiceHarvester {
    public static String harvesterRescue(final int[][] data) {
        int harvesterX = data[0][0];
        int harvesterY = data[0][1];

        int wormX = data[1][0];
        int wormY = data[1][1];
        int wormS = data[1][2];

        int carryallX = data[2][0];
        int carryallY = data[2][1];
        int carryallS = data[2][2];

        double wormD = calculateDistance(wormX, wormY, harvesterX, harvesterY);
        double carryallD = calculateDistance(carryallX, carryallY, harvesterX, harvesterY);

        double timeWorm = calculateTime(wormD, wormS);
        double timeCarryall = calculateTime(carryallD, carryallS);

        if (timeWorm > ++timeCarryall) {
            return "The spice must flow! Rescue the harvester!";
        }
        else {
            return "Damn the spice! I'll rescue the miners!";
        }
    }

    private static double calculateDistance(double x1, double x2, double y1, double y2) {
        return (int) sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
    }

    private static double calculateTime(double distance, double speed) {
        return distance/speed;
    }

    public static void main(String[] args) {
        int data[][] = {
                {345, 600},      // Harvester Position
                {200, 100, 25},  // Worm Position&Speed
                {350, 200, 32}}; // Carryall Position&Speed

        int data2[][] = {
                {200, 400},      // Harvester Position
                {200, 0, 40},  // Worm Position&Speed
                {500, 100, 45}}; // Carryall Position&Speed
    }


}
