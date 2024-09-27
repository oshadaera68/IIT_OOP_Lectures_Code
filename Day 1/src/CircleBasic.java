import java.util.Scanner;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class CircleBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = input.nextDouble();

        double area = getArea(radius);
        double cirF = getCircumference(radius);
        System.out.println("Area:" + area);
        System.out.println("Circumference:" + cirF);
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
