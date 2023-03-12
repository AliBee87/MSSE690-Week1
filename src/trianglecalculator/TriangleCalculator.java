package trianglecalculator;

import java.util.Objects;

public class TriangleCalculator {


    private double base;
    private double height;

    private double length;


    public TriangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public TriangleCalculator(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }


    public TriangleCalculator() {
    }

    public void calculateArea(double base, double height) {
        System.out.println((base * height) / 2);
    }

    public void determineTriangleType(double base, double height, double length) {
        if (base == height && height == length) {
            System.out.println("This is an equilateral triangle.");
        } else if (base == height || height == length || length == base) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangleCalculator that = (TriangleCalculator) o;
        return Double.compare(that.base, base) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, length);
    }
}
