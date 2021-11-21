import org.testng.annotations.Test;

public class TestCategoriesComponent extends TestBase {
    HomePage homePage;
    EditCategoryPage editCategoryPage;

    /**
     * @throws Exception
     * Verify user can edit an existing category
     */
    @Test
    public void editCategory() throws Exception {
        setup();
        homePage = new HomePage(driver);
        editCategoryPage = new EditCategoryPage(driver);
        homePage.openSettingsPanel();
        homePage.clickCategories();
        homePage.clickExistingCategory();
        editCategoryPage.editCategoryName("Edited");
        editCategoryPage.clickBackButton();
        teardown();
    }

    /**
     * @throws Exception
     * Verify user can delete a category
     */
    @Test(dependsOnMethods = {"editCategory"})
    public void deleteCategory() throws Exception {
        setup();
        homePage = new HomePage(driver);
        editCategoryPage = new EditCategoryPage(driver);
        homePage.openSettingsPanel();
        homePage.clickCategories();
        homePage.clickExistingCategory();
        editCategoryPage.deleteCategory();
        editCategoryPage.clickDeleteConfirmBtn();
        teardown();
    }

}
