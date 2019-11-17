package co.com.google.steps;

import co.com.google.pageobjects.ResultsPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.AbstractBooleanAssert;

import static org.assertj.core.api.Assertions.assertThat;
public class SeeInTheFirstPosition {

    ResultsPage resultsPage;

    @Step
    public AbstractBooleanAssert<?> the(String expectedResult)  {
            return assertThat(resultsPage.findFirstElement().matches(expectedResult));
    }

}
