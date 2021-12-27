package com.indra.steps_definitions;

import com.indra.actions.WebdriveruniversityActions;
import com.indra.models.WebdriveruniversityModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class WebdriveruniversityStep {
    @Managed
    WebDriver driver;

    WebdriveruniversityActions webdriveruniversityActions = new WebdriveruniversityActions(driver);

    @Given("^el usuario esta en la seccion inicio de la pagina$")
    public void elUsuarioEstaEnLaSeccionInicioDeLaPagina() {
        webdriveruniversityActions.open();

    }


    @When("^despliega el calendario$")
    public void despliegaElCalendario() {
        webdriveruniversityActions.hacerClicEnCalendario();

    }

    @When("^ingresa la fecha$")
    public void ingresaLaFecha(List<WebdriveruniversityModels> webdriveruniversityModels) {
        webdriveruniversityActions.seleccionarFecha(webdriveruniversityModels.get(0));

    }

    @Then("^deberia poder ver los datos ingresados$")
    public void deberiaPoderVerLosDatosIngresados() {

    }











    }
