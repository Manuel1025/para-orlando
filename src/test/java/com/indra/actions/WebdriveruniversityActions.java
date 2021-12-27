package com.indra.actions;

import com.indra.models.WebdriveruniversityModels;
import com.indra.pages.WebdriveruniversityPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.vivaair.com/")

public class WebdriveruniversityActions extends WebdriveruniversityPage {

    public WebdriveruniversityActions(WebDriver driver) {
        super(driver);
    }

    public void hacerClicEnCalendario(){
        getBotonCalendario().click();
        //System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++"+getAnioEnCalendario().getText());
    }

    public void seleccionarFecha(WebdriveruniversityModels webdriveruniversityModels){
        getAnioEnCalendario().click();
        System.out.println("++++++++++++++++++++anio del calendario +++++++++++++++++++++++++++"+getAnioEnELCalendarioOficial().getText());

        String anioseleccionar = webdriveruniversityModels.getAnio();
        String mesSeleccionar = webdriveruniversityModels.getMes();
        String diaSeleccionar = webdriveruniversityModels.getDia();
        System.out.println("año es "+anioseleccionar+ "dia es "+diaSeleccionar+ "mes es "+mesSeleccionar);


        String anioEnElCalendario = getAnioEnELCalendarioOficial().getText();

        for(int j=0; j<300;j++){

            getBotonSiguienteCalendario().waitUntilVisible();
            getBotonPrevioCalendario().waitUntilPresent();
            anioEnElCalendario=getAnioEnELCalendarioOficial().getText();


            int anioseleccionarConvertido = Integer.parseInt(anioseleccionar);
            int anioEnElCalendarioConvertido = Integer.parseInt(anioEnElCalendario);


            if((anioseleccionarConvertido>anioEnElCalendarioConvertido) && (anioseleccionar.equals(anioEnElCalendario)))  {
                //(anioseleccionar.equals(anioEnElCalendario)
                break;
            }
            getBotonSiguienteCalendario().click();
        }

    }

}


















