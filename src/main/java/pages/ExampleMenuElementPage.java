package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExampleMenuElementPage {

    private final WebDriver driver;

    public ExampleMenuElementPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos de ExampleMenuElement (consulta)
    private final By menuElements = By.cssSelector("#content ul li");

    // Acciones sobre ExampleMenuElement
    public List<WebElement> findMenuElements() {
        return driver.findElements(menuElements);
    }
}
