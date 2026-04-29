package com.ar.conditions;

//when you have one variable, and multiple fixed possible values.
public class SwitchEx {
    public static void main(String[] args) {
     int dayOfweek = 7;
      switch (dayOfweek) {
          case 1:
              System.out.println("it is monday");
              break;
          case 2:
              System.out.println("it is tuesday");
          break;
          case 3:
              System.out.println("it is wednesday");
              break;
          case 4:
              System.out.println("it is thursday");
              break;
          default:
              System.out.println("It is weekend");
              break;
      }
    }
}
