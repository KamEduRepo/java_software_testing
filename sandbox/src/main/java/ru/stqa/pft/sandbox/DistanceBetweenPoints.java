package ru.stqa.pft.sandbox;

public class DistanceBetweenPoints {

  public static void main(String[] args) {

    Point p1 = new Point(-1,0);
    Point p2 = new Point(1, 0);

    System.out.println("Расстояние между двумя точками = " + p2.distance(p1));
  }
}
