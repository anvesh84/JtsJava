package com.jts.day1;

public class Max3 {
  /**
   * Method check for business logic.
   * @param a for read a value.
   * @param b for read b value.
   * @param c for read c value.
   */
  public void check(int a, int b, int c) {
    int m = a;
    if (m < b) {
      m = b;
    }
    if (m < c) {
      m = c;
    }
    System.out.println("Max Value  " + m);
  }
  /**
   * Method main for calling business logic.
   * @param args for passing arguments.
   */
  
  public static void main(String[] args) {
    int a = 5;
    int b = 3;
    int c = 7;
    Max3 obj = new Max3();
    obj.check(a, b, c);
  }
}
