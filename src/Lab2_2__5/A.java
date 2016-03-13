package Lab2_2__5;

/**
 * Created by Alex on 13.03.2016.
 */
public class A {

    private final static double PI = 3.14;
    double length, heigth, radius;

    public static void calcSquare(double length) {
        //this is foursquare
        System.out.println("The square of foursquare with side " + length + " equals to " + length*length);
    }

    public static void calcSquare(double length, double heigth) {
        //this is rectangle
        System.out.println("The square of rectangle with side a = " + length + " and side b = " + heigth + " equals to " + length*heigth/2);
    }

    public static void calcSquare(double radius, String figure) {
        //this is circle
        System.out.println("The square of circle with radius " + radius + " equals to " + PI*radius*radius);
    }
}
