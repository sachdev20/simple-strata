package pageClass;

import constants.CommonMethodsAndConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethodsAndConstants {

    public static LoginPage loginPage = new LoginPage();

    public LoginPage() {

    }

    public static LoginPage getInstance () {
        return loginPage;
    }

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    WebDriver driver;

    @FindBy(xpath = "//*[text()='Create now']")
    WebElement createNewButton;

    @FindBy(xpath = "//*[@name='organizationName']")
    WebElement orgNameOnRegister;

    @FindBy(xpath = "//*[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//*[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='input_5']")
    WebElement emailToRegister;

    @FindBy(xpath = "//*[@id='input_6']")
    WebElement passwordToRegister;

    @FindBy(xpath = "//*[text()='Agree About']")
    WebElement acceptConditionBox;

    @FindBy(xpath = "//*[text()='Create now']")
    WebElement createNowButtonOnRegister;

    @FindBy(xpath = "//*[@name='email']")
    WebElement loginEmail;

    @FindBy(xpath = "//*[@name='password']")
    WebElement loginPassword;

    @FindBy(xpath = "//*[span='Login']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCreateNewAccountButton() {
        createNewButton.click();
    }

    public void enterRegisterationDetails() {
        orgNameOnRegister.sendKeys("Test organisation - Automation");
        firstName.sendKeys("Automated First Name");
        lastName.sendKeys("Automated Last Name");
        emailToRegister.sendKeys("automatesimplestrataQA3@mailinator.com");
        passwordToRegister.sendKeys("SimpleQA@1234");
        acceptConditionBox.click();
    }

    public void enterEmailAndPasswordonLogin(){
        loginEmail.sendKeys("automatesimplestrataQA3@mailinator.com");
        loginPassword.sendKeys("SimpleQA@1234");
    }

    public void clickLoginButtonOnLoginPage() throws InterruptedException {
        loginButton.click();
        Thread.sleep(7000);
    }

    public void clickCreateNowButtonOnRegister() throws InterruptedException {
        createNowButtonOnRegister.click();
        Thread.sleep(10000);
    }
}