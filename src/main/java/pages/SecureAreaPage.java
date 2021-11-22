package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private final WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos de SecureArea (consulta)
    private final By statusAlert = By.id("flash");

    // Acciones sobre SecureArea
    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }
}
