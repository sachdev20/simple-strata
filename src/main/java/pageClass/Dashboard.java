package pageClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {


    public static Dashboard dashboard = new Dashboard();

    public Dashboard() {

    }

    public static Dashboard getInstance () {
        return dashboard;
    }

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    WebDriver driver;

    @FindBy(xpath = "//*[@class='am-fade ng-scope']")
    WebElement nameDropdownOnDashboard;

    @FindBy(xpath = "//*[text()='Sign Out']")
    WebElement signOutLinkOnDashboard;

    @FindBy(xpath = "//*[@class='md-icon-button md-button md-ink-ripple'][@aria-label='org menu']")
    WebElement leftNevigationIcon;

    @FindBy(xpath = "//*[@class='menu-bottom-title ng-binding'][text()='Organization']")
    WebElement organisationTabLeftPanel;

    @FindBy(xpath = "//*[@class='ease ng-scope add']")
    WebElement addFunctionIcon;

    @FindBy(xpath = "//*[@class='ng-binding'][span=' New ']")
    WebElement addNewFunctionSubIcon;

    @FindBy(xpath = "//*[@name='TeamName']")
    WebElement titleOfFunction;

    @FindBy(xpath = "//*[span='Create']")
    WebElement createButtonOnFunction;

    @FindBy(xpath = "//*[@class='vert-options-gray ng-scope']")
    WebElement moreIconOnNewFunction;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickNameDropDownOnDashboard() throws InterruptedException {
        nameDropdownOnDashboard.click();
        Thread.sleep(2000);
    }

    public void clickSignOutLink() throws InterruptedException {
        signOutLinkOnDashboard.click();
        Thread.sleep(3000);
    }

    public void clickleftNevigationIcon() throws InterruptedException {
        leftNevigationIcon.click();
        Thread.sleep(1000);
    }

    public void selectOrgaisationInLeftPanel() throws InterruptedException {
        organisationTabLeftPanel.click();
        Thread.sleep(5000);
    }

    public void addNewFunctionInOrganisation() throws InterruptedException {
        addFunctionIcon.click();
        Thread.sleep(1000);
        addNewFunctionSubIcon.click();
        Thread.sleep(2000);
        titleOfFunction.sendKeys("Automated Title");
        createButtonOnFunction.click();
        Thread.sleep(5000);
    }

    public boolean moreIconOfNewFunction(){
        return moreIconOnNewFunction.isDisplayed();
    }
}