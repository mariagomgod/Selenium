package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class OpeningANewWindowPage {

    private final WebDriver driver;

    public OpeningANewWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos sobre OpeningANewWindow (consulta)
    private final By newWindowMessage = By.cssSelector("div.example h3");

    // Acciones sobre OpeningANewWindow
    public String showNewWindowMessage() {
        Set<String> windowHandles = driver.getWindowHandles(); // traemos todos los identificadores internos
        // que el navegador asigna a cada ventana abierta
        for (String windowHandle : windowHandles) { // recorremos los identificadores de las ventanas abiertas
            driver.switchTo().window(windowHandle); // cambiamos a la ventana con el identificador enésimo
            if ("New Window".equals(driver.getTitle())) {
                return driver.findElement(newWindowMessage).getText();
            }
        }
        return null; // no se encuentra ninguna ventana con el título New Window
    }
}
