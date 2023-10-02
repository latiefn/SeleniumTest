import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/latief/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("Selenium WebDriver");

        searchBox.submit();

        WebElement searchResults = driver.findElement(By.id("search"));

        if (searchResults.isDisplayed()){
            System.out.println("Hasil ditampilkan");
        } else {
            System.out.println("Hasil tidak ditampilkan");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();
    }
}
