//Colin Orr
//CSE 002
//April 3, 2015
//Lab 10

//This program will fill an array with numbers designated by the user.

import java.util.Scanner;

public class ArrayInputs{
    

    public static void main(String[]args){
    
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Please enter an integer for the size of the array: ");
        System.out.println();
        
        int arraySize = myScanner.nextInt();
        
        int [] theirArray = new int [arraySize];
        
        //int i = 0;
        //while (i<1){
            
            for(int k = 0; k<arraySize; k++){
                System.out.print("Please enter a positive integer: ");
                System.out.println();
            
                if(myScanner.hasNextInt()){
                    int checkInput = myScanner.nextInt();
                    if(checkInput>=0){
                        theirArray[k]=checkInput;
                        
                        
                    }
                    else{
                        System.out.println("Sorry, the number you entered is negative.");
                        k--;
                    }
                }
                else{
                    System.out.println("Sorry, you didn't enter an integer.");
                    myScanner.next();
                    k--;
                }
            
            
            }
            System.out.println("The array is: ");
            for(int i = 0; i<arraySize; i++){
                System.out.println(theirArray[i]);
            }
        //}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}