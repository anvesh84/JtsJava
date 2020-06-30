package com.java.day2;

public class EvenShow {
  /**
   * Show method for display even numbers.
   * @param n for passing n value.
   */
  public void show(int n) {
    int i = 0;
    while (i < n) {
      i += 2;
      System.out.println("Even Number " + i);
    }
  }
  
  public static void main(String[] args) {
    int n = 19;
    new EvenShow().show(n);
  }
}
