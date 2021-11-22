package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ChallengingDomPage {

    private final WebDriver webDriver;
    private final By buttons = By.cssSelector("#content div.example div.row a.button");

    public ChallengingDomPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public List<String> getButtonLabels() {
        // Al traernos todos los botones del DOM, cada vez que se clicaba cambiaba su id y no
        // era lo que se buscaba porque los ids no son vinculantes a que el texto de los botones
        // cambiara. A vista del usuario no sería importante que supiera el id de los botones, sino
        // el texto a mostrar.
        List<WebElement> elements = webDriver.findElements(buttons);
        List<String> labels = new ArrayList<>(elements.size());
        for (WebElement element : elements) {
            String label = element.getText();
            labels.add(label);
        }
        return labels;
    }

    public void clickAButton() {
        webDriver.findElement(buttons).click();
    }
}
