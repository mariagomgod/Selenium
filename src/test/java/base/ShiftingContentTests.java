package base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ShiftingContentPage;
import pages.ExampleMenuElementPage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ShiftingContentTests extends BaseTests {

    @Test
    public void testSuccessfulElements() throws InterruptedException {
        ShiftingContentPage shiftingContent = homePage.clickShiftingContent();
        Thread.sleep(2000);
        ExampleMenuElementPage exampleMenuElement = shiftingContent.clickExampleMenuElement();
        Thread.sleep(2000);
        assertEquals(exampleMenuElement.findMenuElements().size(), 5);
    }
}

