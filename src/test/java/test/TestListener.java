package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({
        MySuteListtener.class,
        MySuteListtener2.class
})
public class TestListener {

    @Test
    public void firstTest() {
        System.out.println("Test");
    }
}
