package retrievePassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class RetrievePasswordTest extends BaseTests {

    @Test
    public void retrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickOnForgotPassword();
        forgotPasswordPage.setEmail();
        forgotPasswordPage.clickOnRetrievePassword();
        //the page does not exist, I can not make a verification
    }
}
