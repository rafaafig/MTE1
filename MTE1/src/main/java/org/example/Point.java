package org.example;

public class Point {
    private double coordinate1;
    private double coordinate2;

    public Point(double coordinate1, double coordinate2) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    public double getCoordinate1() {
        return coordinate1;
    }

    public void setCoordinate1(double coordinate1) {
        this.coordinate1 = coordinate1;
    }

    public double getCoordinate2() {
        return coordinate2;
    }

    public void setCoordinate2(double coordinate2) {
        this.coordinate2 = coordinate2;
    }
}
