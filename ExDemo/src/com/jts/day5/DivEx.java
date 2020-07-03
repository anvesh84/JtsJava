package com.jts.day5;

public class DivEx {
  /**
   * Main method for calling business logic.
   * @param args for passing command line arguments.
   */
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    try {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      c = a / b;
      System.out.println("Division Value  " + c);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Size is small...");
    } catch (NumberFormatException e) {
      System.out.println("String Cannot be Converted as Integer...");
    } catch (ArithmeticException e) {
      System.out.println("Division by zero impossible...");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Program by JTS");
    }
  }
}
