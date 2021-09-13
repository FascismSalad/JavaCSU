package com.CSUJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        //ask for user input for birth, death and immigrant rate and assign them to variables as integers
        System.out.print("Enter the seconds for every birth: ");
        int birthRate = input.nextInt();

        System.out.print("Enter the seconds for every immigrant: ");
        int immigrantRate = input.nextInt();

        System.out.println("Enter the seconds for every death: ");
        int deathRate = input.nextInt();

        System.out.println("Enter the current population: ");
        long currentPopulation = input.nextInt();

        System.out.println("Enter the amount of years you want to project: ");
        int years = input.nextInt();


        //I am assuming 31,536,000 seconds in one year, from 60 seconds in 1 minutes x 60 x 24 x356
        long secInYear = 31536000;
        long totalSeconds = secInYear * years;

        //Gets the rates of each by dividing by the seconds in a year
        long annualBirths = totalSeconds / birthRate;
        long annualDeaths = totalSeconds / deathRate;
        long annualImmigrants = totalSeconds / immigrantRate;

        //Adds all of the rates together and removes the deaths
        long popGrowth = ((annualBirths + annualImmigrants) + currentPopulation) - annualDeaths;



        System.out.println("The population in "+years+" years will be :"+popGrowth);


    }
}
*/
