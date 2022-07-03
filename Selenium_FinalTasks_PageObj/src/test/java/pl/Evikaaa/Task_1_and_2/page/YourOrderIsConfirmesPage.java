package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourOrderIsConfirmesPage {

    private WebDriver driver;

    public YourOrderIsConfirmesPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[contains(text(),'Order reference')]")
    private WebElement orderNumber;

    public void getOrderNumber(){orderNumber.getText();}

    @FindBy (xpath = "//div[@class='col-xs-5 text-xs-right bold']")
    private WebElement paymentAmount;

    public void getPaymentPrice(){paymentAmount.getText();}
}
