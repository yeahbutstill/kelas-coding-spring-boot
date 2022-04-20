package com.yeahbutstill;

public class UserValidationService {

    public boolean isUserValid(String user, String password) {
        if (user.equals("Dani") && password.equals("rahasia123")) {
            return true;
        }
        return false;
    }

}
