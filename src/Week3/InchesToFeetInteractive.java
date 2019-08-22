package Week3;

import java.util.Scanner;
import java.io.Console;

public class InchesToFeetInteractive {
    public static void main(String args[]) {


        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter inches: ");
        int a = myInput.nextInt();

        printValues(a);

        System.out.print("Enter inches: ");
        int b = myInput.nextInt();
        printValues(b);

    }

    static void printValues(int a) {
        double feet = a * 0.08333;
        double feet_out = Math.floor(feet);
        double inches_out = a - feet_out * 12;

        System.out.println("Inches: " + a);
        System.out.println("Feet: " + feet_out + " Inches: " + inches_out);

    }
}







