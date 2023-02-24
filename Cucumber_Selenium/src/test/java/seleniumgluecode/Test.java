package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
        String titleHomePage = "Testing | imalittletester";
        Assert.assertEquals(titleHomePage, driver.getTitle());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("comp-iiyocj9v5"));
        titleComicsLocator.click();

    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(By.xpath("//*[@id=\"comp-lc61aui31\"]/h2/span/span/span"));
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", pageTitleLocator.isDisplayed());
        Assert.assertEquals("HE LITTLE TESTER COMICS SERIES", pageTitleLocator.getText());

    }

}
