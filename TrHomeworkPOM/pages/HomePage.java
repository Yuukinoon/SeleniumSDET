package TrHomeworkPOM.pages;

import TrHomeworkPOM.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Driver{
    @FindBy(css = ".modal-close")
    private WebElement homePagePopup;

    @FindBy(xpath = "//p[contains(text(),'Giris Yap')]")
    private WebElement girisYapIcon;

    @FindBy(css = ".login-button")
    private WebElement girisYapButton;

    public HomePage(){

        //This initElements method will create all WebElements

        PageFactory.initElements(Driver.getDriver(), this);;

    }
    public void clickPopUp(){
        clickPopUp(homePagePopup);

    }

    public void hoverOverGirisYapIcon(){
        moveToElement(girisYapIcon);
    }
    public void clickGirisYapIconUnderLoginDropDown(){
        girisYapButton.click();

    }

}
