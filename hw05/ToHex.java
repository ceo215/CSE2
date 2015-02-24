//Colin Orr
//CSE 002
//February 24, 2015
//Homework 5

//This program will take three inputs from the user for RGB values in decimal and convert it to hexadecimal.

//Import the Scanner
import java.util.Scanner;

//Add Class and main method
public class ToHex{
    public static void main(String[]args){
        
        //Declare and construct the scanner to take input
        Scanner myScanner = new Scanner(System.in);
        
        //Declare useful variables for later
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        String quotientA = "X";
        String remainderA= "X";
        String quotientB = "X";
        String remainderB= "X";
        String quotientC = "X";
        String remainderC= "X";        
        
        //Print the instructions for the user
        System.out.println("Please enter three positive integers representing RGB values: ");
        
        //Accept the input and check it is in the appropriate range
        if (myScanner.hasNextInt()){
            value1= myScanner.nextInt();
            if(value1>=0&&value1<=255){
                
                if (myScanner.hasNextInt()){
                    value2= myScanner.nextInt();
                    if(value2>=0&&value2<=255){
                
                        if (myScanner.hasNextInt()){
                            value3= myScanner.nextInt();
                            if(value3>=0&&value3<=255){
                                
                                                
                                //Convert the values to hexadecimal.
                                int quotient1=value1/16; //Digit 1 in hexadecimal
                                int remainder1=value1%16; //Digit 2 in hexadecimal
                                int quotient2=value2/16; //Digit 3 in hexa
                                int remainder2=value2%16; //Digit 4
                                int quotient3=value3/16; // Digit 5
                                int remainder3=value3%16; //Digit 6

                                //Use MANY switch statements to set a new variable equal to a string
                                //This allows conversion to a result that can be printed digit by digit, including letters
                                switch (quotient1){
                                    case 0:
                                        quotientA = "0";
                                        break;
                                    case 1:
                                        quotientA = "1";
                                        break;
                                    case 2:
                                        quotientA = "2";
                                        break;
                                    case 3:
                                        quotientA = "3";
                                        break;
                                    case 4:
                                        quotientA = "4";
                                        break;
                                    case 5:
                                        quotientA = "5";
                                        break;
                                    case 6:
                                        quotientA = "6";
                                        break;
                                    case 7:
                                        quotientA = "7";
                                        break;
                                    case 8:
                                        quotientA = "8";
                                        break;
                                    case 9:
                                        quotientA = "9";
                                        break;
                                    case 10:
                                        quotientA = "A";
                                        break;
                                    case 11:
                                        quotientA = "B";
                                        break;
                                    case 12:
                                        quotientA = "C";
                                        break;
                                    case 13:
                                        quotientA = "D";
                                        break;
                                    case 14:
                                        quotientA = "E";
                                        break;
                                    case 15:
                                        quotientA = "F";
                                        break;
                                }
                                
                                switch (remainder1){
                                    case 0:
                                        remainderA = "0";
                                        break;
                                    case 1:
                                        remainderA = "1";
                                        break;
                                    case 2:
                                        remainderA = "2";
                                        break;
                                    case 3:
                                        remainderA = "3";
                                        break;
                                    case 4:
                                        remainderA = "4";
                                        break;
                                    case 5:
                                        remainderA = "5";
                                        break;
                                    case 6:
                                        remainderA = "6";
                                        break;
                                    case 7:
                                        remainderA = "7";
                                        break;
                                    case 8:
                                        remainderA = "8";
                                        break;
                                    case 9:
                                        remainderA = "9";
                                        break;
                                    case 10:
                                        remainderA = "A";
                                        break;
                                    case 11:
                                        remainderA = "B";
                                        break;
                                    case 12:
                                        remainderA = "C";
                                        break;
                                    case 13:
                                        remainderA = "D";
                                        break;
                                    case 14:
                                        remainderA = "E";
                                        break;
                                    case 15:
                                        remainderA = "F";
                                        break;
                                }
                                
                                switch (quotient2){
                                    case 0:
                                        quotientB = "0";
                                        break;
                                    case 1:
                                        quotientB = "1";
                                        break;
                                    case 2:
                                        quotientB = "2";
                                        break;
                                    case 3:
                                        quotientB = "3";
                                        break;
                                    case 4:
                                        quotientB = "4";
                                        break;
                                    case 5:
                                        quotientB = "5";
                                        break;
                                    case 6:
                                        quotientB = "6";
                                        break;
                                    case 7:
                                        quotientB = "7";
                                        break;
                                    case 8:
                                        quotientB = "8";
                                        break;
                                    case 9:
                                        quotientB = "9";
                                        break;
                                    case 10:
                                        quotientB = "A";
                                        break;
                                    case 11:
                                        quotientB = "B";
                                        break;
                                    case 12:
                                        quotientB = "C";
                                        break;
                                    case 13:
                                        quotientB = "D";
                                        break;
                                    case 14:
                                        quotientB = "E";
                                        break;
                                    case 15:
                                        quotientB = "F";
                                        break;
                                }
                                
                                switch (remainder2){
                                    case 0:
                                        remainderB = "0";
                                        break;
                                    case 1:
                                        remainderB = "1";
                                        break;
                                    case 2:
                                        remainderB = "2";
                                        break;
                                    case 3:
                                        remainderB = "3";
                                        break;
                                    case 4:
                                        remainderB = "4";
                                        break;
                                    case 5:
                                        remainderB = "5";
                                        break;
                                    case 6:
                                        remainderB = "6";
                                        break;
                                    case 7:
                                        remainderB = "7";
                                        break;
                                    case 8:
                                        remainderB = "8";
                                        break;
                                    case 9:
                                        remainderB = "9";
                                        break;
                                    case 10:
                                        remainderB = "A";
                                        break;
                                    case 11:
                                        remainderB = "B";
                                        break;
                                    case 12:
                                        remainderB = "C";
                                        break;
                                    case 13:
                                        remainderB = "D";
                                        break;
                                    case 14:
                                        remainderB = "E";
                                        break;
                                    case 15:
                                        remainderB = "F";
                                        break;
                                }
                                
                                switch (quotient3){
                                    case 0:
                                        quotientC = "0";
                                        break;
                                    case 1:
                                        quotientC = "1";
                                        break;
                                    case 2:
                                        quotientC = "2";
                                        break;
                                    case 3:
                                        quotientC = "3";
                                        break;
                                    case 4:
                                        quotientC = "4";
                                        break;
                                    case 5:
                                        quotientC = "5";
                                        break;
                                    case 6:
                                        quotientC = "6";
                                        break;
                                    case 7:
                                        quotientC = "7";
                                        break;
                                    case 8:
                                        quotientC = "8";
                                        break;
                                    case 9:
                                        quotientC = "9";
                                        break;
                                    case 10:
                                        quotientC = "A";
                                        break;
                                    case 11:
                                        quotientC = "B";
                                        break;
                                    case 12:
                                        quotientC = "C";
                                        break;
                                    case 13:
                                        quotientC = "D";
                                        break;
                                    case 14:
                                        quotientC = "E";
                                        break;
                                    case 15:
                                        quotientC = "F";
                                        break;
                                }
                                
                                switch (remainder3){
                                    case 0:
                                        remainderC = "0";
                                        break;
                                    case 1:
                                        remainderC = "1";
                                        break;
                                    case 2:
                                        remainderC = "2";
                                        break;
                                    case 3:
                                        remainderC = "3";
                                        break;
                                    case 4:
                                        remainderC = "4";
                                        break;
                                    case 5:
                                        remainderC = "5";
                                        break;
                                    case 6:
                                        remainderC = "6";
                                        break;
                                    case 7:
                                        remainderC = "7";
                                        break;
                                    case 8:
                                        remainderC = "8";
                                        break;
                                    case 9:
                                        remainderC = "9";
                                        break;
                                    case 10:
                                        remainderC = "A";
                                        break;
                                    case 11:
                                        remainderC = "B";
                                        break;
                                    case 12:
                                        remainderC = "C";
                                        break;
                                    case 13:
                                        remainderC = "D";
                                        break;
                                    case 14:
                                        remainderC = "E";
                                        break;
                                    case 15:
                                        remainderC = "F";
                                        break;
                                }
                                
                                //Compiles the final digits/letters into a single string
                                String result = quotientA+remainderA+quotientB+remainderB+quotientC+remainderC;
                                
                                //Print your Answer
                                System.out.println("The decimal numbers R:"+value1+", G:"+value2+", and B:"+value3+" are represented in hexadecimal as "+result);
                                
                
                
                
                            }
                            
                            //Else statements appear at appropriate intervals to prompt user if they made a mistake
                            else{
                                System.out.println("Please enter a value between 0 and 255.");
                            }    
                        }
                        else{
                            System.out.println("Please enter an integer.");
                        }    
                    }
                    else{
                        System.out.println("Please enter a value between 0 and 255.");
                    }
                }
                else{
                    System.out.println("Please enter an integer.");
                }
            }
            else{
                System.out.println("Please enter a value between 0 and 255.");
            }   
        }
        else{
            System.out.println("Please enter an integer.");
        }
        
        
        
    }
}
