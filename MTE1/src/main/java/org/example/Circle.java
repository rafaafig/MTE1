package org.example;

public class Circle extends Figure{

    private double raio;
    public Circle(double raio,String color) {
        super(color);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
