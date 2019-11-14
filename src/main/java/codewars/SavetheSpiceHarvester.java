package codewars;

import java.util.Map;

import static java.lang.Math.*;

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

        return "Save me!";
    }

    public static void main(String[] args) {
        int x1 = 200; int x2 = 350;
        int y1 = 100; int y2 = 200;

        int sCarryall = 32;

        double distance =  sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        double time = distance/sCarryall;

        System.out.println(time);
    }
}
