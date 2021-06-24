//********************************************************************************************************
// CLASS: Main (Main.java)
//
// DESCRIPTION
//
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer and 2019
// Project Number: project #1
//
// AUTHOR: Kevin Torrens, ktorrens, ktorrens@asu.edu
//************************************************************************************************


import java.util.ArrayList;
import java.util.List;

public class Main2
{
    //Declare the method named getIncreasingSequence
    static List<Integer> getIncreasingSequence(int[] arr)
    {
        //Declare an arraylist to store up sequence
        List<List<Integer>> up = new ArrayList<>();

        for (int i =0; i < arr.length; i++)
        {
            up.add(new ArrayList<>());
        }

        //initialize up arraylist by the 0th element of array
        up.get(0).add(arr[0]);

        //loop to compare each list array
        for (int i = 1; i< arr.length; i++)
        {
            //loop to traverse the complete array
            for (int j = 0; j<i; j++)
            {
                //compare each element by the rest of the elements of the array\
                if (arr[i] > arr[j] && up.get(i).size() < up.get(j).size() + 1)
                {
                    //if get the required sequence then set in the list
                    up.set(i, new ArrayList<>(up.get(j)));
                }
            }
            //add the element to the arraylist
            up.get(i).add(arr[i]);
        }
        //declare an another list named upSequence
        List<Integer> upSequence = up.get(0);

        for (int i = 0; i< up.size(); i++)
        {
            //if element of the arraylist upsequence is greater then
            // up arraylist then add up in the upsequence

            if(upSequence.size() < up.get(i).size())
            {
                upSequence = new ArrayList<>(up.get(i));
            }
        }
        //return arrayList
        return upSequence;
    }
    //Declare the method named getDecreasingSequence
    static List<Integer> getDecreasingSequence(int[] segment)
    {

        //Declare an arraylist to store down sequence
        List<List<Integer>> down = new ArrayList<>();

        //Loop to add the size of the arraylist
        for (int i = 0; i < segment.length; i++)

        {
            down.add(new ArrayList<>());
        }

        //initialize down arraylist by the 0th elemnt of array
        down.get(0).add(segment[0]);

        //loop to traverse the complete array
        for (int i = 1; i < segment.length; i++)

        {

            //loop to compare each list element
            for (int j = 0; j < i; j++)
            {
                //compare each element by the rest of the elements of the array
                if (segment[i] < segment[j] && down.get(i).size() < down.get(j).size() + 1)
                {
                    //If get the required sequence then set in the list
                    down.set(i, new ArrayList<>(down.get(j)));
                }
            }
            //add that element to the arraylist
            down.get(i).add(segment[i]);
        }

        //declare an another list named downSequence
        List<Integer> downSequence = down.get(0);

        //List will traverse untill the size of the up arraylist
        for (int i = 0; i < down.size(); i++)
        {
            //if element of the arraylist upsequence is less then down arraylist then add down in the upsequence
            if (downSequence.size() < down.get(i).size())
            {
                downSequence = new ArrayList<>(down.get(i));
            }
        }

        //return arraylist
        return downSequence;

    }

    public static void main(String[] args)
    {
        //decalare an array list
        int list[] = {2, 8, 3, 2, 9, 8, 6, 3, 4, 6, 1, 9};

        //call the method getIncreasingSequence to print up list
        System.out.println("Runs Up: " + getIncreasingSequence(list).toString());

        //call the method getDecreasingSequence to print down list
        System.out.println("Runs Down: " + getDecreasingSequence(list).toString());

    }

}
