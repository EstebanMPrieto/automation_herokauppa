package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
    private WebDriver driver;

    @FindBy(linkText = "Nested Frames")
    WebElement nestedFramesLink;
    public FramePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public NestedFramesPage clickOnNestedFrameLink(){
        nestedFramesLink.click();
        return new NestedFramesPage(driver);
    }


}
