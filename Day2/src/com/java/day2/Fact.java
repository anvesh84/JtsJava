package com.java.day2;

public class Fact {
  /**
   * Method calc for calculating factorial.
   * @param n for passing n value.
   */
  public void calc(int n) {
    int i = 1;
    int f = 1;
    while (i <= n) {
      f = f * i;
      i++;
    }
    System.out.println("Factorial Value is  " + f);
  }
  
  public static void main(String[] args) {
    int n = 5;
    new Fact().calc(n);
  }
}
