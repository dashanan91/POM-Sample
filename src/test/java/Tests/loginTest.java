package Tests;

import Pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {
WebDriver driver;
    loginPage loginPage_Instance = null;

    @BeforeTest
    public void initializingDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        loginPage_Instance = PageFactory.initElements(driver, loginPage.class);
    }

    @Test
    public void loginFunctionality(){

        loginPage_Instance.openLoginPage();
        loginPage_Instance.insertEmail("it.choudhary.rahul@gmail.com");
        loginPage_Instance.clickEmailContinueButton();
        loginPage_Instance.insertPassword("Rahul@1991");
        loginPage_Instance.clickContinue();
        loginPage_Instance.successfullLoginVerification("Rahul");
    }


}
