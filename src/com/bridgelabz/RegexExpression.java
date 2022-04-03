package com.bridgelabz;

import java.util.Scanner;

public class RegexExpression {

    public boolean firstName(String name) {
        String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
        if (name.matches(firstName)) {
            return true;
        }
        return false;
    }

    public boolean lastName(String name) {
        String lastName = "^[A-Z]{1}[A-Za-z]{2,}$";
        if (name.matches(lastName)) {
            return true;
        }
        return false;
    }

    public boolean email(String email) {
        String pattern  = "^(abc)[.]{1}[A-Za-z]*[@]{1}(bl.co)(.in)*$";
        if (email.matches(pattern)) {
            return true;
        }
        return false;
    }

    public boolean mobile(String mobile) {
        String pattern  = "^(91)[\\s]{1}[1-9]{1}[0-9]{9}$";
        if (mobile.matches(pattern)) {
            return true;
        }
        return false;
    }

    public boolean password(String password) {
        String pattern  = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (password.matches(pattern)) {
            return true;
        }
        return false;
    }

    public boolean validEmail(String email) {
        String pattern = "^(abc)[.0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$";
        if(email.matches(pattern)) {
            return true;
        }
        return false;
    }


}