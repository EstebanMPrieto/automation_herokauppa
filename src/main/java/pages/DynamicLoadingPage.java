package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    WebDriver driver;

    @FindBy(linkText = "Example 2: Element rendered after the fact")
    WebElement example2Link;

    @FindBy(xpath = "//button[contains(text(),'Start')]")
    WebElement buttonStart;

    @FindBy(id = "finish")
    WebElement text;

    public DynamicLoadingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickOnExample2Link(){
        example2Link.click();
    }

    public void clickOnStartButtonandWait(){
        buttonStart.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(text));
    }

    public String getTextFinally(){
        return text.getText();
    }


}
