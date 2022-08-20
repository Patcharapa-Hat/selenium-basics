import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
   public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tarn/Desktop/selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}

