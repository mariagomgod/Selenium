package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private final WebDriver driver;
    private final Actions actions;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void clickRightInTheBox() {
        WebElement box = driver.findElement(By.id("hot-spot"));
        actions.contextClick(box).perform();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
