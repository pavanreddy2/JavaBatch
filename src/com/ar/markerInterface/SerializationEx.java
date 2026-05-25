package com.ar.markerInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee(101, "Param", 50000.00);

        FileOutputStream fileOutputStream = new FileOutputStream("F:\\employee.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        outputStream.writeObject(employee);
        outputStream.close();
        fileOutputStream.close();
        System.out.println("Serialization data is saved F:\\employee.txt");

    }
}
