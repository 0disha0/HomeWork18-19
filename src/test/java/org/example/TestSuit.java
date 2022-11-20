package org.example;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    Homepage homepage =new Homepage(); // calling a class to identify the homepage at testSuit
    RegisterPage registerPage = new RegisterPage();
    RegisterResult registerResult = new RegisterResult();
    ElectronicPage electronicPage = new ElectronicPage();
    CameraPhotoPage cameraPhotoPage= new CameraPhotoPage();

    @Test
    public void toVerifyUserShouldBERegisterSuccessfully() {
        homepage.toVerifyUserCanOpenRegisterPageSuccessfully();// To open register page
        registerPage.registrationDetails(); // To enter details in registration page
        registerResult.toVerifyUserShouldBeRegisterSuccessfully();// to verify the results are matching with the actual
    }
    @Test
    public void verifyProductName() {
        homepage.navigateElectronicPage();
        electronicPage.navigateToCameraPage();
        cameraPhotoPage.toGetProductName();
    }

}