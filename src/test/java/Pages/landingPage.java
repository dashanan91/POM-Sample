package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class landingPage {
    @FindBy(xpath="//*[@id=\'twotabsearchtextbox\']")
    @CacheLookup
    WebElement TextField_Searchbar;

    public void searchForItem(String searchItem){
        TextField_Searchbar.sendKeys(searchItem);
        TextField_Searchbar.sendKeys(Keys.ENTER);
    }
}
