public class Geek
{
    private String nameOfGeek;
    private int numberOfQuestions;
    //instance variables

    public Geek(String initnameOfGeek, int initnumberOfQuestions)
    {
        nameOfGeek = initnameOfGeek;
        numberOfQuestions = initnumberOfQuestions;
    }
    //Constructor accounts

    public String getNameOfGeek()
    {
        return nameOfGeek;
    }
    //returns the name of the Geek when getNameOfGeek() is invoked in a program

    public int getNumberOfQuestions()
    {
        return numberOfQuestions;
    }
    //returns the number of questions when getNumberOfQuestions() is invoked in a program

    public boolean isEven(int num1, int num2)
    {
        numberOfQuestions++;
        if ((num1 + num2) % 2 == 0)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
    //calculates if the sum of two numbers is even or odd and return true or false depending on if it is even or not

    public int sum(int num1, int num2)
    {
        numberOfQuestions++;
        int sum = 0;
        int secondNum = 0;
        int count = 0;
        if (num1 < num2)
        {
            sum = num1;
            count = num1;
            secondNum = num2;
        }
        else if (num2 < num1)
        {
            sum = num2;
            count = num2;
            secondNum = num1;
        }
        else
        {
            sum = num1;
        }
        while(count < secondNum)
        {

            sum = sum + secondNum;
            secondNum--;
        }
        return sum;
    }
    //calculates the sum of the numbers between and including two numbers inputted and returns that number


    public boolean leapYear(int year)
    {
        numberOfQuestions++;
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //checks if a year is a leap year and returns true or false depending if it is



}
