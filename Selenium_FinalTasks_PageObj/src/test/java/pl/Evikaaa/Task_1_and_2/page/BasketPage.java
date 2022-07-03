package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

        private WebDriver driver;

        public BasketPage (WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy (xpath = "//*[contains(text(),'Proceed to checkout')]")
        private WebElement proceedCheckoutBasketBtn;

        public void btnProceedBasket(){proceedCheckoutBasketBtn.click();}
}
