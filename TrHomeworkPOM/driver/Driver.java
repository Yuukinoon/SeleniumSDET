package TrHomeworkPOM.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Driver {
    protected static WebDriver driver;
    SoftAssert softAssert;
    Actions actions;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.trendyol.com/");
        softAssert = new SoftAssert();

    }

    public static WebDriver getDriver(){
        return driver;
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
        softAssert.assertAll();
    }

    public void moveToElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void clickPopUp(WebElement element){
        element.click();
    }
}
