package com.ar.oops.inheritance.singleInheritance;

public class SingleInheritanceExample {
    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent("param", 101,"CSE");


        CollegeStudent collegeStudent1 = new CollegeStudent("Pavan", 102, "CSE");

        CollegeStudent collegeStudent2 = new CollegeStudent("Anurudh", 103,"CSE");

        System.out.println("***************");
        System.out.println(collegeStudent.getName());
        System.out.println(collegeStudent.getRollNumber());
        System.out.println(collegeStudent.getBranch());
        System.out.println("******************");
        collegeStudent.attendExam();
        collegeStudent.submitProject();
    }
}
