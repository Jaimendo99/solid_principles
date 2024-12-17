package com.udla.SRP.Fixed;


import com.udla.SRP.Original.UserManager;

class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.addUser("example@domain.com", "password123");
        userManager.addUser("invalid-email", "1234");
    }
}