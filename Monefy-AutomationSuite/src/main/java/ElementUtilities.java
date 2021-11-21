import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains the utility methods to support element actions
 */
public class ElementUtilities {
    private AppiumDriver driver;
    public static final int timeout = 10;

    public ElementUtilities( AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver=appiumDriver;
    }

    public void waitForElementVisibility(MobileElement element)
    {
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendElementText(MobileElement element, String text)
    {
        waitForElementVisibility(element);
        element.sendKeys(text);
    }

    public String getElementText(MobileElement element)
    {
        waitForElementVisibility(element);
        return element.getText();
    }

    public void clearElement(MobileElement element)
    {
        waitForElementVisibility(element);
        element.clear();
    }

    public void clickElement(MobileElement element)
    {
        waitForElementVisibility(element);
        element.click();
    }


}
