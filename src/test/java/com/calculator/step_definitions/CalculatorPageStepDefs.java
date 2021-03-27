package com.calculator.step_definitions;

import com.calculator.pages.CalculatorPage;
import com.calculator.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalculatorPageStepDefs {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("I open the basic calculator page")
    public void i_open_the_basic_calculator_page() {
       calculatorPage.setUp();
      //  BrowserUtils.scrollToEndOfPage();
    }

    @Then("I select {string}")
    public void i_select(String option)  {
        calculatorPage.selectBuildOption(option);
    }
    @And("I send first {string}")
    public void iSendFirst(String number1) {
        calculatorPage.sendFirstNumber(number1);
    }
    @And("I send second {string}")
    public void iSendSecond(String number2) {
        calculatorPage.sendSecondNumber(number2);
    }
    String type;
    @Then("I select operation {string}")
    public void i_select_operation(String operationType)  {
        type=operationType;
        calculatorPage.selectOperationType(operationType);
    }
    @Then("I click calculate")
    public void i_click_calculate() {
        calculatorPage.calculateButton.click();
    }
    @Then("I verify answer is {string}")
    public void i_verify_answer_is(String result) {

        if(type.equals("Concatenate")){
            Assert.assertEquals(result,calculatorPage.getResult());
        }else {
            int expectedResult = Integer.parseInt(result);
            int actualResult = Integer.parseInt(calculatorPage.getResult());
            Assert.assertEquals(expectedResult, actualResult);
        }
    }


}
