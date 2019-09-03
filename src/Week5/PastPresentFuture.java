package Week5;
import java.time.LocalDate;
import javax.swing.*;
public class PastPresentFuture {
    public static void main(String[] args) {
        int dd,mm,yyyy;
        dd = getUserDay();
        mm = getUserMonth();
        yyyy = getUserYear();
        checkDate(yyyy,mm,dd);
    }

    public static int getUserDay(){
        String userDay;
        int userOption;
        userDay = JOptionPane.showInputDialog(null,
                "Please enter an integer that represents " +
                        "the day of a month: ","Pick a Day", JOptionPane.PLAIN_MESSAGE);
        userOption = Integer.parseInt(userDay);
        return userOption;
    }

    public static int getUserMonth(){
        String userMonth;
        int userOption;
        userMonth = JOptionPane.showInputDialog(null,
                "Please enter an integer that represents " +
                        "the month: ","Pick a Month", JOptionPane.PLAIN_MESSAGE);
        userOption = Integer.parseInt(userMonth);
        return userOption;
    }

    public static int getUserYear(){
        String userYear;
        int userOption;
        userYear = JOptionPane.showInputDialog(null,
                "Please enter a integer that represents " +
                        "the year: ","Pick a year", JOptionPane.PLAIN_MESSAGE);
        userOption = Integer.parseInt(userYear);
        return userOption;
    }

    public static void checkDate(int a, int b, int c){
        final int CURRENTDAY = 2, CURRENTMONTH = 9, CURRENTYEAR = 2019;
        int userYear = a, userMonth = b, userDay = c;

        // Checks the year of the chosen date
        if (userYear == CURRENTYEAR)
            System.out.println("The chosen date is this year");
        else
            System.out.println("The chosen date is not this year");

        // Checks the month of the chosen date
        if (userMonth <= 12 && userMonth > 0)
            if (userMonth < CURRENTMONTH && userMonth != CURRENTMONTH)
                System.out.println("The month is earlier in the year");
            else if (userMonth == CURRENTMONTH)
                System.out.println("The chosen month is the current month");
            else
                System.out.println("The month is later in the year");
        else
            System.out.println("Don't think it's possible");
    }
}

//    LocalDate currentDate = LocalDate.now();
//        LocalDate userDate = LocalDate.of(c,b,a);
//        System.out.println(currentDate);
//        System.out.println(userDate);
//
//
//        if (currentDate.isBefore(userDate))
//            System.out.println("The chosen date is in the future");
//        else if (currentDate.isAfter(userDate))
//            System.out.println("The chosen date is in the past");
//        else
//            System.out.println("The date is the current date");

