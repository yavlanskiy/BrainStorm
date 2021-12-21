package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({
        MySuteListtener.class,
        MySuteListtener2.class
})
public class TestListener {

    @BeforeSuite
    public void setup() {
        System.out.println("----");
    }
    @Test(priority = 1)
    public void firstTest4() {
        System.out.println("Test4");
    }
    @Test(priority = 2)
    public void firstTest3() {
        System.out.println("Test3");
    }
    @Test(priority = 3)
    public void firstTest2() {
        System.out.println("Test2");
    }
    @Test(priority = 4)
    public void firstTest1() {
        System.out.println("Test1");
    }
    @Test(priority = 5)
    public void firstTest7() {
        System.out.println("Test7");
    }
    @Test(priority = 6)
    public void firstTest() {
        System.out.println("Test");
    }
}
