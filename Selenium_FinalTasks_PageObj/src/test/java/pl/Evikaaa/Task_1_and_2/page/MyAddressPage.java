package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {

    private WebDriver driver;

    public MyAddressPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[data-link-action='add-address']")
    WebElement AddAddressBtn;

    public void setAddAddressBtn(){AddAddressBtn.click();}
}
