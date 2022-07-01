package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    static UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTest() {
        boolean actual1 = userRegistration.validateFirstName("Rohit");
        boolean actual2 = userRegistration.validateFirstName("Ro-hit");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateLastNameTest() {
        boolean actual1 = userRegistration.validateLastName("Sharma");
        boolean actual2 = userRegistration.validateLastName("Sharma.");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateEmailTest() {
        boolean actual1 = userRegistration.validateEmail("abc-100@yahoo.com");
        boolean actual2 = userRegistration.validateEmail(".rohit@gmail.com");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validateMobile() {
        boolean actual1 = userRegistration.validateMobile("7350310455");
        boolean actual2 = userRegistration.validateMobile("6395824158");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validatePassword() {
        boolean actual1 = userRegistration.validatePassword("Sahil@1233");
        boolean actual2 = userRegistration.validatePassword("sahil12");
        Assert.assertFalse(actual2);
        Assert.assertTrue(actual1);
    }
}
