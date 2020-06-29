package com.jts.day1;

public class CtoF {
  /**
   * Calc method for performing sum operation.
   * @param c for accepting centigrade value.
   */
  public void calc(double c) {
    double f;
    f = ((9 * c) / 5) + 32;
    System.out.println("Fahrenheit Value " + f);
  }
  /**
   * Main method for calling business logic.
   * @param args for accepting arguments.
   */
  
  public static void main(String[] args) {
    double c = 37;
    CtoF obj = new CtoF();
    obj.calc(c);
  }
}
