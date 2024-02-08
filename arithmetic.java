package project;
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.println("Square: " + square(number));
        System.out.println("Cube: " + cube(number));

        System.out.print("Enter another number for modulus operation: ");
        double divisor = scanner.nextDouble();
        System.out.println("Modulus: " + modulus(number, divisor));

        System.out.print("Enter the exponent for power operation: ");
        int exponent = scanner.nextInt();
        System.out.println("Power: " + power(number, exponent));

        scanner.close();
    }

    //square of a number
    public static double square(double num) {
        return num * num;
    }

    //cube of a number
    public static double cube(double num) {
        return num * num * num;
    }

    //modulus of two numbers
    public static double modulus(double num, double divisor) {
        return num % divisor;
    }

    //power of a number
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
