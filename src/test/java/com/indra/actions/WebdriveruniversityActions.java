package com.indra.actions;

import com.indra.models.WebdriveruniversityModels;
import com.indra.pages.WebdriveruniversityPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
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

    public void seleccionarFechaEnElCalendario(WebdriveruniversityModels webdriveruniversityModels){
        seleccionarAnioDelCalendario(webdriveruniversityModels);
        seleccionarMesyDiaDelCalendario(webdriveruniversityModels);
    }

    public void seleccionarAnioDelCalendario(WebdriveruniversityModels webdriveruniversityModels){
        getAnioEnCalendario().click();
        //System.out.println("+++++++anio del calendario +++++++++++++++"+getAnioEnELCalendarioOficial().getText());

        String anioseleccionar = webdriveruniversityModels.getAnio();

        System.out.println("año es "+anioseleccionar);


       String anioEnElCalendario = getAnioEnELCalendarioOficial().getText();

        for(int j=0; j<300;j++){
            getBotonSiguienteCalendario().waitUntilVisible();
            getBotonPrevioCalendario().waitUntilPresent();

            anioEnElCalendario=getAnioEnELCalendarioOficial().getText();

            int anioseleccionarConvertido = Integer.parseInt(anioseleccionar);//feature
            int anioEnElCalendarioConvertido = Integer.parseInt(anioEnElCalendario);//datepicker

            if(anioseleccionarConvertido<anioEnElCalendarioConvertido){
               getBotonPrevioCalendario().click();
            }
            else if (anioseleccionarConvertido>anioEnElCalendarioConvertido){
               getBotonSiguienteCalendario().click();
            }
            if(anioseleccionarConvertido==anioEnElCalendarioConvertido){
                break;
            }
        }
    }

    public void seleccionarMesyDiaDelCalendario(WebdriveruniversityModels webdriveruniversityModels){
        String mesSeleccionar = webdriveruniversityModels.getMes();
        String diaSeleccionar = webdriveruniversityModels.getDia();

        System.out.println(getListaDeMesesEnCalendario().size());


        for(int i = 0; i<=getListaDeMesesEnCalendario().size(); i ++){
            String mesEnCalendario = getListaDeMesesEnCalendario().get(i).getText();
            if(mesEnCalendario.equals(mesSeleccionar)){
                getListaDeMesesEnCalendario().get(i).click();
                break;
            }
        }
        getDatePickerDays().waitUntilPresent();
        for(WebElementFacade dia : getListadeDias()){
            if(diaSeleccionar.equals(dia.getText())){
                dia.click();
                break;
            }
        }
        System.out.println(getValorCajaFecha().getText());
        getDatePickerDays().waitUntilPresent();
    }

}



















