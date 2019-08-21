package Week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String args[]) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter Dollars: ");
        int dollars;
        dollars = myInput.nextInt();
        double tot = 0;




        double twenties = dollars/20;
        double twenty = Math.floor(twenties);
        tot = tot + twenty*20;

        double tens = (dollars-tot)/10;
        double ten = Math.floor(tens);
        tot = tot + ten*10;

        double fives = (dollars-tot)/5;
        double five = Math.floor(fives);
        tot = tot + five*5;

        double twos = (dollars-tot)/2;
        double two = Math.floor(twos);
        tot = tot + two*2;

        double ones = (dollars-tot);
        double one = Math.floor(ones);
        tot = tot + one;

        System.out.println("Twenties: " + twenty + " Tens: " + ten + " Fives: " + five +
                " Twos: " + two + " Ones: " + one);


    }





}
