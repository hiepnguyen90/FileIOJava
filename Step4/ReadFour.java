package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {
            Scanner fileIn = new Scanner(new File("input.txt"));


            int sum = 0;
            while (fileIn.hasNext()) {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                System.out.println(lineIn);
                // Split the line into a String array
                sum = sum + Integer.parseInt(lineIn);
            }
            System.out.println(sum);

            System.out.println("The Sum is " + sum);
        } catch (IOException e) {
            System.out.println("File not found");
        }

        // Print out a running total of all the
        // values in the input file.
    }
}
