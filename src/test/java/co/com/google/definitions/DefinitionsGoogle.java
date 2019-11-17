package co.com.google.definitions;

import co.com.google.steps.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class DefinitionsGoogle {

    @Steps
    NavegateTo navegateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchBySuggestionsFor searchBySuggestionsFor;

    @Steps
    SeeInTheFirstPosition seeInTheFirstPosition;

    @Steps
    SeeInTheTitle seeInTheTitle;

    @Given("^the user navigate to the homepage$")
    public void theUserNavigateToTheHomepage() {
        navegateTo.theGoogleHomePage();
    }

    @When("^the user search (.*) in google$")
    public void theUserSearchInGoogle(String sentence) {
        searchFor.the(sentence);
    }

    @When("^the user search (.*) in google using the suggestion list$")
    public void theUserSearchInGoogleBySuggestions(String sentence){
        searchBySuggestionsFor.the(sentence);
    }

    @Then("^the user see that the first result is (.*)$")
    public void theUserSeeThatTheFirstResultIs(String expectedResult) {
        assertThat(seeInTheFirstPosition.the(expectedResult).isEqualTo(true));
    }

    @Then("^the user see that the page showed after he clicked is (.*)$")
    public void iClickOnTheDesiredResultLink(String expectedTitle) {
        assertThat(seeInTheTitle.the(expectedTitle).isEqualTo(true));
    }


}
