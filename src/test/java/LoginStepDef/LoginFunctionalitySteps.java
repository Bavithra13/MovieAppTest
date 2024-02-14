package LoginStepDef;

import LoginMethodPages.HomePage;
import LoginMethodPages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginFunctionalitySteps {
    WebDriver driver = Hooks.getDriver();
    LoginPage loginPage;

    @Given("I am on the login page")
    public void IamOnTheLoginPage() {
        loginPage = new LoginPage(driver);
        driver.get("https://qamoviesapp.ccbp.tech");
    }

    @When("I check the Login Page Display the Movie And Movie Name")
    public void ICheckTheLoginPageDisplayTheMovieAndMovieName() {
        Assert.assertTrue(loginPage.GetMainLogoText(), "Logo image is not displayed");
        String expectedurl = "Login";
        Assert.assertEquals(loginPage.GetLogoText(), expectedurl, "Login page not matching");
        String[] expectedurl2 = {"USERNAME", "PASSWORD"};
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals(loginPage.GetInputLevel(i), (expectedurl2[i]), "Username not matching");
        }
        String CurrentUrl = "Login";
        Assert.assertEquals(loginPage.GetLoginButtonText(), CurrentUrl, "Text name not visible");
        System.out.println(loginPage.GetLoginButtonText());
    }

    @And("I click on the login button")
    public void IClickOnTheLoginButton() {
          loginPage.GetLoginButton();
    }
    @Then("The login functional with error massage")
    public void TheLoginFunctionalWithErrorMassage() {
        String Errormsg = loginPage.GetErrorMassage();
        Assert.assertEquals(Errormsg, "*Username or password is invalid");
    }

    @When("Empty Username")
    public void EmptyUsername() {
        loginPage.LoginToApplication("", "rahul@2021");
    }

    @When("Empty Password")
    public void EmptyPassword() {
        loginPage.LoginToApplication("rahul", "");
    }

    @When("Incorrect Password")
    public void IncorrectPassword() {
        loginPage.LoginToApplication("rahul", "rahul@2012");
    }

    @Then("Text error massage")
    public void TextErrorMassage() {
        Assert.assertEquals(loginPage.GetErrorMassage(), "*username and password didn't match");
    }

    @When("Incorrect Username")
    public void IncorrectUsername() {
        loginPage.LoginToApplication("rhul", "rahul@2012");
    }

    @Then("login error massage")
    public void LoginErrorMassage() {
        Assert.assertEquals(loginPage.GetErrorMassage(), "*invalid username");
    }

    @When("correct username and Password")
    public void CorrectUsernameAndPassword() {
        loginPage.LoginToApplication("rahul", "rahul@2021");
    }
        @Then("Navigate to home page")
        public void NavigateToHomePage () {
            String Expectedurl = "https://qamoviesapp.ccbp.tech/";
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlToBe(Expectedurl));
            String CurrentUrl = driver.getCurrentUrl();
            Assert.assertEquals(CurrentUrl, Expectedurl, "Navigate to home page url same");
        }

    }







