//Colin Orr
//CSE 2
//April 14, 2015
//Homework 11

//This homework will manipulate arrays of students grades

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    public static void main(String[]args){
        
        System.out.println("Please enter 15 integer grades between 0 and 100, in increasing order:");
        
        Scanner myScanner = new Scanner(System.in);
        
        
        int [] studentGrades = new int [15];
        int j = 0;
        int z =0;
        int p=0;
        int userInput=0;
        
        do{
            if(myScanner.hasNextInt()){
                studentGrades[0]=myScanner.nextInt();
                
                if(studentGrades[0]>=0 && studentGrades[0]<=100){
                    j++;
                }
                else{
                    System.out.println("Please enter an integer from 0-100.");
                }
            }
            else{
                System.out.println("Please enter an integer.");
                myScanner.next();
            }
        }while(j==0);
        
        
        for(int i = 1; i<15; i++){
            if(myScanner.hasNextInt()){
                studentGrades[i]=myScanner.nextInt();
                
                if(studentGrades[i]>=0 && studentGrades[i]<=100){
                    if(studentGrades[i]>=studentGrades[i-1]){
                        
                    }
                    else{
                        System.out.println("Please enter an integer greater than or equal to the previous integer.");
                        i--;
                    }
                }
                else{
                    System.out.println("Please enter an integer from 0-100.");
                    i--;
                }
            }
            else{
                System.out.println("Please enter an integer.");
                myScanner.next();
                i--;
            }
            
            
            
            
        }
        
        System.out.print("The grades, in increasing order, are: ");
        print(studentGrades);
        System.out.print("Enter a grade to search for: ");

        do{
            if(myScanner.hasNextInt()){
                userInput=myScanner.nextInt();
                
                if(userInput>=0 && userInput<=100){
                    z++;
                }
                else{
                    System.out.println("Please enter an integer from 0-100.");
                }
            }
            else{
                System.out.println("Please enter an integer.");
                myScanner.next();
            }
        }while(z==0);
        
        binarySearch(studentGrades,0,14,userInput);
        scramble(studentGrades);
        System.out.print("The scrambled array is: ");
        print(studentGrades);
        
        System.out.print("Enter a grade to search for: ");

        do{
            if(myScanner.hasNextInt()){
                userInput=myScanner.nextInt();
                
                if(userInput>=0 && userInput<=100){
                    p++;
                }
                else{
                    System.out.println("Please enter an integer from 0-100.");
                }
            }
            else{
                System.out.println("Please enter an integer.");
                myScanner.next();
            }
        }while(p==0);
        
        linearSearch(studentGrades, userInput);
        
        
        
        
    }
    public static void print(int [] x){
        for(int k = 0; k<15; k++){
        System.out.print(x[k]+" ");
        }
        System.out.println();
        
    }
    
    public static void binarySearch(int [] array, int lowerbound, int upperbound, int key){
        int position=(lowerbound+upperbound)/2;
        int iterationCount=0;
        
        
        while(array[position]!=key && lowerbound<=upperbound){
            iterationCount++;
            if(array[position]>key){
                upperbound=position-1;
            }
            else{
                lowerbound=position+1;
            }
            position = (lowerbound+upperbound)/2;
        }
        
        if(lowerbound<=upperbound){
            System.out.println(key+" was found in the list with "+iterationCount+" iterations.");
        }
        else{
            System.out.println(key+" was not found in the list with "+iterationCount+" iterations.");
        }
    }
    
    public static void scramble(int [] newArray){
        Random randomGenerator = new Random();
        for(int i = newArray.length - 1; i>0; i--){
            int index = randomGenerator.nextInt(i+1);
            int swap = newArray[index];
            newArray[index]=newArray[i];
            newArray[i]=swap;
        }
        
    }
    
    public static void linearSearch(int [] array, int key){
        int iterationCount = 0;
        boolean found= false;
        for(int i = 0; i<15; i++){
            iterationCount++;
            if(array[i]==key){
                found = true;
                break;
            }
            
        }
        
        if(found){
            System.out.println(key+" was found in the list with "+iterationCount+" iterations.");
        }
        else{
            System.out.println(key+" was not found in the list with "+iterationCount+" iterations.");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}