package com.jts.day5;

public class ArrEx {
/**
 * Method main for calling business logic.
 * @param args for arguments.
 */
  public static void main(String[] args) {
    int[] a = new int[] {12,5};
    try {
      a[10] = 56;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array size is small...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
