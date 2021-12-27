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

    @FindBy(xpath = "(//th[@class='datepicker-switch' ])[1]")
    private WebElementFacade anioEnCalendario;

    @FindBy (xpath = "//span[@class='month']")
    private List<WebElementFacade> listaDeMesesEnCalendario;

    @FindBy(xpath = "(//th[@class='prev'])[2]")
    private  WebElementFacade botonPrevioCalendario;

    @FindBy(xpath = "(//tr//th[@class='datepicker-switch'])[2]")
    private WebElementFacade anioEnELCalendarioOficial;

    @FindBy(xpath = "(//th[@class='next'])[2]")
    private WebElementFacade botonSiguienteCalendario;

    @FindBy(xpath = "//div[@class='datepicker-days']")
    private WebElementFacade datePickerDays;

    @FindBy(xpath = "//div[@class='datepicker-days']//tbody//tr//td[@class='day']")
    private List<WebElementFacade> listadeDias;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElementFacade valorCajaFecha;





    public WebElementFacade getAnioEnCalendario() {
        return anioEnCalendario;
    }

    public WebElementFacade getAnioEnELCalendarioOficial() {
        return anioEnELCalendarioOficial;
    }

    public WebElementFacade getBotonSiguienteCalendario() {
        return botonSiguienteCalendario;
    }

    public WebElementFacade getBotonPrevioCalendario() {
        return botonPrevioCalendario;
    }

    public WebElementFacade getBotonCalendario() {
        return botonCalendario;
    }

    public List<WebElementFacade> getListaDeMesesEnCalendario() {
        return listaDeMesesEnCalendario;
    }

    public WebElementFacade getDatePickerDays() {
        return datePickerDays;
    }

    public List<WebElementFacade> getListadeDias() {
        return listadeDias;
    }

    public WebElementFacade getValorCajaFecha() {
        return valorCajaFecha;
    }
}
