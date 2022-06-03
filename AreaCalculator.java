package com.akilesh;

public class AreaCalculator {

    // Method to calculate area of circle
    public static double area(double radius) {
        if(radius < 0) {
            return -1d;
        }
        return Math.PI * (radius * radius);
    }

    // Method to calculate area of rectangle or square.
    public static double area(double x, double y) {
        if((x < 0) || (y < 0)) {
            return -1d;
        }
        return x * y;
    }
}
