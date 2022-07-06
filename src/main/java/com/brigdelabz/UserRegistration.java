package com.brigdelabz;

import java.util.regex.Pattern;
interface IUserDatilsValidate{
    boolean validate(String input) throws InvalidInputExceptionError;
}
public class UserRegistration<T> {

     // using lambda Expression
     IUserDatilsValidate validateFirstName = firstName ->{
            boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", firstName));
                if (result) {
                    return true;
                }
                throw new InvalidInputExceptionError("You enter Invalid First Name");
    };

     IUserDatilsValidate validateLastName = lastName ->{
        boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", lastName));
            if (result){
                return true;
            }
        throw new InvalidInputExceptionError("You Enter Invalid Last Name");
    };

   IUserDatilsValidate validateEmail = emailID ->{
        boolean result = (Pattern.matches("[^.][a-zA-Z\\d+_.-]{2,}[@][a-zA-Z]{2,}[.][a-z.]{2,}", (CharSequence) emailID));
        if (result){
            return true;
        }
        throw new InvalidInputExceptionError("You Enter Invalid Email Name");
    };

    IUserDatilsValidate validateMobile = mobile ->{
        boolean result = (Pattern.matches("[789]{1}[\\d]{9}", (CharSequence) mobile));
        if (result){
            return true;
        }
        throw new InvalidInputExceptionError("You Enter Invalid Mobile Number");
    };

   IUserDatilsValidate validatePassword = password ->{
        boolean result = Pattern.matches("(?=.*?[A-Z])(?=.*?[!@#$^&*.])(?=.*?[0-9])([a-zA-Z\\d@*#$&,.]{8,})", password);
        if (result){
            return true;
        }
        throw new InvalidInputExceptionError("You Enter Invalid Password");
    };

    public static void main(String[] args) {
        System.out.println("Welcome to junit");
        UserRegistration userRegistration = new UserRegistration();
        try {
            if (userRegistration.validateFirstName.validate("sahil1!")){
                System.out.println("First Name is Save");
            }
        }catch (InvalidInputExceptionError e){
            System.out.println(e);
        }
        try {
            if (userRegistration.validateLastName.validate("pawar"));
            System.out.println("Last Name is save");
        }catch (InvalidInputExceptionError e){
            System.out.println(e);
        }
    }
}
