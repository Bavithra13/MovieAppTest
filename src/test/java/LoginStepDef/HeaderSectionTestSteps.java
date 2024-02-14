package LoginStepDef;

import LoginMethodPages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HeaderSectionTestSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;

    @Then("Website logo check")
    public void WebsiteLogoCheck(){
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.GetHeaderMovieSection(),"Movie Logo Visible or Not");
        System.out.println(homePage.GetHeaderMovieSection());
        //Test the Navbar element
        String[] ExpectPageUrl = {"Home","Popular"};
        for (int i = 0 ; i < 2; i++){
            System.out.println(homePage.GetHomePopularInput(i));
            Assert.assertEquals(homePage.GetHomePopularInput(i), ExpectPageUrl[i],"Home Section Text Match or did'not Match");
        }
        //Test the navigation to Home and Popular pages through elements in header section
        String[] HomeSectionUrl = {"https://qamoviesapp.ccbp.tech/","https://qamoviesapp.ccbp.tech/popular"};
        for (int i = 0 ; i < 2 ;i++){
            homePage.GetNavbarSectionClick(i);
            String CurrentUrl = driver.getCurrentUrl();
            Assert.assertEquals(CurrentUrl,HomeSectionUrl[i],"Home And Popular Section Work Or Not ");
        }
        //Test the navigation to account page through elements in header section
        String AccountSection = "https://qamoviesapp.ccbp.tech/account";
        for (int i = 0; i < 1; i++){
            homePage.GetAccountLogoClick(i);
            String CurrentUrl1 = driver.getCurrentUrl();
            Assert.assertEquals(CurrentUrl1,AccountSection,"Account page click or not");
            System.out.println(CurrentUrl1);
        }



    }
}
