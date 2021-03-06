package pl.Evikaaa.Task_1_and_2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.Evikaaa.Task_1_and_2.page.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Task2_OrderStepsPageObjectSteps {

    private WebDriver driver;
    private YourOrderIsConfirmedPage yourOrderIsConfirmedPage;

    @Given("I go to main")
    public void iGoToMain() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("I sign in")
    public void iSignIn() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
    }


    @Then("I login by {string} and {string}")
    public void iLoginByEmailAndPasswd(String email, String passwd) {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.logInData(email, passwd);
    }

    @When("I click clothes and I choose Hummingbird Printed Sweater")
    public void iClickClothesAndIChooseHummingbirdPrintedSweater() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clothes();

        FilterClothesPage filterClothesPage = new FilterClothesPage(driver);
        filterClothesPage.chooseHPSweater();
    }

    @And("I check discount {string}")
    public void iCheckDiscount(String discount) {
        String alertDiscount = driver.findElement(By.cssSelector("span[class='discount discount-percentage']")).getText();
        Assert.assertEquals(discount, alertDiscount);
    }

    @And("I choose {string} size and quantity {string} and I add item to cart")
    public void iChooseSizeAndQuantityAndIAddItemToCart(String size, String qty) {
        HPSweaterAttribute hpSweaterAttribute = new HPSweaterAttribute(driver);
        hpSweaterAttribute.chooseSize(size);
        hpSweaterAttribute.chooseQty(qty);
        hpSweaterAttribute.addCart();
        hpSweaterAttribute.btnProceedToBasket();
    }

    @Then("I checkout and confirm basket")
    public void iCheckoutAndConfirmBasket() {

        BasketPage basketPage = new BasketPage(driver);
        basketPage.btnProceedBasket();
    }

    @When("I confirm address")
    public void iConfirmAddress() {
        String addressIsVisible = driver.findElement(By.xpath("//span[@class='address-alias h4']")).getText();
        Assert.assertEquals("Kaer Trolde", addressIsVisible);
        driver.findElement(By.xpath("//button[@name='confirm-addresses']")).click();
    }

    @And("I choose PrestaShop and Pay by check")
    public void iChoosePrestaShopAndPayByCheck() {
        ConfirmAdressShippingPaymentDataPage confirmAdressShippingPaymentDataPage = new ConfirmAdressShippingPaymentDataPage(driver);

        confirmAdressShippingPaymentDataPage.PrestaShop();
        confirmAdressShippingPaymentDataPage.shippingContinueButton();

        confirmAdressShippingPaymentDataPage.choosePaymentMethod();
        confirmAdressShippingPaymentDataPage.agreedTermsAndServices();
        confirmAdressShippingPaymentDataPage.orderObligationToPay();
    }

    @Then("I take screenshot")
    public void iTakeScreenshot() throws IOException, AWTException, InterruptedException {
        YourOrderIsConfirmedPage yourOrderIsConfirmedPage = new YourOrderIsConfirmedPage(driver);
        yourOrderIsConfirmedPage.TakeScreenshot();
    }


    @When("I go to order history and check my order is {string}")
    public void iGoToOrderHistoryAndCheckMyOrder(String message) {

        MainPage mainPage = new MainPage(driver);
        mainPage.goMyAccount();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.checkHistoryOrder();

        String alertMessage = driver.findElement(By.xpath("//span[@class='label label-pill bright']")).getText();
        Assert.assertEquals(message, alertMessage);

        //por??wnianie nr zam??wienia

        /**
        yourOrderIsConfirmedPage = new YourOrderIsConfirmedPage(driver);

        //nie ma takiego elementu na stronie! szuka na bie????cej. Nr zam??wienia z poprzednich stron trzeba przechowa?? jako element LISTY
        String expectedOrderNr1 = yourOrderIsConfirmedPage.orderNumber1.getText();

        String actualOrderNr2 = driver.findElement(By.cssSelector("th[scope='row']")).getText();

        Assert.assertEquals(expectedOrderNr1, actualOrderNr2);
         */
    }

    @And("I close browser")
    public void iCloseBrowser() {
        driver.close();
    }
}


//         path to actual order nr and order price
//        actualPrice = driver.findElement(By.cssSelector("td[class='text-xs-right']"));
//        actualOrder = driver.findElement(By.cssSelector("th[scope='row']")).getText();