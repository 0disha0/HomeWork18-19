package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResult extends Utils{

    private By _message = By.className("result");

    public void toVerifyUserShouldBeRegisterSuccessfully() {
       WaitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",15);
       Assert.assertEquals(getText(_message), "Your registration is completed","Actual and Expected results are not matching");
    }
}
