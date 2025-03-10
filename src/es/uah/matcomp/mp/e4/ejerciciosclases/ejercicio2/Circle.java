package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio2;

public class Circle implements GeometricObject {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
