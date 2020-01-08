import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
    WebDriver driver;

    public boolean isWindows= System.getProperty("os.name").toLowerCase().startsWith("windows");

    @BeforeEach
    public void setup() {
        if(isWindows){
            System.setProperty("webdriver.chrome.driver", "resources/win/chromedriver.exe");
        }else{
            System.setProperty("webdriver.chrome.driver", "resources/mac/chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.get("https://amazon.com");
    }

    @Test
    public void search() {
    }

    @Test
    public void addToCart() {

    }

    public void terdown() {

    }
}
