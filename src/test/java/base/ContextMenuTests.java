package base;

import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.junit.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() throws InterruptedException {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickRightInTheBox();
        String alertText = contextMenuPage.getAlertText();
        Thread.sleep(1000);
        assertEquals(alertText, "You selected a context menu");
    }
}
