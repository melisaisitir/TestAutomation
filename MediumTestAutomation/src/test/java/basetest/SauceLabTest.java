package basetest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLabTest extends BaseTest {

    @Test
    public void CheckLoginWhenUsernameCorrectPasswordIncorrect(){
        driver.get ("https://www.saucedemo.com/");
        var username = driver.findElement (By.id ("user-name"));
        username.sendKeys ("standard_user");

        var password = driver.findElement (By.id ("password"));
        password.sendKeys ("1234");

        var LoginButton = driver.findElement (By.id ("login-button"));
        click (LoginButton,"login butonu");

        var error = driver.findElement (By.cssSelector ("[data-test=\"error\"]"));

        Assert.assertTrue (error.isDisplayed ());
    }

    @Test
    public void CheckLoginWhenUsernameInorrectPasswordCorrect(){
        driver.get ("https://www.saucedemo.com/");
        var username = driver.findElement (By.id ("user-name"));
        username.sendKeys ("userstandard");

        var password = driver.findElement (By.id ("password"));
        password.sendKeys ("secret_sauce");

        var LoginButton = driver.findElement (By.id ("login-button"));
        click (LoginButton,"login butonu");

        var error = driver.findElement (By.cssSelector ("[data-test=\"error\"]"));

        Assert.assertTrue (error.isDisplayed ());
    }

    @Test
    public void CheckLoginWhenUsernameCorrectPasswordCorrect(){
        driver.get ("https://www.saucedemo.com/");
        var username = driver.findElement (By.id ("user-name"));
        username.sendKeys ("standard_user");

        var password = driver.findElement (By.id ("password"));
        password.sendKeys ("secret_sauce");

        var LoginButton = driver.findElement (By.id ("login-button"));
        click (LoginButton,"login butonu");

        var Title = driver.findElement (By.cssSelector ("[data-test=\"title\"]"));

        Assert.assertTrue (Title.isDisplayed ());
    }

    @Test
    public void CheckLoginButtonActive(){
        driver.get ("https://www.saucedemo.com/");
        var username = driver.findElement (By.id ("user-name"));
        username.sendKeys ("standard_user");

        var password = driver.findElement (By.id ("password"));
        password.sendKeys ("secret_sauce");

        var LoginButton = driver.findElement (By.id ("login-button"));

        Assert.assertTrue(LoginButton.isEnabled(), "Login button should be inactive");
    }

    @Test
    public void CheckProductAddCart(){
        driver.get ("https://www.saucedemo.com/");
        var username = driver.findElement (By.id ("user-name"));
        username.sendKeys ("standard_user");

        var password = driver.findElement (By.id ("password"));
        password.sendKeys ("secret_sauce");

        var LoginButton = driver.findElement (By.id ("login-button"));
        click (LoginButton,"login butonu");

        var AddCartButton = driver.findElement (By.id("add-to-cart-sauce-labs-backpack"));
        click (AddCartButton,"Add to cart butonu");

        var CartLink = driver.findElement (By.cssSelector ("[data-test = \"shopping-cart-link\"]"));
        click (CartLink,"Cart butonu");

        Assert.assertTrue (driver.findElement (By.cssSelector ("[data-test = \"inventory-item\"]")).isDisplayed ());

    }

    @Test
    public void CheckShoppingProcess(){
        driver.get ("https://www.saucedemo.com/");
        var username = driver.findElement (By.id ("user-name"));
        username.sendKeys ("standard_user");

        var password = driver.findElement (By.id ("password"));
        password.sendKeys ("secret_sauce");

        var LoginButton = driver.findElement (By.id ("login-button"));
        click (LoginButton,"Login butonu");

        var AddCartButton = driver.findElement (By.id ("add-to-cart-sauce-labs-backpack"));
        click (AddCartButton,"Add to cart butonu");

        var CartLink = driver.findElement (By.cssSelector ("[data-test = \"shopping-cart-link\"]"));
        click (CartLink,"Cart butonu");

        var CheckoutButton = driver.findElement(By.id("checkout"));
        click (CheckoutButton,"Checkout butonu");

        var FirstName = driver.findElement (By.id ("first-name"));
        FirstName.sendKeys ("Jane");

        var LastName = driver.findElement (By.id ("last-name"));
        LastName.sendKeys ("Doe");

        var PostalCode = driver.findElement (By.id ("postal-code"));
        PostalCode.sendKeys ("34000");

        var ContinueButton = driver.findElement(By.id("continue"));
        click (ContinueButton,"Continue butonu");

        var FinishButton = driver.findElement(By.id("finish"));
        click (FinishButton,"Finish butonu");

        var CompleteHeader = driver.findElement (By.cssSelector ("[data-test = \"complete-header\"]"));

        Assert.assertTrue (CompleteHeader.isDisplayed ());

    }




}

