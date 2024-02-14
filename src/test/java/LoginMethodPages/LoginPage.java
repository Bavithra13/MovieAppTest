package LoginMethodPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By MainLogoText = By.className("login-website-logo");
    By LoginLogoText = By.className("sign-in-heading");
    By InputLevelText = By.className("input-label");
    By UserNameE1 = By.cssSelector("#usernameInput");
    By PassWordE1 = By.cssSelector("#passwordInput");
    By LoginButtonE1= By.xpath("/html/body/div/div/div[2]/form/button");
    By errormassage = By.className("error-message");




    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public boolean GetMainLogoText(){
        return driver.findElement(MainLogoText).isDisplayed();
    }
    public String GetLogoText(){
        return driver.findElement(LoginLogoText).getText();
    }
    public String GetInputLevel(int index){
        return driver.findElements(InputLevelText).get(index).getText();
    }
    public String GetLoginButtonText(){
        return driver.findElement(LoginButtonE1).getText();
    }


    public void GetUserNameE1 (String username){
        driver.findElement(UserNameE1).sendKeys(username);
    }
    public void GetPassWordE1(String password){
        driver.findElement(PassWordE1).sendKeys( password);
    }
    public void GetLoginButton(){
        driver.findElement(LoginButtonE1).click();
    }

    public String GetErrorMassage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errormassage));
        WebElement errorMassageE1 = driver.findElement(errormassage);
        return errorMassageE1.getText();
    }


    public void LoginToApplication(String username, String password){
        GetUserNameE1(username);
        GetPassWordE1(password);
        GetLoginButton();
    }

}
