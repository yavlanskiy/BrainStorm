package test;

import codewars.SavetheSpiceHarvester;
import org.junit.Test;

import static org.junit.Assert.*;

public class SavetheSpiceHarvesterTest {
    @Test
    public void testDescriptionExample() {
        int data[][] = {
                {345, 600},      // Harvester Position
                {200, 100, 25},  // Worm Position&Speed
                {350, 200, 32}}; // Carryall Position&Speed

        int data2[][] = {
                {200, 400},      // Harvester Position
                {200, 0, 40},  // Worm Position&Speed
                {500, 100, 45}}; // Carryall Position&Speed

        assertEquals("The spice must flow! Rescue the harvester!", SavetheSpiceHarvester.harvesterRescue(data));
        assertEquals("Damn the spice! I'll rescue the miners!", SavetheSpiceHarvester.harvesterRescue(data2));

    }
}