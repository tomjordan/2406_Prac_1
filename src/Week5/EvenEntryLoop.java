package Week5;

import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {
        int userEntry;
        boolean finished = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an Even number or the number" +
                " 999 to exit the Even Entry Loop >> ");
        userEntry = userInput.nextInt();
        while (!finished) {
            if (userEntry == 999) {
                System.out.println("Have a good day!");
                finished = true;
            } else {
                if (userEntry % 2 == 0) {
                    System.out.println("Good Job! Enter another Even number or the" +
                            " number 999 to exit the Even Entry Loop >> ");
                } else {
                    System.out.println("Error 101. Please enter an Even number or the number" +
                            " 999 to exit the Even Entry Loop >> ");
                }

                userEntry = userInput.nextInt();
            }

        }
    }
}

