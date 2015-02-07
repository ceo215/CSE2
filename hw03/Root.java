//Colin Orr
//CSE 002
//February 10, 2015
//Homework 3

//This program will accept input of a double by the user and will print an estimate of the cube root through an iterative guessing process.

//Import the scanner
import java.util.Scanner;

//Add the class
public class Root{

//Add the main method
    public static void main(String[]args){

//Declare and construct the Scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);

//Ask the user for the input
        System.out.print("Enter a double, and I print its cube root- "); //Prints the request of the user.
        double nUser = myScanner.nextInt(); //Accepts the input of the user.

//Calculate the cube using an iterative guess method.
        double guess1 = nUser/3;
        double guess2 = (2*guess1*guess1*guess1+nUser)/(3*guess1*guess1); //Uses previous guess to better estimate
        double guess3 = (2*guess2*guess2*guess2+nUser)/(3*guess2*guess2); //Repeats step above for new estimate
        double guess4 = (2*guess3*guess3*guess3+nUser)/(3*guess3*guess3); //Continues process 3 more times
        double guess5 = (2*guess4*guess4*guess4+nUser)/(3*guess4*guess4);
        double cubeRoot = (2*guess5*guess5*guess5+nUser)/(3*guess5*guess5);
        
        double rootCubed = (cubeRoot*cubeRoot*cubeRoot); //calculates cube based of our final estimate.

//Print the result
        System.out.println("The cube root is "+cubeRoot+":");
        System.out.println(cubeRoot+"*"+cubeRoot+"*"+cubeRoot+"=");
        System.out.println(rootCubed);
    
    }
}    
    
