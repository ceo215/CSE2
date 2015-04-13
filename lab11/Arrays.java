//Colin Orr
//CSE 002
//April 10, 2015
//Lab 11

//This program will search randomly filled arrays.

import java.util.Scanner;

public class Arrays{
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int minimum1 = 0;
        int maximum1 = 0;
        int minimum2 = 0;
        int maximum2 = 0;
        
        
        int [] array1 = new int [50];
        int [] array2 = new int [50];
        
        for(int i = 0; i<50; i++){
            array1[i]= (int) (Math.random()*101);
        }
        
        minimum1 = array1[0];
        for(int k = 1; k<50; k++){
            if(array1[k]<minimum1){
                minimum1=array1[k];
            }
        }
        
        maximum1 = array1[0];
        for(int j = 1; j<50; j++){
            if(array1[j]>maximum1){
                maximum1=array1[j];
            }
        }
        
        System.out.println("The maximum of array1 is: "+maximum1);
        System.out.println("The minimum of array1 is: "+minimum1);
        
        array2[0] = (int) (Math.random()*101);
        for(int m = 1; m<50; m++){
            array2[m]=(int) (Math.random()*101)+array2[m-1];
        }
        
        System.out.println("The maximum of array2 is: "+array2[49]);
        System.out.println("The minimum of array2 is: "+array2[0]);
        
        System.out.print("Enter a positive int: ");

        
        if(myScanner.hasNextInt()){
            int userInput = myScanner.nextInt();
            if (userInput >= 0){

                binarySearch(array2,0,49,userInput);


                
            }
            else{
                System.out.println("You did not enter a positive int.");
                System.exit(0);
            }
            
        }
        else{
            System.out.println("You did not enter an int.");
            System.exit(0);
        }
        
        
    }
    
    
    
    
    public static void binarySearch(int [] array, int lowerbound, int upperbound, int key){
        int position=(lowerbound+upperbound)/2;

        
        
        while(array[position]!=key && lowerbound<=upperbound){
            if(array[position]>key){
                upperbound=position-1;
            }
            else{
                lowerbound=position+1;
            }
            position = (lowerbound+upperbound)/2;
        }
        
        if(lowerbound<=upperbound){
            System.out.println(key+" was found in the list.");
        }
        else{
            System.out.println(key+" was not found in the list.");
            if(array[upperbound]>array[lowerbound]){
                System.out.println("The number above the key was "+array[upperbound]);
                System.out.println("The number below the key was "+array[lowerbound]);
            }
            else{
                System.out.println("The number above the key was "+array[lowerbound]);
                System.out.println("The number below the key was "+array[upperbound]);
            }
        }
    }
}