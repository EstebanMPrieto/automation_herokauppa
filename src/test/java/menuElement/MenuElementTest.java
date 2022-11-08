package menuElement;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MenuElementPage;
import pages.ShiftingContentPage;

public class MenuElementTest extends BaseTests {

    @Test
    public void clickMenuElement(){
        ShiftingContentPage shiftingContentPage = homePage.clickOnShiftingContent();
        MenuElementPage menuElementPage = shiftingContentPage.clickOnMenuElement();
        menuElementPage.randomPixelShiftClick();
    }
}
