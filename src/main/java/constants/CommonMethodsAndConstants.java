package constants;

import FileReader.CommonConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class CommonMethodsAndConstants {

    public static CommonMethodsAndConstants commonMethodsAndConstants = new CommonMethodsAndConstants();

    public CommonMethodsAndConstants(){

    }

    public static CommonMethodsAndConstants getInstance() {return commonMethodsAndConstants;}

    WebDriver driver;

    public CommonMethodsAndConstants(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static HashMap<String, String> hashMapCommonConfig = CommonConfigReader.DataReader();

    protected static String username_sagar = hashMapCommonConfig.get("Username");
    protected static String password_sagar = hashMapCommonConfig.get("Password");
    protected static String username_premium_user = hashMapCommonConfig.get("username_premium_user");
    protected static String password_premium_user = hashMapCommonConfig.get("password_premium_user");
    protected static String firstname = hashMapCommonConfig.get("firstname");
    protected static String lastname = hashMapCommonConfig.get("lastname");
    protected static String companyname = hashMapCommonConfig.get("companyname");
    protected static String address = hashMapCommonConfig.get("address");
    protected static String pincode = hashMapCommonConfig.get("pincode");
    protected static String city = hashMapCommonConfig.get("city");
    protected static String discountcouponstaging = hashMapCommonConfig.get("discountcouponstaging");
    protected static String campaignname = hashMapCommonConfig.get("campaignname");
    protected static String templatename =hashMapCommonConfig.get("templatename");
    protected static String subjectLine =hashMapCommonConfig.get("subjectLine");
    protected static String smscampaignname = hashMapCommonConfig.get("smscampaignname");
    protected static String qaworkflowName = hashMapCommonConfig.get("qaworkflowName");
    protected static String contactEmail = hashMapCommonConfig.get("contactEmail");
    protected static String retargetingRedirectionURL = hashMapCommonConfig.get("retargetingRedirectionURL");
    protected static String smsSenderNameToEnter = hashMapCommonConfig.get("smsSenderNameToEnter");
    protected static String smssender = hashMapCommonConfig.get("smssender");
    protected static String smsmessage = hashMapCommonConfig.get("smsmessage");
    protected static String searchname = hashMapCommonConfig.get("searchname");
    protected static String content = hashMapCommonConfig.get("content");
    protected static String emailGoogle = hashMapCommonConfig.get("emailGoogle");
    protected static String passwordGoogle = hashMapCommonConfig.get("passwordGoogle");
    protected static String recipientsCountOnRecipients;
    protected static String signup_email = hashMapCommonConfig.get("signup_email");
    protected static String signup_password = hashMapCommonConfig.get("signup_password");
    protected static String subjectA = hashMapCommonConfig.get("subjectA");
    protected static String subjectB = hashMapCommonConfig.get("subjectB");
}
