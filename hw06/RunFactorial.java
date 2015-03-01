//Colin Orr
//CSE 002
//Homework 6
//March 3, 2015

// This program will calculate the values of a factorial given by the user

//Import Scanner class

import java.util.Scanner;

//Add class and main method
public class RunFactorial{
    public static void main(String[]args){
        
        //Declare scanner and other useful variables
        Scanner myScanner= new Scanner(System.in);
        
        int theirNumber = 0;
        int counter1 = 0;
        int counter2 = 1;
        int result = 1;
        
        //Prompt user for number.
        System.out.println("Please enter a number between 9 and 16.");
        
        //While loop will run until counter reaches 1, which only happens if an appropriate input is entered as judged from two if statements.
        while (counter1<1){
            if(myScanner.hasNextInt()){ //Checks for integer
                theirNumber = myScanner.nextInt();
                if (theirNumber>=9 && theirNumber<=16){ //Checks if in appropriate range
                    System.out.println("Input accepted: ");
                    System.out.print(theirNumber+"!= ");
                    
                    //This while loop performs the computation of the factorial
                    while(counter2<theirNumber){
                        result*=theirNumber;
                        theirNumber--;
                    }
                    System.out.print(result);
                    counter1++; //Will cause the initial while loop to finally end
                }
                else{
                    System.out.println("Invalid input, enter again!"); //case if its not in range
                }
            }
            else{
                System.out.println("Invalid input, enter again!"); //case if its not an integer
                myScanner.next(); //clears the original input to prevent infinite loop
            }        
            
        }
        
        System.out.println(); //A line for style
    }
}