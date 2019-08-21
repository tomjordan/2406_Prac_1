package Week3;

import java.util.Random;

import java.util.Scanner;

public class GameMain {


    public static void main(String args[]) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println("Secret Num (testing)   " + secret);

        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter guess: ");
        int guess;
        guess = myInput.nextInt();




        if (guess == secret) {
            System.out.println("You guessed " + guess + " The secret number was " + secret
                    + " Correct!");
        } else {
            System.out.println("You guessed " + guess + " The secret number was " + secret
                    + " Incorrect :(");

        }
    }
}






