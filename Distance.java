package Day5;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = input.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance from point (" + x + ", " + y + ") to origin (0, 0) is " + distance);
    }
}
