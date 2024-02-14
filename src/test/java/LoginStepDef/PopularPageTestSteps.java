package LoginStepDef;

import LoginMethodPages.HomePage;
import LoginMethodPages.PopularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PopularPageTestSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    PopularPage popularPage;

    @And("login to the popular page")
    public void LoginPopularPage(){
        homePage = new HomePage(driver);
        popularPage = new PopularPage(driver);
        homePage.GetNavbarSectionClick(1);
        String ExpectedURL = "https://qamoviesapp.ccbp.tech/popular";
        String currecturl = driver.getCurrentUrl();
        Assert.assertEquals(currecturl,ExpectedURL,"url login or not");
        System.out.println(currecturl);

        int size = 30;
        for (int i = 0 ; i < 30; i++){
            Assert.assertEquals(popularPage.GetWatchMovie(),size,"More Then Movies Visilble");
            System.out.println(size);
            break;
        }
    }

    @And("Click on the movie icon")
    public void ClickMovieIcon(){
        popularPage.GetMovieIconClick(0);
    }


    @And("Venom name check")
    public void VenomMovieName(){
        String ExpectedName = "Venom";
        Assert.assertEquals(popularPage.GetVenomName(),ExpectedName,"Venom");
        System.out.println(popularPage.GetVenomName());
    }

    @Then("Home Page click")
    public void HomePageClick(){
        homePage.GetNavbarSectionClick(0);
    }
}
