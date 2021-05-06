package test.seleniumtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import selenium.factory.DriverManager;
import selenium.factory.DriverManagerFactory;
import selenium.factory.DriverType;

public class Test1 {
    // Берём у нашей фабрики нужный нам драйвер
    private DriverManager driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = driverManager.getDriver();
    }

    @Test
    public void run() {
        driver.get("google.com");
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
    }
}
