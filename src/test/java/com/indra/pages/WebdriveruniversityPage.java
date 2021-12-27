package com.indra.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@DefaultUrl("/Datepicker")

public class WebdriveruniversityPage extends BasePage{



    public WebdriveruniversityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='input-group-addon']")
    private WebElementFacade botonCalendario;

    public WebElementFacade getBotonCalendario() {
        return botonCalendario;
    }


    @FindBy(xpath = "(//th[@class='datepicker-switch' ])[1]")
    private WebElementFacade anioEnCalendario;

    public WebElementFacade getAnioEnCalendario() {
        return anioEnCalendario;
    }

    public WebElementFacade getAnioEnELCalendarioOficial() {
        return anioEnELCalendarioOficial;
    }

    @FindBy(xpath = "(//tr//th[@class='datepicker-switch'])[2]")
    private WebElementFacade anioEnELCalendarioOficial;

    @FindBy(xpath = "(//th[@class='next'])[2]")
    private WebElementFacade botonSiguienteCalendario;

    public WebElementFacade getBotonSiguienteCalendario() {
        return botonSiguienteCalendario;
    }

    public WebElementFacade getBotonPrevioCalendario() {
        return botonPrevioCalendario;
    }

    @FindBy(xpath = "(//th[@class='prev'])[2]")
    private  WebElementFacade botonPrevioCalendario;
}
