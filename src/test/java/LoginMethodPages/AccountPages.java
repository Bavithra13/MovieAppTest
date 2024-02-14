package LoginMethodPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AccountPages {
    WebDriver driver;
    WebDriverWait wait;
    By AvatarButton = By.className("avatar-button");
    By AccountHeading = By.className("account-heading");
    By MemberName = By.className("membership-heading");
    By UserNameCheck = By.className("membership-username");
    By PasswordCheck = By.className("membership-password");
    By Premiumname = By.className("plan-paragraph");
    By UltraName = By.xpath("//p[text()='Ultra HD']");
    By logoutbuttonclick = By.className("logout-button");

    public AccountPages(WebDriver driver){
        this.driver = driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void GetAvatarButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AvatarButton));
         driver.findElement(AvatarButton).click();
    }

    public String GetAccountText(int index){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountHeading));
       return driver.findElements(AccountHeading).get(index).getText();
    }
    public String GetMemberName(int index){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MemberName));
        return driver.findElements(MemberName).get(index).getText();
    }
    public String GetUserNameCheck(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameCheck));
        return driver.findElement(UserNameCheck).getText();
    }
    public String GetPasswordCheck(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordCheck));
        return driver.findElement(PasswordCheck).getText();
    }
    public String GetPremiumname(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Premiumname));
        return driver.findElement(Premiumname).getText();
    }
    public String GetUltraName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(UltraName));
        return driver.findElement(UltraName).getText();
    }
    public  String Getlogoutbuttonclicktext(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutbuttonclick));
        return driver.findElement(logoutbuttonclick).getText();
    }
    public void GetLogoutButtonclick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutbuttonclick));
         driver.findElement(logoutbuttonclick).click();
    }

}
