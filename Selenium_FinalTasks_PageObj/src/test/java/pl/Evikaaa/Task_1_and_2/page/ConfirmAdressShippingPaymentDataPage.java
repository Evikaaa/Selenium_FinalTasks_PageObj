package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmAdressShippingPaymentDataPage {

    private WebDriver driver;

    public ConfirmAdressShippingPaymentDataPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//div[@class='col-xs-12']")
    private WebElement shippingMethodPresta;

    public void PrestaShop (){
        shippingMethodPresta.click();
    }

    @FindBy (xpath = "//button[@name='confirmDeliveryOption']")
    private WebElement setShippingContinueButton;

    public void shippingContinueButton(){setShippingContinueButton.click();}

    @FindBy (xpath = "//input[@id='payment-option-1']")
    private WebElement paymentCheck;

    public void choosePaymentMethod(){paymentCheck.click();}

    @FindBy (xpath = "//input[@id='conditions_to_approve[terms-and-conditions]']")
    private WebElement termsAndServices;

    public void agreedTermsAndServices(){termsAndServices.click();}

    @FindBy (xpath = "//button[@class='btn btn-primary center-block']")
    private WebElement definitiveOrderBtn;

    public void orderObligationToPay(){definitiveOrderBtn.click();}
}
