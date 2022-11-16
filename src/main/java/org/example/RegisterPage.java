package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{

    private By _selectGender = By.id("gender-male");
    private By _firstName =By.id("FirstName");
    private By _lastName =By.id("LastName");
    private By _dateOfBirthDay= By.name("DateOfBirthDay");
    private By _dateOfBirthMonth= By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _email =By.id("Email");
    private By _companyName = By.name("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");

    public void registrationDetails(){
        clickButton(_selectGender); // It identifies the unique element by id and performs click action
        typeText(_firstName, "Daisha");  // It identifies the unique element by id and fill in FirstName field with "Test"
        typeText(_lastName, "TestAuto"); // It identifies the unique element by id and fill in LastName field with "TestAuto"
        selectListByValue(_dateOfBirthDay, "24"); // Identifies the unique element by xPath and selects Date of birth Day by "12"
        selectListByIndex(_dateOfBirthMonth, 12); // Identifies the unique element by xPath and selects Date of birth Month by "August"
        selectListByVisibleText(_dateOfBirthYear, "2001"); // Identifies the unique element by xPath and selects Date of birth Year by "1990"
        typeText(_email, "testMaven" + TimeStamp() + "@maven.com");// Identifies unique element by id and fill it with given user inputs - timeStamp is used in between so everytime we test it will be unique and accepts the data
        typeText(_companyName, "Unique Private ltd. "); // Identifies unique element by name and fill in Company field with user data "ABC Company"
        typeText(_password, "Dai1234");  // Identifies the unique element by id and fill the Password field with "abc1234"
        typeText(_confirmPassword, "Dai1234"); // Identifies the unique element by id and fill the ConfirmPassword field with "abc1234" with should be same as above
        clickButton(_registerButton); // Identifies unique element by id and click the Register button

    }

}
