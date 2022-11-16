package org.example;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    Homepage homepage =new Homepage(); // calling a class to identify the homepage at testSuit
    RegisterPage registerPage = new RegisterPage();
    RegisterResult registerResult = new RegisterResult();

    @Test
    public void toVerifyUserShouldBERegisterSuccessfully() {
        homepage.toVerifyUserCanOpenRegisterPageSuccessfully();// To open register page
        registerPage.registrationDetails(); // To enter details in registration page
        registerResult.toVerifyUserShouldBeRegisterSuccessfully();// to verify
    }
}