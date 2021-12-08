package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions( glue = {"Stepdefs"}, features = {"src/test/resources/features"})
public class TestRunner {
    @Managed
    WebDriver driver;
}
