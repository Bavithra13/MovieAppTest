package LoginStepDef;

import LoginMethodPages.HomePage;
import LoginMethodPages.PopularPage;
import LoginMethodPages.SearchPages;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MovieDetailPageTestSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    SearchPages searchPages;
    PopularPage popularPage;

    @And("Movie heading check")
    public void MovieHeadingCheck(){
        homePage = new HomePage(driver);
        searchPages = new SearchPages(driver);
        popularPage = new PopularPage(driver);
        homePage.GetNavbarSectionClick(0);
        popularPage.GetMovieIconClick(0);

        //MOVIE HAEDING CHECK
        Assert.assertEquals(homePage.GetNoTimeHeading(), "No Time to Die");
        //Watch time search visible or not
        Assert.assertEquals(homePage.GetWatchTimeSearch(), "2h 43m");
        // sensor check
        Assert.assertEquals(homePage.GetSensorTimeSearch(), "U/A");
        //Date check
        Assert.assertEquals(homePage.GetDateTimeSearch(), "2021");
        //Paragraph check
        Assert.assertEquals(homePage.GetParagraphSearch(), "Bond has left active service and is enjoying a tranquil life in Jamaica. His peace is short-lived when his old friend Felix Leiter from the CIA turns up asking for help. The mission to rescue a kidnapped scientist turns out to be far more treacherous than expected, leading Bond onto the trail of a mysterious villain armed with dangerous new technology.");
        //Play Button Display or not
        Assert.assertTrue(homePage.GetPlayButtonDisplay(), "play button visible or not");
        //Genres Text Test
        Assert.assertEquals(homePage.GetGenresTextTest(), "Genres");
        System.out.println(homePage.GetGenresTextTest());
        //Audio Available Text Test
        Assert.assertEquals(homePage.GetAudioAvailable(), "Audio Available");
        System.out.println(homePage.GetAudioAvailable());
        //Rating Count check
        Assert.assertEquals(homePage.GetRatingCountText(), "Rating Count");
        System.out.println(homePage.GetRatingCountText());
        //Budget Text Test
        Assert.assertEquals(homePage.GetBudgetText(), "Budget");
        System.out.println(homePage.GetBudgetText());
        //Rating Average Text
        Assert.assertEquals(homePage.GetRatingAverageText(), "Rating Average");
        System.out.println(homePage.GetRatingAverageText());
        //ReleaseDate Text
        Assert.assertEquals(homePage.GetReleaseDateText(), "Release Date");
        System.out.println(homePage.GetReleaseDateText());
        //More like this
        Assert.assertEquals(homePage.GetMoreLikeThisText(), "More like this");
        System.out.println(homePage.GetMoreLikeThisText());
        // List Item Check
        String[] ListNameText = {"Adventure", "Action", "Thriller", "Spanish", "French", "English", "Italian", "Russian", "1396", "7.5", "24.2 Crores", "29th September 2021"};
        for (int i = 0; i < 12; i++) {
            Assert.assertEquals(homePage.GetListContainer(i), ListNameText[i], "Adventure");
            System.out.println(homePage.GetListContainer(i));
        }
        int size = 38;
        Assert.assertEquals(homePage.GetLikeMovie(), size, "Movies visible or not");
        System.out.println(homePage.GetLikeMovie());

        //In the Popular Page click on any Movie and test all the UI elements present in it
        homePage.GetNavbarSectionClick(1);
        homePage.GetMovieVisible(0);









    }




}
