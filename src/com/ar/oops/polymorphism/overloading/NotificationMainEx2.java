package com.ar.oops.polymorphism.overloading;

public class NotificationMainEx2 {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("abc@gmail.com");
        service.send(9044751545L);
        service.send("abc@gmail.com", "Welcome");
    }
}
