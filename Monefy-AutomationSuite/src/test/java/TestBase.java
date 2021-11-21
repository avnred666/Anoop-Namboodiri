import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Base class for all tests. Starts up and tears down Appium sessions
 */
public class TestBase {

    public static AppiumDriver driver;
    String fileDirectory = System.getProperty("user.dir");

    /**
     * @throws Exception
     * Establishes Appium Session. Update platform and device details of the emulator device in config.properties file
     * Save the apk of the app under <project director>/apk/<app>
     */
    @BeforeTest
    public void setup() throws Exception {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        Properties prop= new Properties();
        InputStream deviceSelection= new FileInputStream(fileDirectory+"/src/test/config/config.properties");
        prop.load(deviceSelection);
        capabilities.setCapability("platformName", prop.getProperty("platformName"));
        capabilities.setCapability("platformVersion", prop.getProperty("platformVersion"));
        capabilities.setCapability("deviceName",prop.getProperty("deviceName"));
        capabilities.setCapability("automationName","uiAutomator2");
        capabilities.setCapability("app",fileDirectory+"/apk/com.monefy.app.lite_2021-09-27.apk");
        driver= new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    /**
     * End Appium session
     */
    @AfterTest
    public void teardown()  {
        driver.quit();
    }


}
