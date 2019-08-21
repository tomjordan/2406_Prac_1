package Week3;

import java.util.Scanner;
import java.io.Console;

public class Inches_interactive {

    public int main(String args[]) {
        Scanner myInput = new Scanner(System.in);
        int a;
        System.out.print("Enter inches: ");
        a = myInput.nextInt();
        return a;
    }


    void printValues(int a) {
        double feet = a * 0.08333;
        double feet_out = Math.floor(feet);
        double inches_out = a - feet_out * 12;

        System.out.println("Inches: " + a);
        System.out.println("Feet: " + feet_out + " Inches: " + inches_out);
    }

}





