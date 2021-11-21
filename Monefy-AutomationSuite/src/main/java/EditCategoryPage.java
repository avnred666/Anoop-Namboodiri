import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This class contains the element finders and element actions for Edit Category Page
 */
public class EditCategoryPage extends ElementUtilities {

    public EditCategoryPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id="delete")
    AndroidElement deleteCategory;

    @AndroidFindBy(id="editTextCategoryName")
    AndroidElement editCategoryText;

    @AndroidFindBy(xpath = "/android.widget.ImageView[@content-desc='More options']")
    AndroidElement moreOptionsFromEditCategory;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    AndroidElement mergeBtnFromEditCategory;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    AndroidElement enabledBtnFromEditCategory;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    AndroidElement backHomeFromEditCategoryBtn;

    @AndroidFindBy(id="message")
    AndroidElement deleteCategoryWarningMessage;

    @AndroidFindBy(id="android:id/button1")
    AndroidElement deleteCategoryWarningMessageOkBtn;

    @AndroidFindBy(id="button2")
    AndroidElement deleteCategoryWarningMessageCancelBtn;

    public void editCategoryName(String newName) {
        sendElementText(editCategoryText,newName);
    }

    public void clickBackButton() {
        clickElement(backHomeFromEditCategoryBtn);
    }

    public void deleteCategory() {
        clickElement(deleteCategory);
    }

    public void clickDeleteConfirmBtn() {
        clickElement(deleteCategoryWarningMessageOkBtn);
    }
}
