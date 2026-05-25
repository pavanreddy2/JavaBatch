package com.ar.markerInterface.cloneable.deepCloning;

public class Account {


    int accNo;
    String accHolderName;
    String accType;
    int balance;

    public Account(int accNo, String accHolderName, String accType, int balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accType = accType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accHolderName='" + accHolderName + '\'' +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }


}
