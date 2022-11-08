package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class WaitTest extends BaseTests {

    @Test
    public void getTextFromLoadingPage(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        dynamicLoadingPage.clickOnExample2Link();
        dynamicLoadingPage.clickOnStartButtonandWait();
        Assert.assertEquals(dynamicLoadingPage.getTextFinally(),"Hello World!","Loading Error");
        System.out.println(dynamicLoadingPage.getTextFinally());
    }
}
