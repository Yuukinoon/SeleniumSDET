package homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class VerifyTextBoxIsEnable {

    @Test
    public void textBoxIsEnabled() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        boolean textbox = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
        Assert.assertFalse(textbox);
        WebElement enableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement enableMessage = driver.findElement(By.xpath("//p[@id='message']"));
        String enableMessageText = enableMessage.getText();
        String expectedEnableMessageText = "It's enabled!";
        System.out.println("Message is: " + enableMessageText);
        System.out.println("expected Message is: " + expectedEnableMessageText);
        Assert.assertEquals(expectedEnableMessageText, enableMessageText);
        Boolean textBox = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
        Assert.assertTrue(textBox);




    }



}
