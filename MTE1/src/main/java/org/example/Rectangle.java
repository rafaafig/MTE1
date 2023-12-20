package org.example;

public class Rectangle extends Figure {
    private Point x;
    private Point y;

    private static int global = 14;

    public Rectangle(Point x, Point y,String color){
        super(color);
        this.x = x;
        this.y = y;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }
    public double area(){
        return Math.abs(x.getCoordinate1()-y.getCoordinate1())*Math.abs(x.getCoordinate2()-y.getCoordinate2());
    }
}
