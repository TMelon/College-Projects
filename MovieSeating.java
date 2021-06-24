/*-------------------------------------------------------------------------
// AUTHOR: Kevin Torrens
// FILENAME: Assignment7.java
// SPECIFICATION:Assign seating to people
// FOR: CSE 110-
// TIME SPENT: 4 Hours
//----------------------------------------------------------------------*/
public class MovieSeating
{
    //Create myMovieCustomer

    Customer[][] myMovieCustomer;

//Constructor

    public MovieSeating(int rowNum, int columnNum)

    {

        //Allocate space

        myMovieCustomer = new Customer[rowNum][columnNum];

        //Outer loop

        for(int kk=0;kk<rowNum;kk++)

            //inner loop

            for(int aa=0;aa<columnNum;aa++)

                //Initialize myMovieCustomer

                myMovieCustomer[kk][aa]=new Customer();

    }

//Define method to get the customer at row & col

    private Customer getCustomerAt(int row, int col)

    {

        //Return

        return myMovieCustomer[row][col];



    }

//Define method to seat tempCustomer at row and col

    public boolean assignCustomerAt(int row, int col, Customer tempCustomer)

    {

//Get the curremt customer at row and col in the myMovieCustomer

        Customer mytp=getCustomerAt(row,col);

        //Check if customer is not assigned at given row and col

        if(mytp.getFirstName().equals("???") && mytp.getLastName().equals("???"))

        {

            //Then assign the tempCustomer

            myMovieCustomer[row][col]=tempCustomer;

            //Return

            return true;

        }

        //Return

        return false;

    }

//Define a method to check row and col are within the boundaries

    public boolean checkBoundaries(int row, int col)

    {

        //Check condition

        if(row<=myMovieCustomer.length && col<= myMovieCustomer[0].length && row>=0 && col>=0)

            //Return

            return true;

        //Return

        return false;

    }

//Define method to represent the movie seating

    public String toString()

    {

        //Create retStr

        String retStr="\n The current seating\n-------------------------";

        //Loop

        for(int kk=0;kk<myMovieCustomer.length;kk++)

        {

            //Add newline

            retStr +="\n";

            //Loop

            for(int aa=0;aa<myMovieCustomer[0].length;aa++)

            {

                //Call toString()

                retStr+= myMovieCustomer[kk][aa].toString()+" ";

            }

        }

        //Return the retStr

        return retStr;

    }

}

