package com.jts.day1;

public class PosNegEx {
  /**
   * Method check for validating number.
   * @param n for accepting number.
   */
  public void check(int n) {
    if (n >= 0) {
      System.out.println("Positive Number...");
    } else {
      System.out.println("Negative Number...");
    }
  }
  /**
   * Main method for calling business logic.
   * @param args for accepting arguments.
   */
  
  public static void main(String[] args) {
    int n = -5;
    PosNegEx obj = new PosNegEx();
    obj.check(n);
  }
}
