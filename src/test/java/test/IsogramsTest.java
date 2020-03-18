package test;

import codewars.Isograms;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramsTest {
    @Test
    public void FixedTests() {
        assertTrue(Isograms.isIsogram("Dermatoglyphics"));
        assertTrue(Isograms.isIsogram("isogram"));
        assertFalse(Isograms.isIsogram("moose"));
        assertFalse(Isograms.isIsogram("isIsogram"));
        assertFalse(Isograms.isIsogram("aba"));
        assertFalse(Isograms.isIsogram("moOse"));
        assertTrue(Isograms.isIsogram("thumbscrewjapingly"));
        assertTrue(Isograms.isIsogram(""));
    }
}