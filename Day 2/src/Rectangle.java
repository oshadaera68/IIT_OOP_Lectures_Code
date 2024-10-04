import java.util.Objects;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class Rectangle {
    private static int noOfRectangle;
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        noOfRectangle++;
    }

    public static int getNoOfRectangle() {
        return noOfRectangle;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(30, 40);
        Rectangle r3 = new Rectangle(50, 60);
        System.out.println("Area of Rectangle r1: " + r1.getArea());
        System.out.println("Perimeter of Rectangle r1: " + r1.getPerimeter());

        System.out.println("Area of Rectangle r2: " + r2.getArea());
        System.out.println("Perimeter of Rectangle r2: " + r2.getPerimeter());

        System.out.println("Area of Rectangle r3: " + r3.getArea());
        System.out.println("Perimeter of Rectangle r3: " + r3.getPerimeter());
        System.out.println("No. of Rectangle: " + Rectangle.getNoOfRectangle());
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

/*    public boolean isSquare(Rectangle obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getLength() == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
    }*/

    public boolean isSquare() {
        if (this != null) {
            if (this.getLength() == this.getWidth()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
