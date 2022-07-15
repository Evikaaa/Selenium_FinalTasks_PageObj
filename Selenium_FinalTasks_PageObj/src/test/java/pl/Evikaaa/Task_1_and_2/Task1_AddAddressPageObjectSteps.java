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

import java.time.Duration;

public class Task1_AddAddressPageObjectSteps {

    private WebDriver driver;

    @Given("I go to main page")
    public void iGoToMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("I go to sign in")
    public void iGoToSignIn() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
    }


    @Then("I login using {string} and {string}")
    public void iLoginUsingEmailAndPasswd(String email, String passwd) {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.logInData(email, passwd);
    }


    @And("I go to my {string} page at my account page on url {string}")
    public void iGoToMyMyAccountPage(String page, String url) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.createAddress(page, url);
    }
//    @When("I go to my account page")
//    public void iGoToMyAccountPage() {
//        MyAccountPage accountPage = new MyAccountPage(driver);
//        accountPage.createAddress();
//    }

    @And("I go to create new address")
    public void iGoToCreateNewAddress() {
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        myAddressPage.setAddAddressBtn();
    }

    @And("^I enter new alias (.+) address (.+) city (.+) postal (.+) country (.+) phone (.+)$")
    public void iEnterNewAACPCP(String alias, String address, String city, String postal, String country, String phone) {
        CreateAddress createAddress = new CreateAddress(driver);
        createAddress.enterDataAddress(alias, address, city, postal, country, phone);
    }

    @Then("^I verify created alias (.+) address (.+) city (.+) postal (.+) country (.+) phone (.+)$")
    public void iVerifyCreatedAACPCP(String alias, String address, String city, String postal, String country, String phone) {

        //wpisany adres
        String actualAddress = driver.findElement(By.cssSelector(".address-body")).getText();
        String nameSurname = "Cirilla" + " " + "Riannon";
        String expectedAddress = String.join("\n", alias, nameSurname, address, city, postal, country, phone);
        Assert.assertEquals(expectedAddress, actualAddress);
    }

    @When("I remove the address")
    public void iRemoveTheAddress() {
        RemoveMyAddressPage removeAddressPage = new RemoveMyAddressPage(driver);
        removeAddressPage.clickRemoveAddressBtn();
    }

    @Then("I can see message that address was removed with text {string}")
    public void iCanSeeMessageThatAddressWasRemovedWithText(String message) {
        String alertMessage = driver.findElement(By.cssSelector("article[data-alert='success']")).getText();
        Assert.assertEquals(message, alertMessage);
    }


        @And("I close shop page")
        public void CloseShopPage()  {
            driver.quit();
        }
    }


