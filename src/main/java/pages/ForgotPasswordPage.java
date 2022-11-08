package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailBox;
    @FindBy(xpath = "//i[contains(text(),'Retrieve password')]")
    WebElement retrievePasswordLink;
    public ForgotPasswordPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void setEmail(){
        emailBox.sendKeys("test@test.com");
    }

    public void clickOnRetrievePassword(){
        retrievePasswordLink.click();
    }


}
