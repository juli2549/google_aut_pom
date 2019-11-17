package co.com.google.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {

    @FindBy(xpath = "//input[contains(@name,'q')]")
    public WebElement searchFileInput;

    @FindBy(xpath = "//div[contains(@jsname,'VlcLAe')]//input[contains(@name,'btnK')]")
    public WebElement googleSearchBtn;

    @FindBy(xpath = "//div[contains(@class,'aajZCb')][contains(@jsname,'aajZCb')]")
    public WebElement listSuggestions;

    public void searchThe(String sentence) {
        searchFileInput.sendKeys(sentence);
        googleSearchBtn.click();
    }

    public void searchBySuggestionWithThe(String sentence){
        searchFileInput.sendKeys(sentence);
        element(listSuggestions).waitUntilVisible().withTimeoutOf(10,SECONDS);
        List<WebElement> allWebElements =new ArrayList();
        int rows = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//div[contains(@class,'aajZCb')][contains(@jsname,'aajZCb')]/ul//li")).size();

        for (int i = 1; i < rows+1;i++){
            allWebElements.add(Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//div[contains(@class,'aajZCb')][contains(@jsname,'aajZCb')]/ul//li[" + i + "]")));
        }

        allWebElements.get(0).click();

    }


}
