package Week3;

public class Inches {

    static final int INCHES = 100;
    static double feet = INCHES * 0.08333;

    static void printValues() {
       double feet_out = Math.floor(feet);
       double inches_out = INCHES - feet_out*12;


        System.out.println("Inches: " + INCHES);
        System.out.println("Feet: " + feet_out + " Inches: " + inches_out);
    }


}



