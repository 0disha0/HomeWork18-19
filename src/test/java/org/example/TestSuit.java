package org.example;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    Homepage homepage =new Homepage(); // calling a class to identify the homepage at testSuit
    RegisterPage registerPage = new RegisterPage();
    RegisterResult registerResult = new RegisterResult();

    @Test
    public void toVerifyUserShouldBERegisterSuccessfully() {


    }
}