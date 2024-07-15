package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MobilePhone {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bstackdemo.com/");
        List<WebElement> MobilePhones = driver.findElements(By.cssSelector(".shelf-item"));
        System.out.println("Mobile Phones Number: " + MobilePhones.size());
        
        driver.quit();
    }
}
