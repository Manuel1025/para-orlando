package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BasePage extends PageObject {
    String nombreCiudad;


    public BasePage(WebDriver driver) {
        super(driver);
    }



}
