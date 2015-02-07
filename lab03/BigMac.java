//Colin Orr
//CSE 02
//February 6, 2015
//Lab 03

//This program will accept user input for how many Big Macs they would like to purchase, and then output total cost, taking into account tax.



import java.util.Scanner; //This line will import the scanner class to prevent compiler errors.

//Add Class

public class BigMac {
    
//Now add the main method.
    public static void main(String[] args){
        
        
        Scanner myScanner; //Declares the Scanner object. Necessary to accept user input.
        myScanner = new Scanner( System.in); //This line constructs the Scanner to take input from STDIN.
        
        //Ask the user for the number of Big Macs using a print statement
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        
        //Now acccept user input using the following statement
        int nBigMacs = myScanner.nextInt();
        
        
        //Ask the user for the cost per Big Mac, as well as the percent sales tax using the same method as for the number of Big Macs.
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");//Print statement for Big Mac Cost
        double bigMac$ = myScanner.nextDouble();//Accepts user input for cost
        
        System.out.print("Enter the percent tax as a whole number (xx): "); //Print statement for tax
        double taxRate = myScanner.nextDouble(); //Accepts user input for tax
        
        taxRate/=100; //Since the user enters percent, we convert it and store it as a proportion.
        
        //With all the necessary inputs, we can calculate total cost and print the result for the user.
       
        double cost$; //Declares the variable for cost.
        int dollars, //whole dollar amount of cost
            dimes, pennies; //for storing digits to the right of the decimal point for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate); //Assigns the variable cost$.
        
        //Get the whole amount, dropping decimal fraction.
        dollars = (int) cost$; //Assigns variable dollars and casts it as an integer.
        
        //Get dimes amount, e.g.,
        //(int)(6.73*10)%10 -> 67 % 10 -> 7
        //where the % operator returns the remainder 
        //after the division: 583 % 100 ->83, 27%5 -> 2
        
        dimes=(int)(cost$*10) % 10;
        pennies=(int)(cost$*100) % 10;
        
        //Print the result!
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$+" per BigMac, with a"+" sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies+".");
        
        
    }
}