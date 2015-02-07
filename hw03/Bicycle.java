//Colin Orr
//CSE 002
//February 10, 2015
//Homework 3

//This program will take inputs from the user for counts on a
//cyclometer and time. Then the program will output distance
//travelled and average miles per hour.

import java.util.Scanner; //Imports the scanner.

//Add the class
public class Bicycle {
    
//Add the main method
    public static void main(String[]args){
        
        Scanner myScanner; //Declares the scanner
        myScanner = new Scanner (System.in); //Construts the scanner.
        
//Ask the user for the various inputs
        System.out.print("Enter the number of seconds: "); //Asks for the input for seconds
        int nSeconds = myScanner.nextInt(); //Accepts the input for seconds
        
        System.out.print("Enter the number of counts: "); //Asks for the input for counts
        int nCounts = myScanner.nextInt(); //Accepts the input for counts
        
//Declare and assign intermediate variables.
        double wheelDiameter = 27.0, //Diameter of the wheel in inches.
        PI = 3.14159, //The value for PI.
        feetPerMile = 5280, //Conversion factor of feet to miles
        inchesPerFoot = 12, //Conversion factor of inches to feet
        secondsPerMinute = 60, //Conversion factor of seconds to minutes
        minutesPerHour = 60; //Conversion factor of minutes to hours
//Declare result variables and perform computations
        double tripDistance = (nCounts*wheelDiameter*PI)/(inchesPerFoot*feetPerMile); //Calculates distance in miles
        
        double tripTime = nSeconds/secondsPerMinute; //Calculates trip time in minutes
        
        double averageSpeed = tripDistance/(tripTime/minutesPerHour); //Calculates the average miles per hour
//Print the results
        System.out.printf("The distance was %.2f",tripDistance); //Simplifies print to two decimal points.
        System.out.printf(" miles and took %.1f",tripTime);
        System.out.println(" minutes.");
        System.out.printf("The average mph was %.2f\n",averageSpeed);
    }
}