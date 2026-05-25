package com.ar.oops.inheritance.singleInheritance;

public class CollegeStudent extends Student{

    private String branch;

    //this keyword: refer the current instance of variable.
    //super keyword: immediently refer the parent class object.
    public CollegeStudent(String name, int rollNumber,String branch) {
        super(name, rollNumber);
        this.branch = branch;
    }

    void submitProject() {
        System.out.println( getName() + " submitted project");
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
