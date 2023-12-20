package org.example;

public class Rectangle extends Figure {
    private Point x;
    private Point y;

    private static int global = 14;

    public Rectangle(Point x, Point y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
