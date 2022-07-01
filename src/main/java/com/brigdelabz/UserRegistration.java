package com.brigdelabz;

import java.util.regex.Pattern;

public class UserRegistration<T> {
    public boolean validateFirstName(T firstName) {
        boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", (CharSequence) firstName));
        return result;
    }

    public boolean validateLastName(T lastName) {
        boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", (CharSequence) lastName));
        return result;
    }

    public boolean validateEmail(T emailID) {
        boolean result = (Pattern.matches("[^.][a-zA-Z\\d+_.-]{2,}[@][a-zA-Z]{2,}[.][a-z.]{2,}", (CharSequence) emailID));
        return result;
    }

    public boolean validateMobile(T mobile) {
        boolean result = (Pattern.matches("[789]{1}[\\d]{9}", (CharSequence) mobile));
        return result;
    }

    public boolean validatePassword(T password) {
        boolean result = Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]{8,})", (CharSequence) password);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to junit");
    }
}
