package LoginMethodPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By HeadingText = By.className("movies-list-heading");
    By MethodPlayButton = By.className("home-movie-play-button");
    By MovieSection = By.cssSelector("div.slick-list a");
    By FoodSectionItem = By.className("footer-icons-container");
    By ContactSection = By.cssSelector("#root > div > div.home-bottom-container > div.footer-container > p");
    By TrendingMovie = By.xpath("//h1[text()='Trending Now']/following-sibling::div/descendant::img");
    By OriginalMovie = By.xpath("//h1[text()='Originals']/following-sibling::div/descendant::img");
    By HeaderMovieSection = By.className("website-logo");
    By HomePopularInput = By.className("nav-link");
    By AccountLogo = By.className("avatar-button");

    By NoTimeHeading = By.className("movie-title");
    By WatchTimeSearch = By.className("watch-time");
    By SensorTimeSearch = By.className("sensor-rating");
    By DateTimeSearch = By.className("release-year");
    By ParagraphSearch = By.className("movie-overview");
    By PlayButtonDisplay = By.className("play-button");
    By GenresTextTest = By.className("genres-heading");
    By AudioAvailable = By.className("audio-heading");
    By RatingCountText = By.className("rating-heading");
    By BudgetText = By.className("budget-heading");
    By RatingAverageText = By.className("rating-average-heading");
    By ReleaseDateText = By.className("release-date-heading");
    By MoreLikeThisText = By.className("similar-movies-heading");
    By ListContainer = By.className("category-paragraph");
    By MovieVisible = By.className("link-item");
    By LikeMovie = By.className("image-style");




    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String GetMainLogoText(int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HeadingText));
        return driver.findElements(HeadingText).get(index).getText();
    }
    public WebElement GetMethodPlayButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MethodPlayButton));
        return driver.findElement(MethodPlayButton);
    }
    public int GetMovieSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MovieSection));
        return driver.findElements(MovieSection).size();
    }

    public WebElement GetFoodSection(int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FoodSectionItem));
        return driver.findElements(FoodSectionItem).get(index);
    }

    public String GetContactSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContactSection));
        return driver.findElement(ContactSection).getText();
    }
    public int GetTrendingMovie (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(TrendingMovie));
        return driver.findElements(TrendingMovie).size();
    }

    public int GetOriginalMovie (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(OriginalMovie));
        return driver.findElements(OriginalMovie).size();
    }
    public boolean GetHeaderMovieSection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HeaderMovieSection));
        return driver.findElement(HeaderMovieSection).isDisplayed();
    }
    public String GetHomePopularInput(int index) {
        return driver.findElements(HomePopularInput).get(index).getText();
    }
    public void GetNavbarSectionClick(int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePopularInput));
        driver.findElements(HomePopularInput).get(index).click();
    }
    public void GetAccountLogoClick(int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountLogo));
        driver.findElements(AccountLogo).get(index).click();
    }



    public String GetNoTimeHeading() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NoTimeHeading));
        return driver.findElement(NoTimeHeading).getText();
    }

    public String GetWatchTimeSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WatchTimeSearch));
        return driver.findElement(WatchTimeSearch).getText();
    }

    public String GetSensorTimeSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SensorTimeSearch));
        return driver.findElement(SensorTimeSearch).getText();
    }

    public String GetDateTimeSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DateTimeSearch));
        return driver.findElement(DateTimeSearch).getText();
    }

    public String GetParagraphSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ParagraphSearch));
        return driver.findElement(ParagraphSearch).getText();
    }

    public boolean GetPlayButtonDisplay() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PlayButtonDisplay));
        return driver.findElement(PlayButtonDisplay).isDisplayed();
    }

    public String GetGenresTextTest() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(GenresTextTest));
        return driver.findElement(GenresTextTest).getText();
    }

    public String GetAudioAvailable() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AudioAvailable));
        return driver.findElement(AudioAvailable).getText();
    }

    public String GetRatingCountText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RatingCountText));
        return driver.findElement(RatingCountText).getText();
    }

    public String GetBudgetText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BudgetText));
        return driver.findElement(BudgetText).getText();
    }

    public String GetRatingAverageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RatingAverageText));
        return driver.findElement(RatingAverageText).getText();
    }

    public String GetReleaseDateText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ReleaseDateText));
        return driver.findElement(ReleaseDateText).getText();
    }

    public String GetMoreLikeThisText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MoreLikeThisText));
        return driver.findElement(MoreLikeThisText).getText();
    }

    public String GetListContainer(int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ListContainer));
        return driver.findElements(ListContainer).get(index).getText();
    }

    public void GetMovieVisible(int index) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MovieVisible));
        driver.findElements(MovieVisible).get(index).click();
    }

    public int GetLikeMovie(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LikeMovie));
        return driver.findElements(LikeMovie).size();
    }



















}
