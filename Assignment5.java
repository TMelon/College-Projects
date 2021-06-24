/*-------------------------------------------------------------------------
// AUTHOR: your name
// FILENAME: title of the source file
// SPECIFICATION: description of the program
// FOR: CSE 110- homework #- days and time of your class
// TIME SPENT: how long it took you to complete the assignment
//----------------------------------------------------------------------*/
import java.util.*;
public class Assignment5 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner (System.in);

        String choice;
        char command;


        // print the menu
        printMenu();

        // create new Geek object
        Geek myGeek = new Geek("Geek", 0);

        do
        {
            // ask a user to choose a command
            System.out.println("\nPlease enter a command or type ?");
            choice = console.next().toLowerCase();
            command = choice.charAt(0);

            switch (command)
            {
                case 'a':
                    //prints the Geek's name
                {
                    System.out.println("Name: " + myGeek.getNameOfGeek());
                }
                break;
                case 'b': //
                {
                    System.out.println("Number of questions: " +
                            myGeek.getNumberOfQuestions());
                }
                break;
                case 'c': //
                    //asks for two integers and finds and prints if their sum is even or odd
                {
                    int num1, num2;
                    System.out.println("Enter two numbers: ");
                    num1 = console.nextInt();
                    num2 = console.nextInt();
                    System.out.println("The sum of the numbers is: " + (myGeek.isEven(num1,num2)?"Even":"Odd"));
                }
                break;
                case 'd': //
                    //asks for two integers and finds and prints the sum of all integers between them (inclusive)
                {
                    int num1, num2;
                    System.out.println("Enter two numbers: ");
                    num1 = console.nextInt();
                    num2 = console.nextInt();
                    System.out.println("The sum between " + num1 + " and " + num2 + " is " + myGeek.sum(num1,num2));
                }
                break;
                case 'e': //
                    //asks for a year and finds out and prints if is leap year or not
                {
                    int year;
                    System.out.println("Enter a year: ");
                    year = console.nextInt();
                    System.out.println(year + " is " + (myGeek.leapYear(year)?"Leap Year":"Not a Leap Year"));
                }
                break;
                case '?':
                    printMenu();
                    break;
                case 'q':
                {
                    System.exit(0);
                }
                break;

                default:
                    System.out.println("Invalid input");

            }

        } while (command != 'q');

    }  //end of the main method


    public static void printMenu()
    {
        System.out.print("\nCommand Options\n"
                + "-----------------------------------\n"
                + "a: get name\n"
                + "b: number of questions asked\n"
                + "c: sum is even\n"
                + "d: sum between two integers\n"
                + "e: leap year\n"
                + "?: display the menu again\n"
                + "q: quit this program\n\n");


    } // end of the printMenu method

}  // end Assignment5 class
