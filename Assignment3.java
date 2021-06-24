/*-------------------------------------------------------------------------
// AUTHOR: Kevin Torrens
// FILENAME: Assignment 3
// SPECIFICATION: description of the program
// FOR: CSE 110
// TIME SPENT: 65 min
//----------------------------------------------------------------------*/
/*-------------------------------------------------------------------------
// Part #1
//1.
//a) 10 9 8 7 6 5 4 3 2
// b) 5 15
//
//2.import java.util.Scanner;
//
//public class Assignment3
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Name: ");
//        String str = in.nextLine();
//        System.out.println("Name in reverse: ");
//        for (int i = str.length()-1; i>=0; i--)
//        {
//            System.out.print(str.charAt(i));
//        }
//    }
//}
//----------------------------------------------------------------------*/


import java.util.Scanner;

public class Assignment3
{
    public static void main(String[] args)
    {
        //Variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = scan.nextInt();
        System.out.println("\ngdc(" + num1 + ", " + num2 +")");

        //length of chain starts at 1
        int length = 1;

        //loop to calculate the gcd
        //while the 2 nums are not equal
        //if num1 > num2, then gdc(num1, num2) = gdc(num1-num2) and
        //if  num1 < num2, then gdc(num1, num2) = gdc(num1, num2 - num1)

        while (num1 != num2)
        {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

            //print out next part of chain
            System.out.print(" = gdc(" + num1 + "," + num2 + ")");
            length++;
        }
        //final output
        System.out.println(" = " + num1);
        System.out.println("\nIt took " + length + " steps to calculate GDC. ");

    }//end of method
}//end of class
