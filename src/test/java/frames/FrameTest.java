package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.NestedFramesPage;

public class FrameTest extends BaseTests {

    @Test
    public void getTextFromLeftFrame(){
        FramePage framePage = homePage.clickOnFrameLink();
        NestedFramesPage nestedFramesPage = framePage.clickOnNestedFrameLink();
        Assert.assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","Cannot Read");
        System.out.println(nestedFramesPage.getLeftFrameText());
    }

    @Test
    public void getTextFromBottomFrame(){
        FramePage framePage = homePage.clickOnFrameLink();
        NestedFramesPage nestedFramesPage = framePage.clickOnNestedFrameLink();
        Assert.assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Cannot Read");
        System.out.println(nestedFramesPage.getBottomFrameText());
    }
}
