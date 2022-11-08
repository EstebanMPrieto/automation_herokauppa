package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesPage {
    WebDriver driver;

    private String leftFrame = "frame-left";

    private String topFrame = "frame-top";

    private String bottomFrame = "frame-bottom";

    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    private String getFrameText(){
        return body.getText();
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }
}
