//Colin Orr
//CSE 002
//February 10, 2015
//HW 03

//The program will accept input of a double from the user and display the first four digits after the decimal point

//Imports the Scanner
import java.util.Scanner;

//Add the class
public class FourDigits{
    
//Add the main method
    public static void main(String[]args){
        
//Declare and construct the Scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);

//Ask the user for their input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double nDouble = myScanner.nextDouble(); //Accepts the user input into the variable nUser.
        
//Find the individual digits to the right of the decimal point
        int tenthPlace = (int)(nDouble*10)%10; //Gives a remainder such that the remainder is the same as the tenth place of the double
        int hundrethPlace = (int)(nDouble*100)%10; //Gives a remainder such that the remainder is the same as the hundreth place of the double
        int thousandthPlace = (int)(nDouble*1000)%10; //Gives a remainder such that the remainder is the same as the thousandth place of the double
        int tenThousandthPlace = (int)(nDouble*10000)%10; //Gives a remainder such that the remainder is the same as the ten thousandth place of the double
        
        System.out.print("The four digits are: "+tenthPlace); //Prints the first digit to the right of the decimal
        System.out.print(hundrethPlace); //Prints the second digit to the right of the decimal on the same line without adding it to the previous number.
        System.out.print(thousandthPlace); //Prints the third digit to the right of the decimal on the same line without adding it to the previous number.
        System.out.println(tenThousandthPlace); //Prints the fourth digit to the right of the decimal on the same line without adding it to the previous number.
    }
    
}