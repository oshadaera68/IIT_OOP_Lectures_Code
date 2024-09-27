/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Circle {
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setArea(double radius) {
        this.radius = radius;
    }

    public void setCircumference(double radius) {
        this.radius = radius;
    }

    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
