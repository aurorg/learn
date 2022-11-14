package java_pta.report6;
/*
public class Test7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(-5);

        System.out.println("\nOctagon:\nArea: " + octagon1.getArea() +
                "\nPerimeter: " + octagon1.getPerimeter());
        System.out.println("Cloning Octagon...");
        Octagon octagon2 = (Octagon)octagon1.clone();
        int result = (octagon1.compareTo(octagon2));
        if (result == 1)
            System.out.println("Octagon is greather than its clone.");
        else if (result == -1)
            System.out.println("Octagon is less than its clone.");
        else
            System.out.println("Octagon is equal to its clone.");
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
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Octagon extends GeometricObject
        implements Cloneable, Comparable<Octagon> {
    private double side;
    public Octagon() {
    }
    public Octagon(double side) {
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }
    public double getPerimeter() {
        return 8 * side;
    }
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString() {
        return super.toString() + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}


 */