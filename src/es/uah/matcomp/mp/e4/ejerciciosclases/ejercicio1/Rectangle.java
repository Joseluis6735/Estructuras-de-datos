package es.uah.matcomp.mp.e4.ejerciciosclases.ejercicio1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*(length * width);
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public String toString() {
        return "Rectangle["+super.toString()+", width=" + width + " length=" + length + "]";
    }
}
