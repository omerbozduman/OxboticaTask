package com.calculator.pages;

import com.calculator.utilities.BrowserUtils;
import com.calculator.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalculatorPage extends BasePage{

    @FindBy(id="selectBuild")
    public WebElement buildOption;

    @FindBy(id="number1Field")
    public WebElement firstNumber;

    @FindBy(id="number2Field")
    public WebElement secondNumber;

    @FindBy(id="selectOperationDropdown")
    public List<WebElement> operationOptions;

    @FindBy(id="calculateButton")
    public WebElement calculateButton;

    @FindBy(id="numberAnswerField")
    public WebElement answerBox;

    @FindBy(id="clearButton")
    public WebElement clearButton;


    public void selectBuildOption(String option){

        buildOption.click();

        String locator="//select[@id='selectBuild']/option[contains(text(),'"+option+"')]";

        WebElement element = Driver.get().findElement(By.xpath(locator));

        element.click();
    }

    public void sendFirstNumber(String number1){
        firstNumber.sendKeys(number1);
    }
    public void sendSecondNumber(String number2){
        secondNumber.sendKeys(number2);
    }

    public void selectOperationType(String operationType){

        String locator = "//select[@id='selectOperationDropdown']/option[contains(text(),'"+operationType+"')]";

        WebElement element= Driver.get().findElement(By.xpath(locator));
        element.click();
    }
    public String getResult(){
        BrowserUtils.waitFor(2);
        System.out.println(answerBox.getAttribute("value"));
        return answerBox.getAttribute("value");
    }


}
