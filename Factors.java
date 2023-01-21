package Day5;
import java.util.ArrayList;
public class Factors {
    public static void main(String[] args) {
        int n = 60;
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        System.out.println("Prime factors of " + n + ":");
        for (Integer factor : factors) {
            System.out.print(factor + " ");
        }
    }
}
