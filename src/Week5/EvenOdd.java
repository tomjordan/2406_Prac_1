package Week5;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int userNumber;
        userNumber = getUserInput();
        if (userNumber % 2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Number is odd");
    }

    public static int getUserInput(){
        int userNumber;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer >> ");
        userNumber = userInput.nextInt();
        return userNumber;
    }

}
