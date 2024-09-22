import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {
    private AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554"); 
        capabilities.setCapability("browserName", "Chrome"); // Set browser to Chrome
        capabilities.setCapability("chromedriverExecutable", "/path/to/chromedriver"); // Path to your ChromeDriver

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void amazonTest() {
        // 1. Open Amazon website
        driver.get("https://www.amazon.com");

        // 2. Assert homepage
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        assert actualTitle.contains(expectedTitle) : "Not on Amazon homepage";

        // 3. Search for "amazon warehouse deals today"
        driver.findElement(MobileBy.id("twotabsearchtextbox")).sendKeys("amazon warehouse deals today");
        driver.findElement(MobileBy.id("nav-search-submit-button")).click();

        // 4. Click the first item
        driver.findElement(MobileBy.xpath("//div[@data-component-type='s-search-result'][1]//a[@class='a-link-normal s-no-outline']")).click();

        // 5. Add to cart
        driver.findElement(MobileBy.id("add-to-cart-button")).click();

        // 6. Proceed to checkout (adjust based on actual Amazon flow)
        driver.findElement(MobileBy.id("hlb-ptc-btn-native")).click(); // Or similar ID for "Proceed to checkout"
        // ... further checkout steps if needed
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}