package com.ar.conditions;

public class SwitchEx2 {
    public static void main(String[] args) {
        String role = "ADMIN";
        switch (role) {
            case "ADMIN":
                System.out.println("this is admin");
                break;
            case "USER":
                System.out.println("This is user");
            break;
        }
    }
}
