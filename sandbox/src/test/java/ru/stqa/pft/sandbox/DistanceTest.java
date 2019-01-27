package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
  @Test
  public void testPointDistancePositive() {
    Point p1 = new Point(0.5,1);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.distance(p2), 2.5);
  }

  @Test
  public void testPointDistanceEqual() {
    Point p1 = new Point(1,1);
    Point p2 = new Point(1, 1);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testPointDistanceNegative() {
    Point p1 = new Point(-0.5,-1);
    Point p2 = new Point(-2, -3);
    Assert.assertEquals(p1.distance(p2), 2.5);
  }

  @Test
  public void testPointDistanceVariable() {
    Point p1 = new Point(-1,1);
    Point p2 = new Point(1, -1);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }

  @Test
  public void testPointDistanceNullable() {
    Point p1 = new Point(0,0);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }
}
