package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class demoqaVisibleButton {
    @Test
    public void visibleButton() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");
        WebElement visibleButton = driver.findElement(By.cssSelector("#visibleAfter"));
        visibleButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Boolean visibleButton1 = driver.findElement(By.cssSelector("#visibleAfter")).isDisplayed();
        Assert.assertTrue(visibleButton1);

    }


}
