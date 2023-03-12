package main.java.org.example.Algorithms.Medium.Solved;

import java.util.Random;

public class GenerateRandomPointInACircle {
    double radius, x_center, y_center;

    public GenerateRandomPointInACircle(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double[] res = new double[2];
        double angle = Math.random() * 2 * Math.PI;
        double hypotenuse = Math.sqrt((double) Math.random()) * radius;
        double adjacent = Math.cos(angle) * hypotenuse;
        double opposite = Math.sin(angle) * hypotenuse;
        res[0] = x_center + adjacent;
        res[1] = y_center + opposite;
        return res;
    }
}
