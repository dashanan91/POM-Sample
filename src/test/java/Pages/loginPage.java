package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class loginPage {




    @FindBy(xpath="//span[@class='nav-line-2 ']")
    @CacheLookup
    WebElement Link_loginPage;

    @FindBy(id="ap_email")
    @CacheLookup
    WebElement TextField_Email;

    @FindBy(id="continue")
    @CacheLookup
    WebElement Button_Continue;

    @FindBy(id="ap_password")
    @CacheLookup
    WebElement TextField_Password;

    @FindBy(id="signInSubmit")
    @CacheLookup
    WebElement Button_SignIn;

    @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
    @CacheLookup
    WebElement LoggedInName;

    public void openLoginPage() {
        Link_loginPage.click();
    }
    public void insertEmail(String email){
        TextField_Email.sendKeys(email);
    }
    public void clickEmailContinueButton() {
        Button_Continue.click();
    }
    public void insertPassword(String password){
        TextField_Password.sendKeys(password);
    }
    public void clickContinue(){
        Button_SignIn.click();
    }
    public boolean successfullLoginVerification(String userName){
       if(LoggedInName.getText().contains(userName))
           return true;
       return false;
    }

    public void login(String email, String password, String userName){
        this.openLoginPage();
        this.insertEmail(email);
        this.clickEmailContinueButton();
        this.insertPassword(password);
        this.clickContinue();
        this.successfullLoginVerification(userName);
    }

}
