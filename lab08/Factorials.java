//Colin Orr
//CSE 002
//March 20, 2015
//Lab 08

//This program will use methods to calculate a super factorial.

import java.util.Scanner;

public class Factorials{
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        int superFactorial = 0;
        
        System.out.println("Please enter a positive integer: ");
        
        for(int k = 0; k<1;k++){
            if (myScanner.hasNextInt()){
                int userInput = myScanner.nextInt();
                if (userInput>=0){
                    for(int j = 1; j<=userInput; j++){
                        superFactorial+=factorial(j);
                    }
        
                    print(userInput,superFactorial);
        
        
        
        
        
                }
            
                else{
                    System.out.println("Please enter a postive integer: ");
                    k--;
                }
            }
        
            else{
                System.out.println("Please enter an integer: ");
                myScanner.next();
                k--;
            }
        }
    }
    
    public static int factorial(int input1){
        int mul = 1;
        for(int i= 1; i<=input1;i++){
            
            mul *= i;
        }
        
        //System.out.println(mul);
        return mul;
        
        
        
    }
    
    public static void print(int input2, int sum){
        
        
        
        
        
        System.out.println("The super factorial of "+input2+" is equal to "+sum+".");
        
        
        
    }
}

