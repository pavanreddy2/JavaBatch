package com.ar.markerInterface.cloneable;

public class CloneableExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Original Student Data");
        Student student = new Student("S-11", "Param", "Kurnool", "param@gamil.com","988838932");

        student.getStudentDetails();

        System.out.println();
        System.out.println("Duplicate Student Data");
        Student duplicateStu = (Student) student.clone();
        duplicateStu.getStudentDetails();
    }
}
