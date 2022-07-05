package com.brigdelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UserRegistrationTest {
    static UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstNameTest() {
        try {
            boolean actual1 = userRegistration.validateFirstName("Rohit1");
            Assert.assertTrue(actual1);
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateLastNameTest() {
        try {
            boolean actual1 = userRegistration.validateLastName("Sharma.");
            Assert.assertTrue(actual1);
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateEmailTest() {
        try {
            boolean actual1 = userRegistration.validateEmail("abc-100@yahoo.com");
            Assert.assertTrue(actual1);
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateMobileTest() {
        try {
            boolean actual1 = userRegistration.validateMobile("7350310455");
            Assert.assertTrue(actual1);
        } catch (InvalidInputExceptionError e) {
            System.out.println(e);
        }
    }

    @Test
    public void validatePasswordTest() {
        try {
            boolean actual1 = userRegistration.validatePassword("Sahil@1233");
            Assert.assertTrue(actual1);
        }catch (InvalidInputExceptionError e){
            System.out.println(e);
        }
    }

    @Test
    public void validateEmailsTest() {
        try {
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
        }catch (InvalidInputExceptionError e){
            System.out.println(e);
        }
    }
}
