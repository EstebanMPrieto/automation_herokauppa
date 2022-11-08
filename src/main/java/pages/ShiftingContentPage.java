package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShiftingContentPage {

    final WebDriver driver;

    @FindBy(linkText = "Example 1: Menu Element")
    WebElement menuElement;

    public ShiftingContentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public MenuElementPage clickOnMenuElement(){
        menuElement.click();
        return new MenuElementPage(this.driver);
    }
}
