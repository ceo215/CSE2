//Colin Orr
//CSE 002
//February 13, 2015
//Lab 4

//This program will determine how many cookies there will be at an event, and if there will be enough cookies for everyone.

//Import the scanner class

import java.util.Scanner;

//Add class and main method
public class Cookies{
    public static void main(String[] args){

//Declare and construct the Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
//Declare variables before if statements to ensure properfunctioning and reassignment later.        
        int nPeople = 0;
        int nCookies = 0;
        int nEach = 0;

//Ask the user forthe number of people at the event
        System.out.print("Enter the number of people: ");
        
        
//Double check that the number is an integer
        if (myScanner.hasNextInt()){ //creates boolean for whether input was integer or not
            nPeople = myScanner.nextInt(); //if boolean comes up true, assigns nPeople to be the input
            if(nPeople>0){ //checks next condition (positive)
                
                System.out.print("Enter the number of cookies you are planning to buy: "); //Prints if true, and nested if statements continue for other two variables in a similar fashion
                 
                
                if (myScanner.hasNextInt()){
                    nCookies = myScanner.nextInt();
                    if(nCookies>0){
                        
                        System.out.print("How many do you want each person to get? ");
                         
                        
                        if (myScanner.hasNextInt()){
                            nEach = myScanner.nextInt();
                            if (nEach>0){
                                //Final series of if statements
                                //Will print one of three results:
                                
                                //If you have enough cookies AND they divide evenly
                                if (nEach*nPeople<=nCookies && nCookies%nPeople==0){
                                    System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                                
                                
                                }
                                
                                //If you have enough cookies AND they don't divide evenly
                                else if (nEach*nPeople<=nCookies && nCookies%nPeople != 0){
                                    System.out.println("You have enough cookies for each person, but they will not divide evenly.");
                                }
                                
                                //Every other case (that is, if you do not have enough cookies)
                                else{
                                    //Print statement also calculates how many more cookeis you will need
                                    System.out.println("You will not have enough cookies. You need to buy at least "+(nPeople*nEach-nCookies)+" more.");
                                }
                                //end of program
                                
                                
                            }
                            else{
                                System.out.println("You must enter a number greater than 0");
                                return;
                            }
                        }    
                        else{
                            System.out.println("You did not enter an int");
                            return;
                            
                        }    
                        
                    }
                    
                    else{
                        System.out.println("You must enter a number greater than 0");
                        return;
                    }
                    
                }
                else{
                    System.out.println("You did not enter an int");
                    return;
                }
                
                
            }    
           
            else{
                System.out.println("You must enter a number greater than 0");
                return;
            }
        }
        
        else{
            System.out.println("You did not enter an int");
            return; //Leaves the program if an integer was not entered.
        }     
     
     
     
    }
}