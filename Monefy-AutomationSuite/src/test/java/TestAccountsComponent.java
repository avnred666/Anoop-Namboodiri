import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestAccountsComponent extends TestBase{
    HomePage homePage;
    NewAccountPage newAccountPage;
    ViewTransactionDetailsPage viewTransactionDetailsPage;

    /**
     * @throws Exception
     * Verify that user is able to add a new account
     */
    @Test
    public void addNewAccount() throws Exception {
        setup();
        homePage = new HomePage(driver);
        newAccountPage = new NewAccountPage(driver);
        viewTransactionDetailsPage = new ViewTransactionDetailsPage(driver);
        homePage.openSettingsPanel();
        homePage.clickAccounts();
        homePage.clickAddAccountPlusBtn();
        newAccountPage.enterAccountName("Credit");
        newAccountPage.enterAccountInitialAmt("100");
        newAccountPage.selectAccountIcon();
        newAccountPage.clickAddAccountBtn();
        homePage.waitForIncomeDisplay();

        Assert.assertEquals(homePage.balanceAmountDisplay.getText(),"Balance $100.00");
        Assert.assertEquals(homePage.incomeAmountDisplay.getText(),"$100.00");
        Assert.assertEquals(homePage.expenseAmountDisplay.getText(),"$0.00");
    }

    /**
     * Verify user is able to edit the newly added account
     */
    @Test(dependsOnMethods = {"addNewAccount"})
    public void editAccount()  {
        homePage = new HomePage(driver);
        newAccountPage = new NewAccountPage(driver);
        viewTransactionDetailsPage = new ViewTransactionDetailsPage(driver);
        homePage.leftLinePanelOpen();
        viewTransactionDetailsPage.clickTransactionCategory();
        viewTransactionDetailsPage.clickTransactionAmount();
        newAccountPage.enterAccountName("Debit");
        newAccountPage.enterAccountInitialAmt("50");
        newAccountPage.clickBackButton();
        homePage.openSettingsPanel();
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.tap(PointOption.point(201, 635)).perform();
//        newAccountPage.clickBackButton();
//        homePage.clickPieGraph();
        homePage.waitForBalanceDisplay();
        Assert.assertEquals(homePage.balanceAmountDisplay.getText(),"Balance $50.00");
    }

    /**
     * Verify that user is able to delete the account
     */
    @Test(dependsOnMethods = {"addNewAccount","editAccount"})
    public void deleteAccount()  {
        homePage = new HomePage(driver);
        newAccountPage = new NewAccountPage(driver);
        viewTransactionDetailsPage = new ViewTransactionDetailsPage(driver);
        homePage.clickPieGraph();
//        homePage.clickBalanceAmount();
        viewTransactionDetailsPage.clickTransactionCategory();
        viewTransactionDetailsPage.clickTransactionAmount();
        newAccountPage.clickDeleteBtn();
        newAccountPage.clickDeleteConfirmBtn();
        homePage.waitForBalanceDisplay();
        homePage.clickBalanceAmount();
        homePage.waitForIncomeDisplay();
        Assert.assertEquals(homePage.balanceAmountDisplay.getText(),"Balance $0.00");
        Assert.assertEquals(homePage.incomeAmountDisplay.getText(),"$0.00");
        Assert.assertEquals(homePage.expenseAmountDisplay.getText(),"$0.00");
        teardown();
    }
}