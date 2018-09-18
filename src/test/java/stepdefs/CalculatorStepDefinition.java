package stepdefs;

import Window.Calculator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefinition {

    Calculator calc = calc = new Calculator();

    @Given("^user opens calculator application$")
    public void userOpensCalculatorApplication() throws InterruptedException {

    }

    @When("^User enter first number$")
    public void userEnterFirstNumber() {

        calc.enter3();


    }

    @And("^User enter plus operator$")
    public void userEnterPlusOperator() {
        try {
            calc.enterOperator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^User enters second number$")
    public void userEntersSecondNumber() {
        try {
            calc.enter9();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^User gets result$")
    public void userGetsResult() {
        try {
            //comment
            calc.enterEqual();
           calc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ///

    }


    }





