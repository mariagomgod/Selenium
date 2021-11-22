package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {

    private final WebDriver driver;

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos de ShiftingContent (consulta)
    private final By exampleMenuElement = By.cssSelector("#content a[href=\"/shifting_content/menu\"]");

    // Acciones sobre ShiftingContent
    public ExampleMenuElementPage clickExampleMenuElement() {
        driver.findElement(exampleMenuElement).click();
        return new ExampleMenuElementPage(driver);
    }
}
