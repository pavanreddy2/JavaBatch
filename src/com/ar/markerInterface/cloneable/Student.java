package com.ar.markerInterface.cloneable;

public class Student implements Cloneable{
    String sid;
    String sname;
    String saddress;
    String semail;
    String smobile;


    public Student(String sid, String sname, String saddress, String semail, String smobile) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.semail = semail;
        this.smobile = smobile;
    }

    public void getStudentDetails() {
        System.out.println("Student Details");
        System.out.println("-----------------");
        System.out.println("Student Id: "+ sid);
        System.out.println("Student name: "+ sname);
        System.out.println("Student Address: "+ saddress);
        System.out.println("Student email: "+ semail);
        System.out.println("Student mobile: "+ smobile);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
