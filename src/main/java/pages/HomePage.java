package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos de Homepage (consulta)
    private final By shiftingContent = By.cssSelector("#content ul li a[href=\"/shifting_content\"]");

    private final By multipleWindows = By.cssSelector("#content ul li a[href=\"/windows\"]");

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By challengingDom = By.cssSelector("#content ul li a[href=\"/challenging_dom\"]");

    private final By contextMenu = By.cssSelector("#content ul li a[href=\"/context_menu\"]");


    // Acciones sobre Homepage
    public ShiftingContentPage clickShiftingContent() throws InterruptedException {
        driver.findElement(shiftingContent).click();
        Thread.sleep(2000);
        return new ShiftingContentPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows() throws InterruptedException {
        driver.findElement(multipleWindows).click();
        Thread.sleep(2000);
        return new MultipleWindowsPage(driver);
    }

    public LoginPage clickFormAuthentication() throws InterruptedException {
        driver.findElement(formAuthenticationLink).click();
        Thread.sleep(2000);
        return new LoginPage(driver);
    }

    public ChallengingDomPage clickChallengingDomPage() throws InterruptedException {
        driver.findElement(challengingDom).click();
        Thread.sleep(2000);
        return new ChallengingDomPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        driver.findElement(contextMenu).click();
        return new ContextMenuPage(driver);
    }
}
