//Colin Orr
//CSE 002
//Homework 6
//March 3, 2015

//This program will accept 5 positive integers from the user and print their sum.

//Import Scanner class

import java.util.Scanner;

//Add class and main method
public class GetIntegers{
    public static void main(String[]args){
        
        //Declare variables for use later
        int number1 = 0;
        int number2 = 0;
        
        //Declare the scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Ask the user for input
        System.out.println("Please enter 5 non-negative integers:");
        
        //For loop will sum the numbers
        for(int i=1; i<6; i++){
            
            //Checks if it is an integer. If it is, assigns it to be number1
            if(myScanner.hasNextInt()){
                number1=myScanner.nextInt();
                
                //Checks to see if it is positive. If it is, contributes value to sum
                if(number1>=0){
                    number2+=number1;    
                }
                //If not positive, will prompt user for new answer. i-- sets counter for loop back once to make sure 5 inputs are received.
                else{
                    System.out.println("Please enter a positive integer. Try again.");
                    i--;
                    
                    
                }

            }
            //If not an integer, prompts user for a new answer and sets counter back one
            else{
                System.out.println("Please enter a positive integer. Try again.");
                i--;
                myScanner.next(); //Clears wrong input from scanner to prevent infinite loop
                
            }
        }
        
        //Prints the final sum
        System.out.println("The sum is "+number2);
        
    }
}