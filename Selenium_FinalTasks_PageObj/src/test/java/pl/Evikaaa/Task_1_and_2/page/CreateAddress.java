package pl.Evikaaa.Task_1_and_2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAddress {

    private WebDriver driver;

    public CreateAddress (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath="//input[@name='alias']")
        private WebElement inputAlias;
        @FindBy(xpath="//input[@name='address1']")
        private WebElement inputAddress;
        @FindBy(xpath="//input[@name='city']")
        private WebElement inputCity;
        @FindBy(xpath="//option[@value='17']")
        private WebElement inputCountry;
        @FindBy(xpath="//input[@name='postcode']")
        private WebElement inputPostal;
        @FindBy(xpath="//input[@name='phone']")
        private WebElement inputPhone;

        @FindBy (xpath="//*[contains(text(),'Save')]")
        private WebElement submitAddressBtn;

      public void enterDataAddress(String alias, String address, String city, String postal, String country, String phone){
          inputAlias.clear();
          inputAlias.sendKeys(alias);

          inputAddress.clear();
          inputAddress.sendKeys(address);

          inputCity.clear();
          inputCity.sendKeys(city);

          inputCountry.click();

          inputPostal.clear();
          inputPostal.sendKeys(postal);

          inputPhone.clear();
          inputPhone.sendKeys(phone);

          submitAddressBtn.click();
      }
}
