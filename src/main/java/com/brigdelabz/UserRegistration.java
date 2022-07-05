package com.brigdelabz;

import java.util.regex.Pattern;

public class UserRegistration<T> {
    public boolean validateFirstName (T firstName) throws InvalidInputExceptionError {
            boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", (CharSequence) firstName));
                if (result) {
                    return true;
                }
                throw new InvalidInputExceptionError("You enter Invalid First Name");
    }

    public boolean validateLastName(T lastName) throws InvalidInputExceptionError {
        boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", (CharSequence) lastName));
            if (result){
                return true;
            }
        throw new InvalidInputExceptionError("You Enter Invalid Last Name");
    }

    public boolean validateEmail(T emailID) throws InvalidInputExceptionError {
        boolean result = (Pattern.matches("[^.][a-zA-Z\\d+_.-]{2,}[@][a-zA-Z]{2,}[.][a-z.]{2,}", (CharSequence) emailID));
        if (result){
            return true;
        }
        throw new InvalidInputExceptionError("You Enter Invalid Email Name");
    }

    public boolean validateMobile(T mobile) throws InvalidInputExceptionError {
        boolean result = (Pattern.matches("[789]{1}[\\d]{9}", (CharSequence) mobile));
        if (result){
            return true;
        }
        throw new InvalidInputExceptionError("You Enter Invalid Mobile Number");
    }

    public boolean validatePassword(T password) throws InvalidInputExceptionError {
        boolean result = Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]{8,})", (CharSequence) password);
        if (result){
            return true;
        }
        throw new InvalidInputExceptionError("You Enter Invalid Password");
    }

    public static void main(String[] args) throws InvalidInputExceptionError {
        System.out.println("Welcome to junit");
        UserRegistration userRegistration = new UserRegistration();
        try {
            if (userRegistration.validateFirstName("sahil1!")){
                System.out.println("First Name is Save");
            }
        }catch (InvalidInputExceptionError e){
            System.out.println(e);
        }
    }
}
