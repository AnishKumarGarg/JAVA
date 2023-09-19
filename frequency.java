// Write a Java program to find the frequency of each element in a String and print the frequency of each character only once.

import java.util.Scanner;

public class frequency {

    public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        sc.close();

        // find frequency of each element
        for (int i = 0; i < s.length(); i++) {
            int frq = 0;
            boolean alreadyCounted = false;

            // check if the character is already counted
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // count the frequency of the character
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    frq++;
                }
            }

            System.out.println("The Frequency of " + s.charAt(i) + " is " + frq);
        }
    }
}
