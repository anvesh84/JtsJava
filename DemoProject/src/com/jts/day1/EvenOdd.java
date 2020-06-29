package com.jts.day1;

public class EvenOdd {
  /**
   * Method check for validating number.
   * @param n for accepting input.
   */
  public void check(int n) {
    if (n % 2 == 0) {
      System.out.println("Even Number...");
    } else {
      System.out.println("Odd Number...");
    }
  }
  /**
   * Method main for calling business logic.
   * @param args for passing arguments.
   */
  
  public static void main(String[] args) {
    int n = 6;
    EvenOdd obj = new EvenOdd();
    obj.check(n);
  }
}
