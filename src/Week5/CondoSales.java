package Week5;

import javax.swing.*;
public class CondoSales {
    public static void main(String[] args) {
        int viewOptions, parkingOptions;
        double condoBill;
        condoBill = 0.00;
        viewOptions = userViewOptions();
        if (viewOptions == 1)
            condoBill = condoBill + 150000;
        else if (viewOptions == 2)
            condoBill = condoBill + 170000;
        else if (viewOptions == 3)
            condoBill = condoBill + 210000;
        else
            condoBill = 0.00;
        if (condoBill != 0) {
            parkingOptions = userParkingOptions();
            if (parkingOptions == 1)
                condoBill = condoBill + 5000;
        }
        else
            condoBill = 0.00;
        JOptionPane.showMessageDialog(null, "Your condo Bill is: $" + condoBill,"Condo Price",JOptionPane.PLAIN_MESSAGE);
    }

    public static int userViewOptions(){
        String usersOption;
        int chosenOption;
        usersOption = JOptionPane.showInputDialog(null,
                "Please select view:\n1 - Park View\n2 - Gold Course View" +
                        "\n3 - Lake View","View Options", JOptionPane.PLAIN_MESSAGE);
        chosenOption = Integer.parseInt(usersOption);
        return chosenOption;
    }

    public static int userParkingOptions(){
        String usersOption;
        int chosenOption;
        usersOption = JOptionPane.showInputDialog(null,
                "Additional specifications:\n1 - Garage\n2 - Parking Space","Parking Options",
                JOptionPane.PLAIN_MESSAGE);
        chosenOption = Integer.parseInt(usersOption);
        return chosenOption;
    }
}
