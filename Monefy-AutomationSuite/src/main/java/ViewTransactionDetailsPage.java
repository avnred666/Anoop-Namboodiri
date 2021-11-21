import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This class contains the element finders and element actions for Transaction Details Page
 */
public class ViewTransactionDetailsPage extends ElementUtilities {

    public ViewTransactionDetailsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy (id="textViewCategoryName")
    MobileElement transactionCategory;

    @AndroidFindBy(id="textViewTransactionAmount")
    MobileElement transactionAmount;

    @AndroidFindBy(id="balance_amount")
    AndroidElement balanceAmountDisplay;

    @AndroidFindBy(id="leftLinesImageView")
    AndroidElement viewDetails;


    public void clickTransactionCategory() {
        clickElement(transactionCategory);
    }

    public void clickTransactionAmount() {
        clickElement(transactionAmount);
    }

    public void clickBalanceAmount() {
        clickElement(balanceAmountDisplay);
    }

    public void clickLeftViewPanel() {
        clickElement(viewDetails);
    }
}
