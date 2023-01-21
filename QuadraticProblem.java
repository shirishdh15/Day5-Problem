package Day5;

import java.util.Scanner;

public class QuadraticProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = scanner.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The roots of the equation are " + root1 + " and " + root2);
        } else if (delta == 0) {
            double root = -b / (2*a);
            System.out.println("The root of the equation is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
