package model;

public class Point {
    public double x;
    public double y;

    public Point() {
    }

    public Point(double xarg, double yarg ) {
        x = xarg;
        y = yarg;
    }

    public Point(double v) {
        x = v;
        y = v;
    }

    public void move(double d) {
        x += d;
        y += d;
    }
}