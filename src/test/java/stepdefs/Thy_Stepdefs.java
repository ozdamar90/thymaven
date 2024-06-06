package stepdefs;


import Base.ButtonControl;
import Base.WebControl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestConfig;
import utils.TestConfiguration;
import webdriver.Driver;
import java.util.List;




public class Thy_Stepdefs extends WebControl {


    @Given("user opens the homepage")
    public void userOpensTheHomepage() {
        TestConfig config = TestConfiguration.instance().getTestConfiguration();
        String url = config.getApplication().getUrl();
        Driver.getDriver().get(url);

    }

    @And("user clicks thee {string} button")
    public void userClicksTheeButton(String label) {


        ButtonControl.fromLabel(label, 1).click();


    }

    @And("user clicks thea {string} button")
    public void userClicksTheaButton(String label) {

        ButtonControl.fromLabel(label, 1).click();

    }

    @When("user fill form of the personel information")
    public void userFillFormOfThePersonelInformation(DataTable table) {
        TestConfig config = TestConfiguration.instance().getTestConfiguration();
        List<String> info = config.getThy().getInfo();

        List<String> list = table.asList();



        for (String s : list) {
            for (String s1 : info) {
                By locator = By.xpath("//button[@id='" + s + "']");
                sendKeys(locator,s1);

            }

            
        }
    }
}