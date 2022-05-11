package StepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.net.URL;

public class LoginSteps {

    WebDriver driver;

    @Given("Uzytkownik jest na stronie logowania")
    public void uzytkownik_jest_na_stronie_logowania() {
        //System.out.println("Otwarcie przegladarki i wpisanie adresu strony internetowej");
        System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @When("Uzytkownik w pole username wprowadza poprawna nazwe uzytkownika")
    public void uzytkownik_w_pole_username_wprowadza_poprawna_nazwe_uzytkownika() {
        //System.out.println("Uzytkownik wprowadzil poprawny login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");

    }
    @When("Uzytkownik wprowadza w pole password poprawne haslo")
    public void uzytkownik_wprowadza_w_pole_password_poprawne_haslo() {
        //System.out.println("Uzytkownik wprowadzil poprawne haslo");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

    }
    @When("Uzytkownik klika w przycisk Login")
    public void uzytkownik_klika_w_przycisk_login() {
        //System.out.println("Uzytkownik klikal przycisk login");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();

    }
    @Then("Uzytkownik zostaje poprawnie zalogowany")
    public void uzytkownik_zostaje_poprawnie_zalogowany() {
        //System.out.println("Uzytkownik zostal zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure",driver.getCurrentUrl());
        driver.close();

    }


    @Given("Uzytkownik jest na stronie logowania2")
    public void uzytkownik_jest_na_stronie_logowania2() {
        //System.out.println("Otwarcie przegladarki i wpisanie adresu strony internetowej");
        System.setProperty("webdriver.chrome.driver","C://ChromeDriver//chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @When("Uzytkownik w pole username wprowadza poprawna nazwe uzytkownika2")
    public void uzytkownik_w_pole_username_wprowadza_poprawna_nazwe_uzytkownika2() {
        //System.out.println("Uzytkownik wprowadzil poprawny login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");

    }
    @When("Uzytkownik wprowadza w pole password niepoprawne haslo")
    public void uzytkownik_wprowadza_w_pole_password_niepoprawne_haslo() {
        //System.out.println("Uzytkownik wprowadzil niepoprawne haslo");
        driver.findElement(By.id("password")).sendKeys("SuperSecret!");

    }
    @When("Uzytkownik klika w przycisk Login2")
    public void uzytkownik_klika_w_przycisk_login2() {
        //System.out.println("Uzytkownik klikal przycisk login");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();

    }
    @Then("Uzytkownik nie zostaje poprawnie zalogowany")
    public void uzytkownik_nie_zostaje_poprawnie_zalogowany() {
        Assert.assertEquals("https://the-internet.herokuapp.com/login",driver.getCurrentUrl());
        driver.close();

    }
}
