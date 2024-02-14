package LoginStepDef;

import LoginMethodPages.AccountPages;
import LoginMethodPages.HomePage;
import LoginMethodPages.LoginPage;
import LoginMethodPages.PopularPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountPageTestSteps {
    WebDriver driver = Hooks.getDriver();
    LoginPage loginPage;
    AccountPages accountPages;
    HomePage homePage;
    PopularPage popularPage;

    @And("Account Icon visible or not")
    public  void AccountIcon(){
        loginPage = new LoginPage(driver);
        accountPages = new AccountPages(driver);
        homePage = new HomePage(driver);
        popularPage = new PopularPage(driver);
        accountPages.GetAvatarButton();

        String[] AccountText = {"Account"};
        for (int i = 0 ; i < 1;i++){
            Assert.assertEquals(accountPages.GetAccountText(i),AccountText[i],"Account");
            System.out.println(accountPages.GetAccountText(i));
        }
        String[] MemberName = {"Member ship","Plan details"};
        for (int i = 0 ; i < 2 ;i++){
            Assert.assertEquals(accountPages.GetMemberName(i),MemberName[i],"Name correct or wrong");
            System.out.println(accountPages.GetMemberName(i));
        }
        String username = "User name : rahul";
        for (int i = 0 ; i < 1 ; i++){
            Assert.assertEquals(accountPages.GetUserNameCheck(),username,"User name correct or wrong");
            System.out.println(accountPages.GetUserNameCheck());
        }
        String password = "Password : **********";
        for (int i = 0; i < 1; i++){
            Assert.assertEquals(accountPages.GetPasswordCheck(),password,"password correct or wrong");
            System.out.println(accountPages.GetPasswordCheck());
        }
        String PlanName = "Premium";
        for (int i = 0 ; i < 1; i++){
            Assert.assertEquals(accountPages.GetPremiumname(),PlanName,"planname correct or wrong");
            System.out.println(accountPages.GetPremiumname());
        }
        String ultraname = "Ultra HD";
        for (int i = 0; i < 1; i++){
            Assert.assertEquals(accountPages.GetUltraName(),ultraname,"ultra name correct or wrong");
            System.out.println(accountPages.GetUltraName());
        }
        String logoutname = "Logout";
        for (int i = 0 ; i <1;i++){
            Assert.assertEquals(accountPages.Getlogoutbuttonclicktext(),logoutname,"logout name correct or wrong");
            System.out.println(accountPages.Getlogoutbuttonclicktext());
        }
    }
    @Then("Account logout")
    public void AccountLogout(){
        accountPages.GetLogoutButtonclick();

    }
}
