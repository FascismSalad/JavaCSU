package com.CSUJava;

import java.util.Scanner;


public class Part2 {
    public static void main(String[] args) {

        //Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        //Define a variable to count prices in each loop instance
        double totalCostCounter = 0;

        //Welcome filler text
        System.out.println("Welcome to the Annual Australian Book Festival!");

        //Define a string condition and create a while loop
        String loop = "y";
        while (!loop.equals("n")) {

            //Defining the Large Hardback Price and Discount Price, and the total cost
            int lHardBackPrice = 20;
            int lHardBackDiscount = -10;
            double lHardBackNetCost = 0;

            //Defining the Small Hardback Price and Discount Price, and the total cost
            int sHardBackPrice = 10;
            int sHardBackDiscount = -10;
            double sHardBackNetCost = 0;

            //Defining the Softcover Price and Discount Price, and the total cost
            int softCoverPrice = 5;
            int softCoverDiscount = -5;
            double softCoverNetCost = 0;


            //Ask the user for the amount of each book they purchased and give it to a variable
            System.out.print("Enter Large Hardback Books Purchased: ");
            int lHardBackPurch = input.nextInt();

            System.out.print("Enter Small Hardback Books Purchased: ");
            int sHardBackPurch = input.nextInt();

            System.out.print("Enter Softcover Books Purchased: ");
            int softCoverPurch = input.nextInt();


            //LARGE HARD BACK
            //Ask if there are enough books to qualify for any amount of discount
            if (lHardBackPurch > 1) {

                //The Number of books purchased multiplied by their price without discounts and assigned to variable
                int lHardBackGrossCost = lHardBackPurch * lHardBackPrice;

                //Divide the number of books purchased by the amount required for a discount and assigned to variable
                double lHardBackNumOfDiscount = lHardBackPurch / 2;

                //Rounding the amount of discounts down to the nearest lowest integer
                double lHardBacknumOfDiscountRoundDown = Math.floor(lHardBackNumOfDiscount);

                //Taking the cost before discount, and adding it with the defined discount price multiplied
                //by the amount of times that discount needs to be applied based on how many books they bought
                //This will remove the discount price from the cost before discount, applying the discount
                lHardBackNetCost = (lHardBackGrossCost + (lHardBackDiscount * lHardBacknumOfDiscountRoundDown));

            //If the number of books purchased is equal to less than the required amount for a discount
            //Charge them the cost of those books
            } else if (lHardBackPurch == 1) {
                lHardBackNetCost = lHardBackPrice;

            } else {
                lHardBackNetCost = 0;
            }


            //SMALL HARD BACK
            //Ask if there are enough books to qualify for any amount of discount
            if (sHardBackPurch > 2) {

                //The Number of books purchased multiplied by their price without discounts and assigned to variable
                int sHardBackGrossCost = sHardBackPurch * sHardBackPrice;

                //Divide the number of books purchased by the amount required for a discount and assigned to variable
                double sHardBackNumOfDiscount = sHardBackPurch / 3;

                //Rounding the amount of discounts down to the nearest lowest integer
                double sHardBackNumOfDiscountRoundDown = Math.floor(sHardBackNumOfDiscount);

                //Taking the cost before discount, and adding it with the defined discount price multiplied
                //by the amount of times that discount needs to be applied based on how many books they bought
                //This will remove the discount price from the cost before discount, applying the discount
                sHardBackNetCost = (sHardBackGrossCost + (sHardBackDiscount * sHardBackNumOfDiscountRoundDown));

            //If the number of books purchased is equal to less than the required amount for a discount
            //Charge them the cost of those books
            } else if (sHardBackPurch == 1) {
                sHardBackNetCost = sHardBackPrice;

            } else if (sHardBackPurch == 2) {
                sHardBackNetCost = sHardBackPrice * 2;

            } else {
                sHardBackNetCost = 0;
            }


            //SOFT COVER
            //Ask if there are enough books to qualify for any amount of discount
            if (softCoverPurch > 3) {

                //The Number of books purchased multiplied by their price without discounts and assigned to variable
                int softCoverGrossCost = softCoverPurch * softCoverPrice;

                //Divide the number of books purchased by the amount required for a discount and assigned to variable
                double softCoverNumOfDiscount = softCoverPurch / 4;

                //Rounding the amount of discounts down to the nearest lowest integer
                double softCoverNumOfDiscountRoundDown = Math.floor(softCoverNumOfDiscount);

                //Taking the cost before discount, and adding it with the defined discount price multiplied
                //by the amount of times that discount needs to be applied based on how many books they bought
                //This will remove the discount price from the cost before discount, applying the discount
                softCoverNetCost = (softCoverGrossCost + (softCoverDiscount * softCoverNumOfDiscountRoundDown));

            //If the number of books purchased is equal to less than the required amount for a discount
            //Charge them the cost of those books
            } else if (softCoverPurch == 1) {
                softCoverNetCost = softCoverPrice;

            } else if (softCoverPurch == 2) {
                softCoverNetCost = softCoverPrice * 2;

            } else if (softCoverPurch == 3) {
                softCoverNetCost = softCoverPrice * 3;

            } else {
                softCoverNetCost = 0;
            }


            double totalCost = (lHardBackNetCost + sHardBackNetCost) + softCoverNetCost;

        //Creates a running total
        totalCostCounter = totalCostCounter + totalCost;


            //Prints the total cost
            System.out.println("The total price is: $"+(long)totalCost+"\n");

            //Asks the user if they want to loop
            System.out.print("Would you like to loop? y/n: ");
            loop = input.next();
        }

        //Displays the total running cost and ends the program
        System.out.println("Your total cost this session is: $"+(long)totalCostCounter);
        System.out.println("Goodbye!");
    }
}

