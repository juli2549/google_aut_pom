package co.com.google.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class ResultsPage extends PageObject {



    public String findFirstElement(){
        List<WebElement> webList = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.cssSelector("#res .S3Uucc"));
        List<String> allElements=new ArrayList();

        for(int i=0; i<webList.size(); i++) {
            allElements.add(webList.get(i).getText());
        }

        String firstElement = allElements.get(0);
        webList.get(0).click();
        return firstElement;
    }

    public String findTitle(){
        return Serenity.getWebdriverManager().getCurrentDriver().getTitle();
    }


}
