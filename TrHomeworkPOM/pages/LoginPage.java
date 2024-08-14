package TrHomeworkPOM.pages;

import TrHomeworkPOM.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Driver {
    public  LoginPage(){

        //This initElements method will create all WebElements

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id="login-email")
    private WebElement ePosta;

    @FindBy(id="login-password-input")
    private WebElement sifre;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement girisYapButton;

    public void typeEPostaOnEPostaField(){
        ePosta.sendKeys("youremail@.com");
    }

    public void  typeEPostaOnSifreField(){
        sifre.sendKeys("yourpassword");
    }

    public void clickGirisYapButton(){
        girisYapButton.click();
    }
}
