package com.ar.main;

import com.ar.accessModifiers.UserService;

public class UserExample {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.createUser();
        System.out.println(userService.id);
        System.out.println(userService.name);


    }
}
