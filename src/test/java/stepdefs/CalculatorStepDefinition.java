package stepdefs;

import Window.Calculator;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class CalculatorStepDefinition {
    @Before(" @TC001")
    public void setup() {
        System.out.println("open");
    }

    @After("@TC001")
    public static void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                System.out.println("Test case which got failed is " + scenario.getName());
                Robot awt_robot = new Robot();
                BufferedImage Entire_Screen = awt_robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                String Destination = "./ScreenShots/Entire_Screen.png";
                ImageIO.write(Entire_Screen, "PNG", new File(Destination));
                Reporter.addScreenCaptureFromPath("." + Destination);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("Test case which got passed is " + scenario.getName());
                Robot awt_robot = new Robot();
                BufferedImage Entire_Screen = awt_robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                String Destination = "./ScreenShots/Entire_Screen.png";
                ImageIO.write(Entire_Screen, "PNG", new File(Destination));
                Reporter.addScreenCaptureFromPath("." + Destination);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Calculator calc = calc = new Calculator();

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
            calc.enterEqual();
            calc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}


