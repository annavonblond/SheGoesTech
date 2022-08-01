package Lectures;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        //Print out "Good job!" if grade is over 6
        if (grade > 6) {
            System.out.println("Good job!");
        }

        //Print out "Good job!" if grade is over 3
        if (grade > 3) {
            System.out.println("Good job!");
        }

        // If else statement (execute the code for the fulfilled and unfulfilled conditions
        //Print  "Good job!" if grade is over 6 and if not then print "Better luck next time"

        if (grade > 6) {
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time");
        }

    }

}