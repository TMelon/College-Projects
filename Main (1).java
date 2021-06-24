//********************************************************************************************************
// CLASS: Main (Main.java)
//
// DESCRIPTION
//
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures,  and year
// Project Number: project-number
//
// AUTHOR: your-name, your-asuriteid, your-email-addr
//********************************************************************************************************


import java.util.Scanner;

import java.util.ArrayList;

import java.io.FileNotFoundException;

import java.io.File;

import java.io.PrintWriter;

// define the class

public class Main {

// define the main() method.

    public static void main(String[] args) throws FileNotFoundException {

// create an object for the class Main

        Main mainObject = new Main();

// call the run () method using the class object.

        mainObject.run();

    }

// definition of the method run()

    private void run() throws FileNotFoundException {

// declare the sring variables.

        final String RUNS_UP = "RunsUp";

        final String RUNS_DN = "RunsDown";

// create an array list and read the input file into the array list

// by calling the method inputFileToList()

        ArrayList<Integer> list = inputFileToList("p01-in.txt");

// Declare and create an ArrayList of Integers named listRunsUpCount

        ArrayList<Integer> listRunsUpCount = new ArrayList<>();

// cDeclare and create an ArrayList of Integers named listRunsDnCount

        ArrayList<Integer> listRunsDnCount = new ArrayList<>();

// Declare and create an ArrayList of Integers named listRunsCount

        ArrayList<Integer> listRunsCount = new ArrayList<>();

// call the findRuns() method by passing the list and RUNS_UP and assign to the

// list listRunsUpCount.

        listRunsUpCount = findRuns(list, RUNS_UP);

// call the findRuns() method by passing the list and RUNS_DN and assign to the

// list listRunsDnCount

        listRunsDnCount = findRuns(list, RUNS_DN);

// call the method merge() by pasing the lists listRunsUpCount and listRunsDnCount

        listRunsCount = merge(listRunsUpCount, listRunsDnCount);

// call the method Output() and give the output file name and list to count the runs.

        Output("p01-runs.txt", listRunsCount);

    }// end of the main() method.

// definition of the method arrayListCreate()

// this method creates an object of the array list.

    public static ArrayList<Integer> arrayListCreate(int pSize, int pInitValue) {

// create an array list.

        ArrayList<Integer> list = new ArrayList<>();

// add the values to the list untill size.

        for (int i = 0; i < pSize; i++) {

            list.add(pInitValue);

        }

// return the arrayList.

        return list;

    }// end of the method.

// definition of the method inputFileToList()

// this method reads the files and adds integers to the list.

    public static ArrayList<Integer> inputFileToList(String fileParse) throws FileNotFoundException {

// create an array list.

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

// create a file object.

        File inFile = new File(fileParse);

// create a scannner object.

        Scanner scan = new Scanner(inFile);

// read the file

        while (scan.hasNextInt()) {

// and add to the list.

            listOfIntegers.add(scan.nextInt());

        }

// return the array list.

        return listOfIntegers;

    }// end of the method.

// definition of the method findRuns

// this method finds the run ups and run downs.

    public static ArrayList<Integer> findRuns(ArrayList<Integer> pList, String pDir) {

//create an array list and call the method arrayListCreate()

        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(), 0);

// declare the variables.

        int indexk;

        int i = 0;

        int k = 0;

// run the while loop until size

        while (i < pList.size() - 1) {

// If pDir is RUNS_UP and pList element at i is ≤ pList element at i + 1 Then

// Increment k

            if (pDir.equals("RunsUp") && pList.get(i) <= pList.get(i + 1)) {

                k++;

            }

// ElseIf pDir is RUNS_DN and pList element at i is ≥ pList element at i + 1 Then

//Increment k

            else if (pDir.equals("RunsDown") && pList.get(i) >= pList.get(i + 1)) {

                k++;

            } else {

//If k ≠ 0 Then

//Increment the element at index k of listRunsCount

                if (k != 0) {

                    indexk = listRunsCount.get(k);

                    listRunsCount.set(k, indexk + 1);

//k ← 0

                    k = 0;

                }//End if

            }//End if

//increment i

            i++;

        }//End While

//If k ≠ 0 Then

//Increment the element at index k of listRunsCount

        if (k != 0) {

            indexk = listRunsCount.get(k);

            listRunsCount.set(k, indexk + 1);

            k = 0;

        }

//Return listRunsCount

        return listRunsCount;

    }//End Method FindRuns

// definition of the method merge

// this method merges the run ups and run downs.

    public static ArrayList<Integer> merge(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) {

//create an array list and call the method arrayListCreate()

        ArrayList<Integer> upDownMerge = arrayListCreate(pListRunsUpCount.size(), 0);

//set element i of listRunsCount to the sum of the elements at i in pListRunsUpCount and pListRunsDnCount

        for (int i = 0; i < pListRunsUpCount.size() - 1; i++) {

            int sum = pListRunsUpCount.get(i) + pListRunsDnCount.get(i);

            upDownMerge.set(i, sum);

        }

        return upDownMerge;

    }//End Method merge

// definition of the method Output()

// this method creates the outfile and prints the output data

    public static void Output(String pFileName, ArrayList<Integer> pListRuns) {

        try {

            File outputFile = new File(pFileName);

            PrintWriter output = new PrintWriter(outputFile);

            int sumPListRuns = 0;

// callculate the runs

            for (int i = 0; i < pListRuns.size(); i++) {

                sumPListRuns += pListRuns.get(i);

            }

// prin the output in the output file.

            output.println("runs_total, " + sumPListRuns + "\n");

            for (int k = 1; k < pListRuns.size(); k++) {

                output.println("runs_" + k + ", " + pListRuns.get(k));

            }

            output.close();

        } catch (FileNotFoundException x) {

            x.printStackTrace();

        }

    }//End Method Output

}
