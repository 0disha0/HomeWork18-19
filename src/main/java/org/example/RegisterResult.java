package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResult extends Utils{

    private By _message = By.className("result");//Declaring data type and storing the value in it

    //this method to verify user register successfully and matching the results with expected and actual
    public void toVerifyUserShouldBeRegisterSuccessfully() {
       WaitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",15);//the driver will wait for a while on the page
       Assert.assertEquals(getText(_message), "Your registration is completed","Actual and Expected results are not matching");
    }
}
