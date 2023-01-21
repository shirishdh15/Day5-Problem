package Day5;
import java.util.Scanner;
public class Swap2Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X and Y :" );
        int x =sc.nextInt();
        int y = sc.nextInt();

        int temp = x;
        x=y;
        y=temp;
        System.out.println("Swap Two Number: "+x+" "+y);
    }
}