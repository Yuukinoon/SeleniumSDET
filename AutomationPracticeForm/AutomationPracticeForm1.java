package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationPracticeForm1 {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");


        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");

        WebElement genderRadio = driver.findElement(By.xpath("//*[@id='gender-radio-1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", genderRadio);
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");


        WebElement element = driver.findElement(By.id("dateOfBirthInput"));
        element.click();


        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys("\n");


        WebElement hobbiesRadio1 = driver.findElement(By.cssSelector("#hobbies-checkbox-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobbiesRadio1);

        WebElement hobbiesRadio2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));

        JavascriptExecutor hobbiesRadio2Click = (JavascriptExecutor) driver;
        hobbiesRadio2Click.executeScript("arguments[0].click();", hobbiesRadio2);


        driver.findElement(By.id("currentAddress")).sendKeys("123 Main St, Springfield, USA");


        WebElement submitButton = driver.findElement(By.id("submit"));


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();


        Thread.sleep(5000);

        driver.quit();


    }

}