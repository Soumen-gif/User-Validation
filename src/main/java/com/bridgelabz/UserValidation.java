package com.bridgelabz;
import java.util.regex.Pattern;

public class UserValidation {
    private static final String FirstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String LastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email = "^[a-z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    private static final String Phone_no = "^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$";
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FirstNamePattern);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LastNamePattern);
        return pattern.matcher(lastName).matches();
    }
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(Email);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhone(String phone_no) {
        Pattern pattern = Pattern.compile(phone_no);
        return pattern.matcher(phone_no).matches();
    }
}

