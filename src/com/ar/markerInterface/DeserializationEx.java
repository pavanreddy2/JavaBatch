package com.ar.markerInterface;

import java.io.*;

public class DeserializationEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = null;

        FileInputStream fileInputStream = new FileInputStream("F:\\employees.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        employee  = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        System.out.println("Employee Details");
        System.out.println("Id :" + employee.id);
        System.out.println("Name :" + employee.name);
        System.out.println("Salary :" + employee.salary);
    }
}
