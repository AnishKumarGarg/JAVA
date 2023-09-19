// Write a program that reads a list of student names and their corresponding scores from the user until they enter "done". Store the names in one ArrayList and the scores in another ArrayList. Then, find and print the name(s) of the student(s) with the highest score.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_practice12 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name and score (Enter 'Done' to exit)");
        String nameInput;
        int scoreInput;

        while (true) {
            System.out.print("Name: ");
            nameInput = scanner.next();
            if (nameInput.equals("Done")) {
                break;
            }
            System.out.print("Score:");
            scoreInput = scanner.nextInt();
            names.add(nameInput);
            scores.add(scoreInput);
        }
        System.out.println("Student with highest score (" + Collections.max(scores) + "):");
        System.out.println(names.get(scores.indexOf(Collections.ma x(scores))));
        scanner.close();
    }
}
