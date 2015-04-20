//Colin Orr
//CSE 002
//April 21, 2015
//Homework 12

//This homework will implement matrix multiplication.

import java.util.Scanner;

public class Multiply{
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int width1 = 0;
        int height1 = 0;
        int width2 = 0;
        int height2 = 0;
        boolean check = true;
        
        
        while (check){
            while( counter1==0){
                System.out.print("Please enter a height for the first matrix: ");
                
                if(myScanner.hasNextInt()){
                    height1=myScanner.nextInt();
                    if(height1>0){
                        counter1++;
                    }
                    else{
                        System.out.println("The input must be greater than 0.");
                    }
                        
                }
                else{
                    System.out.println("The input must be an integer.");
                    myScanner.next();
                }
            }
            
            while( counter2==0){
                System.out.print("Please enter a width for the first matrix: ");
                
                if(myScanner.hasNextInt()){
                    width1=myScanner.nextInt();
                    if(width1>0){
                        counter2++;
                    }
                    else{
                        System.out.println("The input must be greater than 0.");
                    }
                        
                }
                else{
                    System.out.println("The input must be an integer.");
                    myScanner.next();
                }
            }
            
            while( counter3==0){
                System.out.print("Please enter a height for the second matrix: ");
                
                if(myScanner.hasNextInt()){
                    height2=myScanner.nextInt();
                    if(height2>0){
                        counter3++;
                    }
                    else{
                        System.out.println("The input must be greater than 0.");
                    }
                        
                }
                else{
                    System.out.println("The input must be an integer.");
                    myScanner.next();
                }
            }
            
            while( counter4==0){
                System.out.print("Please enter a width for the second matrix: ");
                
                if(myScanner.hasNextInt()){
                    width2=myScanner.nextInt();
                    if(width2>0){
                        counter4++;
                    }
                    else{
                        System.out.println("The input must be greater than 0.");
                    }
                        
                }
                else{
                    System.out.println("The input must be an integer.");
                    myScanner.next();
                }
            }
            
            int [][] array1 = randomMatrix(height1, width1);
            printMatrix(array1);
            System.out.println();
            int [][] array2 = randomMatrix(height2, width2);
            printMatrix(array2);
            System.out.println();
            if(array1[0].length!=array2.length){
                System.out.println("The matrices cannot be multipied. Reenter the dimensions.");
                counter1--;
                counter2--;
                counter3--;
                counter4--;
                continue;
            }
            else{
                check=false;
            }
        System.out.println("The product of the matrices will now be calculated, if possible.");
        int [][] finalArray = multiplyMatrix(array1, array2);
        if(finalArray==null){
            System.exit(0);
        }
        else{
            
        
        printMatrix(finalArray);
        }
        
        
        }
    }
    
    public static int [][] multiplyMatrix(int[][] arrayA, int [][] arrayB){
        if(arrayA[0].length!=arrayB.length){
            System.out.println("The matrices cannot be multipied.");
            return null;
        }
        
        else{
            int [][] productArray = new int[arrayA.length][arrayB[0].length];
            int value = 0;
            
            for(int i = 0; i<arrayA.length; i++){
                for(int j = 0; j<arrayB[0].length; j++){
                    for(int k = 0; k<arrayB.length; k++){
                            value+=arrayA[i][k]*arrayB[k][j];
                    }
                    productArray[i][j]=value;
                    value = 0;
                }    
            }
            return productArray;
        }
    }
        
        
        
        
        
        
    
    public static int [][] randomMatrix(int height, int width){
        int [][] myArray= new int [height][width];
        int negativeOrPositive = 0;
        
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                negativeOrPositive = (int) (Math.random()*2);
                if(negativeOrPositive==0){
                    myArray[i][j]= (int) (Math.random()*10);
                }
                else{
                    myArray[i][j]= (int) (Math.random()*10) * -1;
                }
            }
        }
        return myArray;
        
    }
    
    public static void printMatrix(int [][] array){
        
        System.out.println("Generating a matrix with width "+array[0].length+" and height "+array.length+":");
        
        for(int i = 0; i<array.length; i++){
            System.out.print("[");
            for(int j = 0; j<array[i].length; j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.print(" ]");
            System.out.println();
        }
    }
}