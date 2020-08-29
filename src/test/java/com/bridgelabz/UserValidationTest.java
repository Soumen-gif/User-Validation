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


}
