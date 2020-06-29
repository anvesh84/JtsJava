package com.jts.day1;

public class CircleEx {
  /**
   * Calc method for perfoming calculation.
   * @param radius for accepting radius value.
   */
  public void calc(double radius) {
    double area;
    double circ;
    area = Math.PI * Math.pow(radius, 2);
    circ = 2 * Math.PI * radius;
    System.out.println("Area of Circle  " + area);
    System.out.println("Circumference   " + circ);
  }
  /**
   * Main Method for calling business logic.
   * @param args for accepting parameter values.
   */
  
  public static void main(String[] args) {
    double radius = 8.7;
    CircleEx obj = new CircleEx();
    obj.calc(radius);
  }
}
