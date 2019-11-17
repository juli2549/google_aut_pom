package co.com.google.steps;

import co.com.google.pageobjects.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class SearchFor {

    GoogleHomePage googleHomePage;

    @Step
    public void the(String sentence){
        googleHomePage.searchThe(sentence);
    }

}
