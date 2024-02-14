package LoginStepDef;

import LoginMethodPages.HomePage;
import LoginMethodPages.SearchPages;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPageTestSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    SearchPages searchPages;

    @And("Search button click")
    public void SearchButton(){
        homePage = new HomePage(driver);
        searchPages = new SearchPages(driver);
        searchPages.GetSearchButtonClick();
    }
    @And("movie name search")
            public void MovieNameCheck(){
        String [] MoreThenURL = {"Avatar","Luca","Narnia","Squid Game","Black Widow","Free Guy"};
        int count = 0;
        for (int i1 = 0; i1 < MoreThenURL.length; i1++) {
            searchPages.ClickOnSearch(MoreThenURL[i1]);
            searchPages.GetVenommovieclick();
            Assert.assertEquals(searchPages.GetAvatarName(0),MoreThenURL[i1]);
            System.out.println(searchPages.GetAvatarName(0));
            searchPages.GetSearchButtonClick();
            //searchPages.ClearMovieName();
            count = count + 1;
            System.out.println(count);
        }
    }



}
