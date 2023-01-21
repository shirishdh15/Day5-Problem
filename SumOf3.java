package Day5;

import java.util.Arrays;

public class SumOf3{
        public static void main(String[] args) {
            int[] arr = {1, -2, 1, 0, 5, -1, -4};
            int n = arr.length;
            int count = 0;

            Arrays.sort(arr);

            for (int i = 0; i < n - 2; i++) {
                int first = arr[i];
                int j = i + 1;
                int k = n - 1;

                while (j < k) {
                    if (first + arr[j] + arr[k] == 0) {

                        System.out.println(first + " " + arr[j] + " " + arr[k]);
                        count++;

                        j++;
                        k--;
                    } else if (first + arr[j] + arr[k] < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
            System.out.println("Number of distinct triplets: " + count);
        }
    }


