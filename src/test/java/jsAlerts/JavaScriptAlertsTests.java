package jsAlerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class JavaScriptAlertsTests extends BaseTests {

    @Test

    public void alert_Test(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptLink();
        javaScriptAlertsPage.jsAlertBottomClick();
        javaScriptAlertsPage.acceptAlert();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You successfully clicked an alert","Incorrect Massage");
        System.out.println("Alert Test Massage");
        System.out.println("Result: " + javaScriptAlertsPage.getResultText() + "\n");
    }

    @Test
    public void dismissAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptLink();
        javaScriptAlertsPage.jsAlertBottomConfirmClick();
        javaScriptAlertsPage.dismissAlert();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You clicked: Cancel","Incorrect Massage");
        System.out.println("Dismiss Alert Test");
        System.out.println("Result: " + javaScriptAlertsPage.getResultText() + "\n");
    }

    @Test
    public void acceptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptLink();
        javaScriptAlertsPage.jsAlertBottomConfirmClick();
        javaScriptAlertsPage.acceptAlert();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You clicked: Ok","Incorrect Massage");
        System.out.println("Accept Alert Test");
        System.out.println("Result: " + javaScriptAlertsPage.getResultText() + "\n");
    }

    @Test
    public void sendInputPromptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptLink();
        javaScriptAlertsPage.jsPromptButtonClick();
        String txt = "Automation Alert Test";
        javaScriptAlertsPage.setInputPromptAlert(txt);
        javaScriptAlertsPage.acceptAlert();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You entered: " + txt,"Incorrect Massage");
        System.out.println("Input Prompt Alert Test");
        System.out.println("Result: " + javaScriptAlertsPage.getResultText() + "\n");
    }

    @Test
    public void dismissPromptAlert() {
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptLink();
        javaScriptAlertsPage.jsPromptButtonClick();
        String txt = "Automation Alert Test";
        javaScriptAlertsPage.setInputPromptAlert(txt);
        javaScriptAlertsPage.dismissAlert();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(), "You entered: null", "Incorrect Massage");
        System.out.println("Dismiss Prompt Alert");
        System.out.println("Result: " + javaScriptAlertsPage.getResultText() + "\n");
    }
}
