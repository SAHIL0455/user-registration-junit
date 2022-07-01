package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
    public void validateMobileTest() {
        boolean actual1 = userRegistration.validateMobile("7350310455");
        boolean actual2 = userRegistration.validateMobile("6395824158");
        Assert.assertTrue(actual1);
        Assert.assertFalse(actual2);
    }

    @Test
    public void validatePasswordTest() {
        boolean actual1 = userRegistration.validatePassword("Sahil@1233");
        boolean actual2 = userRegistration.validatePassword("sahil12");
        Assert.assertFalse(actual2);
        Assert.assertTrue(actual1);
    }

    @Test
    public void validateEmailsTest() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc@yahoo.com");
        list.add("abc-100@yahoo.com");
        list.add("abc.100@yahoo.com");
        list.add("abc111@abc.com");
        list.add("abc-100@abc.net");
        list.add("abc.100@abc.com.au");
        list.add("abc@gmail.com.com");
        list.add("abc+100@gmail.com");
        for (int i = 0; i < list.size(); i++) {
            boolean result = userRegistration.validateEmail(list.get(i));
            Assert.assertTrue(result);
        }
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");
        list1.add("abc@.com.my");
        list1.add("abc123@gmail.a");
        list1.add("abc123@.com");
        list1.add("abc123@.com.com");
        list1.add(".abc@abc.com");
        list1.add("abc()*gmail.com");
        list1.add("abc@%*.com");
        list1.add("abc@abc@gmail.com");
        list1.add("abc@gmail.com.1a");
        for (int i = 0; i < list1.size(); i++) {
            boolean result = userRegistration.validateEmail(list1.get(i));
            Assert.assertFalse(result);
        }
    }
}
