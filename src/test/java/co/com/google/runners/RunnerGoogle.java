package co.com.google.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/googleHomePageSearch.feature",
        glue = "co.com.google.definitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerGoogle {

}