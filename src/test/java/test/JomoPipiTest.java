package test;

import codewars.JomoPipi;
import org.junit.Test;

import static org.junit.Assert.*;

public class JomoPipiTest {
    @Test
    public void basicTest1() {
        assertEquals("1112111121311", JomoPipi.numericals("Hello, World!"));
    }
    @Test
    public void basicTest2() {
        assertEquals("11121111213112111131224132411122", JomoPipi.numericals("Hello, World! It's me, JomoPipi!"));
    }
    @Test
    public void basicTest3() {
        assertEquals("11121122342", JomoPipi.numericals("hello hello"));
    }
}