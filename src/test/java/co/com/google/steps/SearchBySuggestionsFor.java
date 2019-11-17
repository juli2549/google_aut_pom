package co.com.google.steps;

import co.com.google.pageobjects.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class SearchBySuggestionsFor {

    GoogleHomePage googleHomePage;

    @Step
    public void the(String sentence){
        googleHomePage.searchBySuggestionWithThe(sentence);
    }

}
