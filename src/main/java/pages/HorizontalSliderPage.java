package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {

    WebDriver driver;

    @FindBy(tagName = "input")
    WebElement slideBar;

    @FindBy(id = "range")
    WebElement rangeStatus;

    public HorizontalSliderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickSlideBar(){
        slideBar.click();
        slideBar.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT);
    }

    public String getTextRangeStatus(){
        return rangeStatus.getText();

    }


}
