package Tests;

import Pages.landingPage;
import Pages.loginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class landingPageTest extends loginTest{
    landingPage landingPage_Instance = null;

    @BeforeTest
    public void initializingElement(){
        landingPage_Instance = PageFactory.initElements(driver, landingPage.class);
    }

    @Test
    public void searchForCheapest(){
        loginPage_Instance.login("it.choudhary.rahul@gmail.com", "Rahul@1991", "Rahul");
        landingPage_Instance.searchForItem("5G Phone");

    }
}
