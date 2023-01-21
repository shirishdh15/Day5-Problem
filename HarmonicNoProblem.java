package Day5;
import java.util.Scanner;
public class HarmonicNoProblem {
    static double harmonic(int N)
    {
        float value = 1;
        for (int i = 2; i <= N; i++) {
            value += (float)1 / i;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of N");
        int N = sc.nextInt();
        if(N==0) {
            System.out.println("enter a ositive integer value");
        }
        System.out.println(harmonic(N));
    }
}