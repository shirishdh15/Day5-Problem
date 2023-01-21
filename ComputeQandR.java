package Day5;
import java.util.Scanner;
public class ComputeQandR {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");

        int dividend = sc.nextInt();
        System.out.println("enter a divident");
        int  d = sc.nextInt();

        int quotient = dividend / d;
        int remainder = dividend % d;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}
