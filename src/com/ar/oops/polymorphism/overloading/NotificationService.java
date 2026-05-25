package com.ar.oops.polymorphism.overloading;

public class NotificationService {

   static void send(String email) {
        System.out.println("Email notification sent");
    }

    static void send(long mobileNumber) {
        System.out.println("SMS notification sent");
    }

    static void send(String email, String subject) {
        System.out.println("Email with subject sent");
    }
}
