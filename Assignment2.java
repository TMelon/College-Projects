
    /*
        Name: Kevin Torrens
        Title:  InNOutBurger.java
        Author: Kevin Torrens
        Description: IN-N-Out Burger menu
        Time spent: 75 minutes
        Date: 5/30/2019
        **************************************************************
        ***********************************************************
        Part #1
        1-Answer:

        x == y /2 returns true

        x % 2 == 0 || y % 2 != 0 returns false

        x - y < 0 && !(x >= y) returns true

        x + 6 !=y || x/y <= 0 returns true

        Part #2
        import java.util.Scanner;

             public class NameTest {

                 public static void main(String[] args) {

                     Scanner input = new Scanner(System.in);

                      System.out.println("Enter your full name:");

                      String name = input.nextLine();
                      System.out.println("Entered Name is "+name);
              }

            }
         Part #3

         Hy

        **************************************************************

 */

import java.util.Scanner;

import java.text.NumberFormat;


    public class Assignment2 
    {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            NumberFormat fmt1 = NumberFormat.getCurrencyInstance();

            //variables
            final double Hamburger = 2.75;
            final double Cheeseburger = 3.25;
            final double French_Fries = 2.50;
            final double ShakeandBeverage = 1.50;

            //MENU
            System.out.println("Welcome to the In-N-Out Burger menu:\n" +
                    "------------------------------------------------------\n");
            System.out.println("Hamburger\t\t    $2.75");
            System.out.println("Cheeseburger\t\t$3.25");
            System.out.println("French Fries\t\t$2.50");
            System.out.println("Shake & Beverage\t$1.50");
            System.out.println();

            System.out.println("How many hamburger(s) would you like to buy?:" );
            int numberOfHamburgers = in.nextInt();

            System.out.println("How many cheeseburger(s) would you like to buy?:" );
            int numberOfCheeseburgers = in.nextInt();

            System.out.println("How many French fries would you like to buy?:" );
            int numberOfFrenchFries = in.nextInt();

            System.out.println("How many drinks would you like to buy?:" );
            int numberOfDrinks = in.nextInt();

            System.out.println();
            double hBTotal = numberOfHamburgers * 2.75;
            System.out.println("The total cost of the hamburger(s): "+fmt1.format(hBTotal));
            double cBTotal = numberOfCheeseburgers * 3.25;
            System.out.println("The total cost of the cheeseburger(s): "+fmt1.format(cBTotal));
            double friesTotal = numberOfFrenchFries * 2.5;
            System.out.println("The total cost of the fries: "+fmt1.format(friesTotal));
            double drinksTotal = numberOfDrinks * 1.5;
            System.out.println("The total cost of the drink(s): "+fmt1.format(drinksTotal));

            String highestTotalCostItem = "Hamburger.";
            if(cBTotal > hBTotal)
                highestTotalCostItem = "Cheeseburger.";
            if(friesTotal > cBTotal)
                highestTotalCostItem = "French Fries.";
            if(drinksTotal > friesTotal)
                highestTotalCostItem = "Shake & Beverages.";

            System.out.println("The item with the highest total cost: "+highestTotalCostItem);
            double orderTotalCost = hBTotal + cBTotal + friesTotal + drinksTotal;

            System.out.println("The total cost for the order: "+fmt1.format(orderTotalCost));
            int totalItems = numberOfHamburgers + numberOfCheeseburgers + numberOfFrenchFries + numberOfDrinks;

            System.out.println("The total number of hamburgers, cheeseburgers, frenchfries, and drinks ordered: "+totalItems);


        }


    }



