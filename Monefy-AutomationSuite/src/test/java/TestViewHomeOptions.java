import org.testng.annotations.Test;

public class TestViewHomeOptions extends TestBase{
    HomePage homePage;

    /**
     * Test viewing of homepage data with different view options such as day/month
     */
    @Test
    public void viewOptions() throws Exception {
        setup();
        homePage = new HomePage(driver);
        homePage.clickLeftViewPanel();
        homePage.selectViewByDay();
        homePage.clickLeftViewPanel();
        homePage.selectViewByMonths();
        teardown();
    }
}
