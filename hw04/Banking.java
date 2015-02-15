//Colin Orr
//CSE 002
//February 17, 2015
//HW 04

//This program will generate a random number to represent the user's funds in the bank.
//Then, the user will be promted to withdraw money, deposit money, or view their balance.
//After the transaction, their resulting balance will be displayed. Use switch statements.

//Import the scanner class

import java.util.Scanner;

//Add class and main method
public class Banking{
    public static void main(String[] args){

//Declare and construct the Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        

//Generate a random number for the user and set as balance.
        double bankBalance = (Math.random()*4001+1000);
//Declare necessary variables for the later.
        double nDeposit;
        double nWithdraw;
        double finalBalance;
        char action;
        
//Ask user if they would like to depoist, withdraw, or view their balance.
        System.out.println("Would you like to deposit money (input 'deposit'), withdraw money (input 'withdraw'), or view your balance (input 'view')?");

//Accept their input for their choice, and prepare char action for comparison
         if(myScanner.hasNextLine()){
            action = myScanner.next().charAt(0);
        
//Use switch statement to get appropriate action
            switch(action){
                case 'd':
                    System.out.println("How much would you like to deposit?");
                    if(myScanner.hasNextDouble()){
                        nDeposit=myScanner.nextDouble();
                        if(nDeposit>=0){
                            finalBalance=bankBalance+nDeposit;
                            System.out.printf("Your new balance is $%.2f\n",finalBalance);
                        }
                        else{
                            System.out.println("Please enter a positive amount to depoist.");
                        }
                    }
                    break;
                
                case 'w':
                    System.out.println("How much would you like to withdraw?");
                    if(myScanner.hasNextDouble()){
                        nWithdraw=myScanner.nextDouble();
                        if(nWithdraw<=bankBalance&&nWithdraw>=0){
                            finalBalance=bankBalance-nWithdraw;
                            System.out.printf("Your new balance is $%.2f\n",finalBalance);
                        }
                        else if(nWithdraw<0){
                            System.out.println("Please enter a positive amount to withdraw.");
                        }
                        else{
                            System.out.println("Insufficient funds to perform withdrawal.");
                            return;
                        }
                    }
                    break;
                
                case 'v':
                    System.out.printf("Your current balance is $%.2f\n",bankBalance);
                    break;
                
            }
        }

    }
}