package steps.definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class MyStepdefs {

    private WebDriver driver;
    protected HomePage homePage;

    @Given("I go to main page")
    public void iGoToMainPage() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @When("I click on FormAuthentication link")
    public void iClickOnFormAuthenticationLink() throws InterruptedException {
        homePage.clickFormAuthentication();
    }

    @And("I fill the username")
    public void iFillTheUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("tomsmith");
    }

    @And("I fill password")
    public void iFillPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setPasswordField("SuperSecretPassword!");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("welcome message is displayed in SecureArea page")
    public void welcomeMessageIsDisplayedInSecureAreaPage() {
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }

    @After()
    public void quitBrowser() {
        driver.quit();
    }
}
