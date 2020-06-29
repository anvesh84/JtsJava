package com.jts.day1;

public class Loop1 {
  /**
   * Method show for business logic.
   * @param n for passing value.
   */
  public void show(int n) {
    int i = 0;
    while (i < n) {
      System.out.println("Hi I am Anvesh...");
      i++;
    }
  }
  /**
   * Method main for calling business logic.
   * @param args for passing arguments.
   */
 
  public static void main(String[] args) {
    Loop1 obj = new Loop1();
    obj.show(5);
  }
}
