package sliderBar;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class SliderBarTest extends BaseTests {

    @Test
    public void sliderBarTest() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickOnHorizontalSlider();
        horizontalSliderPage.clickSlideBar();
        Assert.assertEquals(horizontalSliderPage.getTextRangeStatus(),"4");
        System.out.println("The Horizontal Slider Set At " + horizontalSliderPage.getTextRangeStatus());
    }
}
