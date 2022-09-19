/*      Write a program that randomly generates an integer between 0 and 100, inclusive. The
        program prompts the user to enter a number continuously until the number matches the
        randomly generated number. For each user input, the program tells the user whether the input is
        too low or too high, so the user can choose the next input intelligently.*/

import java.util.Random;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        //create random integer
        Random rand = new Random();
        int arg = rand.nextInt(101);

        //prompts the user to enter a number continuously until the number matches the randomly generated number
        boolean b = true; //condition for stopping while-loop
        while (b) {
            System.out.println("Please enter your number from 0 to 100:");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();

            if (selection == arg) {
                System.out.println("Numbers are equals, congratulations!!!");
                b = false;
            } else if (selection > arg) {
                System.out.println("Your number more than random");
            } else {
                System.out.println("Your number less than random");
            }
        }
    }
}
