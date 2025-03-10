package es.uah.matcomp.mp.e1.ejerciciosclases.ejercicio1;

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
// /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    //** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    //** Returns the radius */
    public double getRadius() {
        return radius;
    }

    //** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // Getter for instance variable color
    public String getColor() {
        return color;

    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;

    }

    // Setter for instance variable color
    public void setColor(String newColor) {
        color = newColor;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + this.getRadius() + "]";
    }
}

