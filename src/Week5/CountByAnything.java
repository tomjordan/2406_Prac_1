package Week5;

import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
        final int MAX = 300, NUMBER_PER_LINE;
        int count, i;
        count = getUserCount();
        NUMBER_PER_LINE = count * 10;
        for(i = 0; i < 300; i += count)
            if (i % NUMBER_PER_LINE == 0)
                System.out.println(i);
            else System.out.print(i + " ");
    }

    public static int getUserCount(){
        int countValue;
        Scanner countVal = new Scanner(System.in);
        System.out.println("Please select a count value here >> ");
        countValue = countVal.nextInt();
        return countValue;
    }
}
