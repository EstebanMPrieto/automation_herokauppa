package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlertsPage {

    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement jsAlertButton;

    @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    WebElement jsAlertButtonConfirm;

    @FindBy(id = "result")
    WebElement getResultText;

    @FindBy(xpath = "//button[contains(text(),'Click for JS Prompt')]")
    WebElement jsPromptButton;


    public JavaScriptAlertsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void jsAlertBottomClick(){
        jsAlertButton.click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void jsAlertBottomConfirmClick(){
        jsAlertButtonConfirm.click();
    }

    public void jsPromptButtonClick(){
        jsPromptButton.click();
    }

    public void setInputPromptAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResultText(){
        return getResultText.getText();

    }



}
