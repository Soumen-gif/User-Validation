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
        UserValidation userRegistration = new UserValidation();
        boolean result = userRegistration.validateFirstName("soumen");
        Assert.assertEquals(false, result);
    }


}
