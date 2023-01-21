package Day5;
import java.util.Random;
public class FlipCoin {
    public static void main(String[] args) {
        int flips = 5; // user input for number of coin flips
        int heads = 0;
        int tails = 0;
        Random rand = new Random();
        for (int i = 0; i < flips; i++) {
            double coin = rand.nextDouble();
            if (coin < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double headsPercentage = (heads / (double) flips) * 100;
        double tailsPercentage = (tails / (double) flips) * 100;

        System.out.println("Heads: " + headsPercentage + "%");
        System.out.println("Tails: " + tailsPercentage + "%");
    }
}
