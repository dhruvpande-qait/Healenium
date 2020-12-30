import com.epam.healenium.PageAwareBy;
import com.epam.healenium.SelfHealingDriver;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHealenium {

    @Test
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();
        Config healeniumConfig = ConfigFactory.load("healenium.properties");
        SelfHealingDriver driver = SelfHealingDriver.create(delegate,healeniumConfig);
        driver.get("file:///home/qainfotech/Desktop/Html-css-day1-master/Day-2-%20using%20Bootstrap/login.html");
        driver.findElement(PageAwareBy.by("Login Page", By.id("signup"))).click();
    }
}
