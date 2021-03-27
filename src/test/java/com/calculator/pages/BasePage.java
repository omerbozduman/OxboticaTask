package com.calculator.pages;

import com.calculator.utilities.BrowserUtils;
import com.calculator.utilities.ConfigurationReader;
import com.calculator.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void setUp(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }


}
