package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProvider.ConfigFileReader;
import org.testng.Assert;
import pageClass.Dashboard;
import pageClass.LoginPage;

public class StepDefinition extends BaseUtil {
    private BaseUtil base;
    private LoginPage loginPage;
    private Dashboard dashboard;

    public StepDefinition(BaseUtil base) {
        this.base = base;
    }

    ConfigFileReader configFileReader = new ConfigFileReader();

    /* Launching Web browser & redirecting to sendinblue's login page */
    @Given("^User is on Login page$")
    public void InitializeTest() {
        configFileReader = new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver" , configFileReader.getDriverPath());
        BaseUtil.driver.get(configFileReader.getApplicationUrl());
    }

    @Then("^I click on create new account button on login page$")
    public void IclickOnCreateNewAccountButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickCreateNewAccountButton();
    }

    @And("^I enter signup details on register page$")
    public void IEnterSignUpDetailsOnRegisterPage() {
        loginPage = new LoginPage(driver);
        loginPage.enterRegisterationDetails();
    }

    @And("^I click on create now button on register page$")
    public void IClickOnCreateNowButtonOnRegisterPage() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.clickCreateNowButtonOnRegister();
    }

    @And("^I sign out from current user$")
    public void IClickOnNameDropdownOnDashboard() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.clickNameDropDownOnDashboard();
        dashboard.clickSignOutLink();
    }

    @And("^I enter username and password on login page$")
    public void IEnterUsernameAndPasswordOnLoginPage() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.enterEmailAndPasswordonLogin();
    }

    @And("^I click on login button on login page$")
    public void IClickOnLoginButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButtonOnLoginPage();
    }

    @And("^I click on left navigation icon$")
    public void IClickOnLeftNevigationIcon() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.clickleftNevigationIcon();
    }

    @And("^I select organisation tab from left panel$")
    public void ISelectOrgTab() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.selectOrgaisationInLeftPanel();
    }

    @And("^I create a new function under my organisation$")
    public void ICreateNewFunctionUnderMyOrganisation() throws InterruptedException {
        dashboard = new Dashboard(driver);
        dashboard.addNewFunctionInOrganisation();
    }

    @And("^I verify that new function has been created$")
    public void IVerifyNewFunctionCreated() throws InterruptedException {
        dashboard = new Dashboard(driver);
        Assert.assertTrue(dashboard.moreIconOfNewFunction());
    }

    /* Closing the browser after all scripts get executed */
    @And("^I close the browser$")
    public void iCloseTheBrowser() {
        driver.close();
        driver.quit();
    }
}