package com.tsoft.bot.frontend.steps.compra;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pages.pages.compra.AutomationPractice;
import com.tsoft.bot.frontend.pages.pages.login.LoginAutomationPage;
import com.tsoft.bot.frontend.pages.pages.login.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.openqa.selenium.WebDriver;

public class BuySteps {
    private WebDriver driver;
    private final LoginPage login = new LoginPage(driver);
    private final AutomationPractice atPage = new AutomationPractice (driver);

    public BuySteps() {
        this.driver = Hook.getDriver();
    }

    @Dado("^Usuario ingresa pagina selecciona sign in ingresa su mail y selecciona Create an account \"([^\"]*)\"$")
    public void usuarioIngresaPaginaSeleccionaSignInIngresaSuMailYSeleccionaCreateAnAccount(String setNumberUrl) throws Throwable {
        login.enterUrl(setNumberUrl);
    }

    @Cuando("^Usuario ingresa sus credenciales \"([^\"]*)\"$")
    public void usuarioIngresaSusCredenciales(String setNumberCredentials) throws Throwable {
        login.login(setNumberCredentials);
    }

    @Y("^Se valida sus credenciales \"([^\"]*)\"$")
    public void seValidaSusCredenciales(String setNumberCredentials) throws Throwable {
        login.validarLogin(setNumberCredentials);
    }

    @Y("^Ingreso al apartado Women$")
    public void ingresoAlApartadoWomen() throws Throwable {
        atPage.clickButtonWomen();
    }

    @Y("^Agrego un productos al carrito$")
    public void agregoUnProductosAlCarrito() throws Throwable{
        atPage.agregarCarritoFadedShortSleeve();
    }

    @Entonces("^Valido que este el producto seleccionado$")
    public void validoQueEsteElProductoSeleccionado() throws Throwable{
        atPage.procederCheckout();
    }
}
