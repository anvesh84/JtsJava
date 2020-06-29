package com.jts.day1;

public class CalcDemo {
  public void sum(int a, int b) {
    int c = a + b;
    System.out.println("Sum is  " + c);
  }
  /**
   * Main Method for calling business logic.
   * @param args for accepting arguments.
   */
  
  public static void main(String[] args) {
    int a = 5;
    int b = 7;
    CalcDemo obj = new CalcDemo();
    obj.sum(a, b);
  }
}
