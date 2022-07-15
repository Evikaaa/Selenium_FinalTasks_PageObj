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

    @FindBy(xpath = "//*[@id=\"group_1\"]/option[1]")
    private WebElement sizeS;
    @FindBy(xpath = "//*[@id=\"group_1\"]/option[2]")
    private WebElement sizeM;
    @FindBy(xpath = "//*[@id=\"group_1\"]/option[3]")
    private WebElement sizeL;
    @FindBy(xpath = "//*[@id=\"group_1\"]/option[4]")
    private WebElement sizeXL;

    public void chooseSize(String size) {
        if (size.equals("S")) {
            sizeS.click();
        } else if (size.equals("M")) {
            sizeM.click();
        } else if (size.equals("L")) {
            sizeL.click();
        } else if (size.equals("XL")) {
            sizeXL.click();
        }
    }

//    @FindBy (xpath = "//option[@title='M']")
//    private WebElement size;
//
//    public void chooseSize () {
//        size.click();
//    }

    @FindBy (xpath = "//input[@name='qty']")
    private WebElement quantity;

    public void chooseQty (String qty) {
        quantity.clear();
        quantity.sendKeys(qty);
    }

//    public void chooseQty () {
//       quantity.clear();
//       quantity.sendKeys("2");
//    }

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
