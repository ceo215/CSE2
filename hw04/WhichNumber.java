//Colin Orr
//CSE 002
//February 17, 2015
//HW 04

//This program will prompt the user to think of a number, and, through a series of questions, determine the number the user is thinking of.

//Import the scanner class
import java.util.Scanner;

//Add the class and main method
public class WhichNumber{
    public static void main(String[]args){
        
//Declare and construct the Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
//Declares a variable to check each string with for later during if statements.
char userAnswer = 'o';

//Ask the user to think of a number
        System.out.println("Think of a number between 1 and 10, inclusive.");
        System.out.println("Answer all questions with 'y', 'Y', 'n', or 'N'.");
        
//Begin series of questioning and accepting input, using nested if statements.
        System.out.println("Is the number even?");
        
        if(myScanner.hasNextLine()){ //Checks that the user properly inputted their response.
            userAnswer = myScanner.next().charAt(0); //sets our variable as their response
            
            if(userAnswer == 'y'||userAnswer == 'Y'){ //checks if their answer was yes, proceeds to ask further questions
                System.out.println("Is it divisible by 3?");
                
                if(myScanner.hasNextLine()){
                    userAnswer = myScanner.next().charAt(0);
                    
                    if(userAnswer == 'y'||userAnswer == 'Y'){
                        System.out.println("Your number is 6.");
                    }
                    
                    else if(userAnswer == 'n'||userAnswer=='N'){
                        System.out.println("Is the number divisible by 4?");
                        
                        if(myScanner.hasNextLine()){
                            userAnswer = myScanner.next().charAt(0);
                    
                            if(userAnswer == 'y'||userAnswer == 'Y'){
                                System.out.println("Is the number divided by 4 greater than 1?");
                            
                                if(myScanner.hasNextLine()){
                                    userAnswer = myScanner.next().charAt(0);
                    
                                    if(userAnswer == 'y'||userAnswer == 'Y'){
                                        System.out.println("Your number is 8.");
                                    }
                    
                                    else if(userAnswer == 'n'||userAnswer=='N'){
                                        System.out.println("Your number is 4.");
                                    } 
                                    
                                    else{
                                        System.out.println("Please enter 'y', 'Y', 'n', or 'N'."); //First of many instances if user does not enter a valid response.
                                        return;
                                    }    
                                }

                            }
                    
                            else if(userAnswer == 'n'||userAnswer=='N'){
                                System.out.println("Is the number divisible by 5?");
                                
                                if(myScanner.hasNextLine()){
                                    userAnswer = myScanner.next().charAt(0);
                    
                                    if(userAnswer == 'y'||userAnswer == 'Y'){
                                        System.out.println("Your number is 10.");
                                    }
                    
                                    else if(userAnswer == 'n'||userAnswer=='N'){
                                        System.out.println("Your number is 2.");
                                    } 
                                
                                    else{
                                        System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                                        return;
                                    }
                                }

                            }
                            else{
                                System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                                return;
                            }
                        }

                    }
                    else{
                        System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                        return;
                    }
                }

            }
            
            else if(userAnswer == 'n'||userAnswer=='N'){
                System.out.println("Is it divisible by 3?");
                
                if(myScanner.hasNextLine()){
                    userAnswer = myScanner.next().charAt(0);
                            
                    if(userAnswer == 'y'||userAnswer == 'Y'){
                        System.out.println("When divided by 3, is the result greater than 1?");
                            
                        if(myScanner.hasNextLine()){
                            userAnswer = myScanner.next().charAt(0);
                    
                            if(userAnswer == 'y'||userAnswer == 'Y'){
                                System.out.println("Your number is 9.");
                            }
                    
                            else if(userAnswer == 'n'||userAnswer=='N'){
                                System.out.println("Your number is 3.");
                            } 
                        
                            else{
                                System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                                return;
                            }
                        }

                    }                    
                
                    else if(userAnswer == 'n'||userAnswer=='N'){
                        System.out.println("Is the number greater than 6?");
                            
                        if(myScanner.hasNextLine()){
                            userAnswer = myScanner.next().charAt(0);
                    
                            if(userAnswer == 'y'||userAnswer == 'Y'){
                                System.out.println("Your number is 7.");
                            }
                    
                            else if(userAnswer == 'n'||userAnswer=='N'){
                                System.out.println("Is the number less than 3?");
                            
                                if(myScanner.hasNextLine()){
                                    userAnswer = myScanner.next().charAt(0);
                    
                                    if(userAnswer == 'y'||userAnswer == 'Y'){
                                        System.out.println("Your number is 1.");
                                    }
                    
                                    else if(userAnswer == 'n'||userAnswer=='N'){
                                        System.out.println("Your number is 5.");
                                    } 
                                
                                    else{
                                        System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                                        return;
                                    }
                                }

                            }
                        
                            else{
                                System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                                return;
                            }
                        }

                
                    }
                
                    else{
                        System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                        return;
                    }
                }

            }
        
            else{
                System.out.println("Please enter 'y', 'Y', 'n', or 'N'.");
                return;
            }
        } //first if
        
    } // end main method
} // end class