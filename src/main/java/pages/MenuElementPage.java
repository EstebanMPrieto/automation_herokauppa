package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenuElementPage {

    WebDriver driver;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/p[3]/a[1]")
    WebElement randomPixelShift;

    public MenuElementPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void randomPixelShiftClick(){
        randomPixelShift.click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());
    }

}
