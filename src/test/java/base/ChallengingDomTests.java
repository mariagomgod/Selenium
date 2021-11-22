package base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ChallengingDomPage;

import java.util.List;

import static org.testng.Assert.assertNotEquals;

public class ChallengingDomTests extends BaseTests{

    @Test
    public void testChallengingDomButtons() throws InterruptedException {
        ChallengingDomPage challengingDomPage = homePage.clickChallengingDomPage();
        List<String> buttonLabelsBeforeClicking = challengingDomPage.getButtonLabels();
        Thread.sleep(1000);
        challengingDomPage.clickAButton();
        Thread.sleep(1000);
        List<String> buttonLabelsAfterClicking = challengingDomPage.getButtonLabels();
        assertNotEquals(buttonLabelsBeforeClicking, buttonLabelsAfterClicking);
    }
}
