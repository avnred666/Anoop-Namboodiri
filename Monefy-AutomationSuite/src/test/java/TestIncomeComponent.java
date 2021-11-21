import org.testng.Assert;
import org.testng.annotations.Test;


public class TestIncomeComponent extends TestBase {
    HomePage homePage;
    NewIncomePage newIncomePage;
    ViewTransactionDetailsPage viewTransactionDetailsPage;

    /**
     * @throws Exception
     * Verify user can add a new income
     */
    @Test
    public void addNewIncome() throws Exception {
        setup();
        homePage = new HomePage(driver);
        newIncomePage = new NewIncomePage(driver);
        viewTransactionDetailsPage = new ViewTransactionDetailsPage(driver);
        homePage.clickAddIncome();
        newIncomePage.clickNumberButton(1);
        newIncomePage.clickNumberButton(0);
        newIncomePage.clickNumberButton(0);
        newIncomePage.clickChooseCategory();
        newIncomePage.clickSalaryCategory();
        homePage.waitForIncomeDisplay();
        Assert.assertEquals(homePage.balanceAmountDisplay.getText(),"Balance $100.00");
        Assert.assertEquals(homePage.incomeAmountDisplay.getText(),"$100.00");
        Assert.assertEquals(homePage.expenseAmountDisplay.getText(),"$0.00");
    }

    /**
     * Verify user can edit an existing income
     */
    @Test(dependsOnMethods = {"addNewIncome"})
    public void editIncome()  {
        homePage.clickBalanceAmount();
        viewTransactionDetailsPage.clickTransactionCategory();
        viewTransactionDetailsPage.clickTransactionAmount();
        newIncomePage.clearIncomeEntryField(3);
        newIncomePage.clickNumberButton(5);
        newIncomePage.clickNumberButton(0);
        newIncomePage.clickBackButton();
//        viewTransactionDetailsPage.clickLeftViewPanel();
        homePage.waitForBalanceDisplay();
        Assert.assertEquals(homePage.balanceAmountDisplay.getText(),"Balance $50.00");
//        Assert.assertEquals(homePage.incomeAmountDisplay.getText(),"$50.00");
//        Assert.assertEquals(homePage.expenseAmountDisplay.getText(),"$0.00");
    }

    /**
     * Verify user can delete an income
     */
    @Test(dependsOnMethods = {"addNewIncome","editIncome"})
    public void deleteIncome(){
//        homePage.clickBalanceAmount();
        viewTransactionDetailsPage.clickTransactionCategory();
        viewTransactionDetailsPage.clickTransactionAmount();
        newIncomePage.clickDeleteBtn();
        homePage.waitForBalanceDisplay();
        homePage.clickBalanceAmount();
        homePage.waitForIncomeDisplay();
        Assert.assertEquals(homePage.balanceAmountDisplay.getText(),"Balance $0.00");
        Assert.assertEquals(homePage.incomeAmountDisplay.getText(),"$0.00");
        Assert.assertEquals(homePage.expenseAmountDisplay.getText(),"$0.00");
        teardown();
    }
}
