package Day5;

import java.util.Scanner;

public class Vowel{
    static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a character");
    char y = sc.next().charAt(0);
    if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u')
        System.out.println("It is a Vowel.");
    else
        System.out.println("It is a Consonant.");
}

}
