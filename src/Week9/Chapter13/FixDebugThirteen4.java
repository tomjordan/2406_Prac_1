package Week9.Chapter13;
// Reads file of entrees and prices
// prompts user for a cutoff price
// and displays entrees that cost no more than the cutoff

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FixDebugThirteen4 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        Path file =
                Paths.get("C:\\Users\\tomjo\\IdeaProjects\\CP2406_2019_BasicJava\\src\\Week9\\Chapter13\\DebugData4.txt");
        String[] array = new String[2];
        String string = "";
        String delimiter = ",";
        String searchPriceString;
        double searchPrice;
        boolean wasFound = false;
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();

            System.out.print("Enter maximum price to search for >> ");
            searchPriceString = keyBoard.next();
            searchPrice = Double.parseDouble(searchPriceString);
            System.out.println("\nEntrees no more than $" + searchPrice + "\n");
            string = reader.readLine();
            while (!(string.isEmpty())) {
                array = string.split(delimiter);
                if (searchPrice >= Double.parseDouble(array[1])) {
                    wasFound = true;
                    System.out.println(array[0] + "  $" + array[1]);
                }
                string = reader.readLine();
            }
            if (!wasFound)
                System.out.println("No entrees found under $" + searchPrice);
            reader.close();
        } catch (Exception e) {
            System.out.println("Message: all these entrees cost less than the search price");
        }
    }
}