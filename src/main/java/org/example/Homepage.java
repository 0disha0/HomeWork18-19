package org.example;
import org.testng.Assert;
import org.openqa.selenium.By;

public class Homepage extends Utils {

    //private By _registerPage= By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
    private By _registerPage= By.className("ico-register");//

   // private By _searchField = By.linkText("search-box-text ui-autocomplete-input");

    public void toVerifyUserCanOpenRegisterPageSuccessfully(){
        clickButton(_registerPage); // Uniquely identify the element within the web page and perform given action
    }
    public void toVerifyUserCanUseTheFeatureOfSearchField(){
       // typeText(_searchField,"if you wait");
    }
}
