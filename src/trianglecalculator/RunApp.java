package trianglecalculator;

import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle");
        double baseInput = scanner.nextDouble();

        System.out.println("Enter the height of the triangle");
        double heightInput = scanner.nextDouble();

        TriangleCalculator triangleCalculator = new TriangleCalculator();

        System.out.println("Area of the triangle is: ");

        triangleCalculator.calculateArea(baseInput, heightInput);

        System.out.println("Now let's determine if your triangle is an equilateral, isosceles, or scalene triangle. Please enter the length of the first side of the triangle: ");
        double sideOne = scanner.nextDouble();

        System.out.println("Enter the second length of the second side: ");
        double sideTwo = scanner.nextDouble();

        System.out.println("Enter the length of the third side: ");
        double sideThree = scanner.nextDouble();

        triangleCalculator.determineTriangleType(sideOne, sideTwo, sideThree);


    }
}
