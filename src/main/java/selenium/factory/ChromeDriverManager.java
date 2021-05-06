package selenium.factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends DriverManager{
    private ChromeDriverService chService;

    @Override
    public void startService() {
        // это на всякий случай. Вдруг вы остановили тест руками и процес остался.
        //stopService();

        if (null == chService) {
            try {
                chService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(".\\driver\\chrome\\chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    @Override
    public void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("test-type");
        options.addArguments("start-maximized");

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        driver = new ChromeDriver(chService, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
