package com.CSUJava;

import java.util.Arrays;


//Begins the main method
public class ProcessMarks {
    public static void main(String[] args) {
        //This Main method is calling the other methods inside this class
        min();
        int minimum = min();
        System.out.println("The minimum is: "+minimum);

        max();
        int maximum = max();
        System.out.println("The maximum is: "+maximum);

        range();
        int markRange = range();
        System.out.println("The range is: "+markRange);

        mean();
        int markMean = mean();
        System.out.println("The mean is: "+markMean);

        median();
        int markMedian = median();
        System.out.println("The median is: "+markMedian);

        mode();
        int markMode = mode();
        System.out.println("The mode is: "+markMode);

        grades();
        String[] markGrades = grades();
        System.out.println(Arrays.toString(markGrades));

    }



    //Finds the lowest mark value
    static int min() {
        //Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        //Sorts the array from lowest to highest, and then takes index 0, the lowest number
        Arrays.sort(tempArray);
        return tempArray[0];
    }



    //Finds the highest mark value
    static int max() {
        //Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        //Sorts the array from lowest to highest, and then takes index 124, the highest number
        Arrays.sort(tempArray);
        return tempArray[tempArray.length - 1];
    }



    //Finds the range of the marks
    static int range() {
        //Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        //Sorts the array from lowest to highest, and then takes the min and max
        Arrays.sort(tempArray);
        int min = tempArray[0];
        int max = tempArray[tempArray.length - 1];

        //Subtracts the min from the max to find the range
        int range = max - min;
        return range;
    }



    //Finds the mean of the marks
    static int mean() {
        //Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        //Define the sum and length variable for the loop
        int sum = 0;
        int length = tempArray.length;

        //Gets the sum of every number in the Array and divides it by the length of the array
        for (int i = 0; i < tempArray.length; i++) {
            sum += tempArray[i];
        }

        int mean = sum / length;
        return mean;
    }



    //Finds the median of the marks
    static int median() {
        //Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        Arrays.sort(tempArray);
        return tempArray[tempArray.length / 2];
    }



    //Finds the mode of the marks
    static int mode() {
        //Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        //Sets a variable foe the length of the array
        int arrLength = tempArray.length;

        //sets the count and value variables
        int maxValue = 0;
        int maxCount = 0;

        //Sets a loop that counts each instance of a number and returns the highest counted number
        for (int i = 0; i < arrLength; ++i) {
            int count = 0;

            for (int x = 0; x < arrLength; ++x) {

                if (tempArray[x] == tempArray[i])
                        ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = tempArray[i];
            }
        }

        int mode = maxValue;
        return mode;
    }



    //Assigns a letter grade to each mark
    static String[] grades() {
//Creates an object to get the mark values from the Marks class
        Marks markObj = new Marks();
        //Stores the original array and creates a copy so as to not damage the original
        int[] originArray = markObj.getMarks();
        int[] tempArray = originArray;

        //Creates a new string for the letter grades
        String[] gradeArray = new String[124];

        //Creates a loop that looks at every index of the numbers and assigns a grade to the grade index for it
        for (int i = 0; i < tempArray.length - 1; ++i) {

            //F
            if(tempArray[i] < 50) {
                gradeArray[i] = "F";
            }

            //E
            else if(tempArray[i] >= 50 && tempArray[i] < 55){
                gradeArray[i] = "E";
            }

            //D
            else if(tempArray[i] >= 55 && tempArray[i] < 65) {
                gradeArray[i] = "D";
            }

            //C
            else if(tempArray[i] >= 65 && tempArray[i] < 75){
                gradeArray[i] = "C";
            }

            //B
            else if(tempArray[i] >= 75 && tempArray[i] < 85){
                gradeArray[i] = "B";
            }

            //A
            else {
                gradeArray[i] = "A";
            }
        }
        String[] grades = gradeArray;
        return grades;
    }
}





