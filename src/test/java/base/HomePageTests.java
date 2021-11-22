package base;

import org.testng.annotations.Test;
import pages.MultipleWindowsPage;
import pages.OpeningANewWindowPage;

import static org.testng.Assert.assertEquals;

public class HomePageTests extends BaseTests{

    @Test
    public void testOpeningANewWindow() throws InterruptedException {
        MultipleWindowsPage multipleWindows = homePage.clickMultipleWindows();
        OpeningANewWindowPage openingANewWindow = multipleWindows.clickOpenANewWindow();
        String message = openingANewWindow.showNewWindowMessage();
        assertEquals(message, "New Window");
    }
}
