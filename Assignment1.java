/*
        Name: Kevin Torrens
        Title: TempConverter.java
        Author: Kevin Torrens
        Description: Computes the Fahrenheit equivalent of a specific Celsius
        value
        Time spent: 20 minutes
        Date: 5/23/2019
        **************************************************************
        ***********************************************************
        Part #1
        (a) The name of the public class within a file is no the same as the one in the code.
        (b) The first error is that there is a missing parenthesis and the second error is that the string is not properly closed.
        (c) The error message states that there is a missing semicolon.
        (d) The class is improperly closed.
        (e) This error means that the compiler cannot accomplish this task.
        **************************************************************
        ***********************************************************
        Part #2
        (1) a)mystery has the value = 5
        *   b)mystery has the value = 3
        *   c)mystery has the value = 4
        (2) a) 0
        *   b) 3.3333333333333335
        *   c) 2
        *   d) 4.3
        *   e) 0.2480620155038759
        *   f) 1
        *   g) 1
        **************************************************************

 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment1
{
    //  Ask the user for the amount of the bill
    //  The percent they want to tip
    public static void main(String[] args)
    {

        //declare variables

        int tipPercentage; // must be interger (whole number)
        double billAmount, tipAmount, totalAmount;

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the bill amount: "); // Enter bill amount in the prompt below
        billAmount = scan.nextDouble(); // read in the next double and store it in billAmount

        System.out.print("What percent would you like to tip: "); // Enter tip percentage
        tipPercentage = scan.nextInt(); // read in next integer and store in tipPercent

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); // $ will now be in front of amounts

        // Program will calculate

        tipAmount = (billAmount * tipPercentage) / 100; // This calculates Tip amount
        totalAmount = billAmount + tipAmount; // This calculates your total

        System.out.println("Tip Amount: " + fmt1.format(tipAmount));
        System.out.println("Total including Tip " + fmt1.format(totalAmount));
    }
}
