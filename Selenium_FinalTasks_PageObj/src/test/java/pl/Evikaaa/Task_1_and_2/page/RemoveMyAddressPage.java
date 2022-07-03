package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveMyAddressPage {

    private WebDriver driver;

    public RemoveMyAddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@data-link-action='delete-address']")
    WebElement removeAddressBtn;

    public void clickRemoveAddressBtn(){removeAddressBtn.click();}
}
