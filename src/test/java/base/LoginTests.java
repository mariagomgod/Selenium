package base;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
       LoginPage loginPage = homePage.clickFormAuthentication();
       loginPage.setUsernameField("tomsmith");
       loginPage.setPasswordField("SuperSecretPassword!");
       Thread.sleep(2000);

       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       Thread.sleep(2000);
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }
}
