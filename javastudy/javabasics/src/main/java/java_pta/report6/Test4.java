package java_pta.report6;
/*
public class Test4 {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(-9.8);
        ComparableCircle comparableCircle2 = new ComparableCircle(-7.6);

        System.out.println("\nComparableCircle1:");
        System.out.println(comparableCircle1);
        System.out.println("\nComparableCircle2:");
        System.out.println(comparableCircle2);

        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1
                ? "\nComparableCircle1 " : "\nComparableCircle2 ") +
                "is the larger of the two Circles");
    }
}
class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public String toString() {
        return super.toString() + "\nDate created: " + getDateCreated() +
                "\nRadius: " + radius;
    }
}
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }
}
abstract class GeometricObject {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

 */