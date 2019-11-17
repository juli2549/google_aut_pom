package co.com.google.steps;

import co.com.google.pageobjects.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class NavegateTo {

    GoogleHomePage googleHomePage;

    @Step
    public void theGoogleHomePage(){
        googleHomePage.open();
    }


}
