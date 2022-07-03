package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HPSweaterAttribute {

    private WebDriver driver;

    public HPSweaterAttribute (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//option[@title='M']")
    private WebElement size;

    public void chooseSize () {
        size.click();
    }

    @FindBy (xpath = "//input[@name='qty']")
    private WebElement quantity;

    public void chooseQty () {
       quantity.clear();
       quantity.sendKeys("2");
    }

    @FindBy (css = "button[class='btn btn-primary add-to-cart']")
    private WebElement addCartProduct;

    public void addCart () {
        addCartProduct.click();
    }

    @FindBy (xpath = "//*[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToBasket;

    public void btnProceedToBasket (){
        proceedToBasket.click();
    }
}
