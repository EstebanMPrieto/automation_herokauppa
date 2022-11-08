package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    final WebDriver driver;

    @FindBy(linkText = "Shifting Content")
    WebElement shiftingContentLink ;

    @FindBy(linkText = "Forgot Password")
    WebElement forgotPasswordLink;

    @FindBy(linkText = "Horizontal Slider")
    WebElement horizontalSliderLink;

    @FindBy(linkText = "JavaScript Alerts")
    WebElement javaScriptLink;

    @FindBy(linkText = "Frames")
    WebElement frameLink;

    @FindBy(linkText = "Dynamic Loading")
    WebElement dynamicLoadingLink;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public ShiftingContentPage clickOnShiftingContent(){
        shiftingContentLink.click();
        return new ShiftingContentPage(this.driver);
    }

    public HorizontalSliderPage clickOnHorizontalSlider(){
        horizontalSliderLink.click();
        return new HorizontalSliderPage(this.driver);
    }

    public FramePage clickOnFrameLink(){
        frameLink.click();
        return new FramePage(this.driver);
    }

    public ForgotPasswordPage clickOnForgotPassword(){
        forgotPasswordLink.click();
        return new ForgotPasswordPage(this.driver);
    }

    public JavaScriptAlertsPage clickOnJavaScriptLink(){
        javaScriptLink.click();
        return new JavaScriptAlertsPage(this.driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        dynamicLoadingLink.click();
        return new DynamicLoadingPage(this.driver);
    }


}
