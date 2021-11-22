package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private final WebDriver driver;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos de MultipleWindows (consulta)
    private final By openANewWindow = By.cssSelector("#content a[href=\"/windows/new\"]");

    // Acciones sobre MultipleWindows
    public OpeningANewWindowPage clickOpenANewWindow() {
        driver.findElement(openANewWindow).click();
        System.out.println(driver.getWindowHandle());
        return new OpeningANewWindowPage(driver);
    }
}
