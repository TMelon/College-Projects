/*------------------------------------------------------------------------
// AUTHOR: Kevin Torrens
// FILENAME: Triangle.java
// SPECIFICATION: Determine the type of triangle
// FOR: CSE 110 Assignment 4
// TIME SPENT: 3 hours
//-----------------------------------------------------------*/


public class Triangle
{
   private int side1, side2, side3;
    public Triangle(int num1, int num2, int num3)
    {
        side1 = num1;
        side2 = num2;
        side3 = num3;
    }

    private int largest()
    {
        if(side1 > side2 && side1 > side3)
            return side1;
        else if(side2 > side1 && side2 > side3)
            return side2;
        else
            return side3;
    }

    private int shortest()
    {
        if (side1 < side2 && side1 < side3)
            return side1;
        else if (side2 < side1 && side2 < side3)
            return side2;
        else
            return side3;
    }

    public boolean is_equilateral()
    {
        return shortest() == largest();
    }

    public boolean is_isosceles()
    {
        if(side1 == side2 )
            return true;
        else if(side2 == side3)
            return true;
        if(side1 == side3)
            return true;
        return false;
    }

    public boolean is_scalene()
    {
        if(side1 != side2 && side2 != side3 && side3 != side1)
            return true;
        else
            return false;

    }

    public String toString()
    {
        return side1+" "+side2+" "+side3+" Traingle: ";
    }
}
