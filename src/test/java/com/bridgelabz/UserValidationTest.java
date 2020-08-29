package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void  givenFirstName_WhenProper_ShouldReturnTrue() {
       UserValidation uv=new UserValidation();
        boolean result = uv.validateFirstName("Soumen");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotCapital_ShouldReturnFalse() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateFirstName("soumen");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateLastName("Ghosh");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenLastName_MinimumThreeLetter_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateLastName("Ghos");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenNotStartWithSmallLetter_Return_False() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateEmail("Soumen@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenEndsWithComOrIn_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateEmail("soumen@gmail.com");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumber_PhnNoIsFollowedByCountryCode_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validatePhone("91 9932619681");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPhoneNumber_phnNoIsTenDigit_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validatePhone("91 9604445258");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_PasswordIsMinimumEightDigit_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validatePassword("Soumen18@");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_PasswordAtleastOneUpperCase_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validatePassword("Soumen42@");
        Assert.assertEquals(true, result);
    }

}
