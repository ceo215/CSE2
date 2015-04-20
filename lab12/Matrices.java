//Colin Orr
//CSE 002
//April 17, 2015
//Lab 12

//This lab will print out and operate on row- and column- major matrices represented by two dimensional arrays.

import java.util.Scanner;

public class Matrices{
    public static void main(String[]args){
        int width1 = (int) (Math.random()*10);
        int width2 = (int) (Math.random()*10);
        int height1 =(int) (Math.random()*10);
        int height2 = (int) (Math.random()*10);
        boolean formata = true;
        boolean formatb = false;
        
        
        
        
        
        int [][] arrayA = increasingMatrix(width1,height1,formata);
        
        System.out.println("Generating a matrix with width "+width1+" and height "+height1+":");
       
        printMatrix(arrayA, formata);
       
        int [][] arrayB = increasingMatrix(width1,height1,formatb);
       
        System.out.println("Generating a matrix with width "+width1+" and height "+height1+":");
       
        printMatrix(arrayB,formatb);
       
        int [][] arrayC = increasingMatrix(width2,height2,formatb);
       
        System.out.println("Generating a matrix with width "+width2+" and height "+height2+":");
       
        printMatrix(arrayC,formatb);

       

     if(width1 != 0 && height1 !=0){  
        System.out.println("Adding two matrices:");

        printMatrix(arrayA, formata);
       
        System.out.println("plus");
     
        printMatrix(arrayB,formatb);
        System.out.println("Translating column major to row major.");
        System.out.println("Output: ");
        printMatrix(addMatrix(arrayA,formata,arrayB,formatb),formata);
        
        if(arrayC.length==0 || arrayC[0].length==0){
            System.exit(0);
        }
        System.out.println("Adding two matrices:");
        
        printMatrix(arrayA, formata);
        
        System.out.println("plus");
        
        printMatrix(arrayC, formatb);
        System.out.println("Translating column major to row major.");
        System.out.println("Output: ");
        if(addMatrix(arrayA,formata,arrayC,formatb)==null){
            System.exit(0);
        }
     }    
        

        
        
        
        
        
        
        
    }
    
    public static void printMatrix(int[][] array, boolean format){
        if(array.length==0||array[0].length==0){
            System.out.println("The array was empty!");
            
        }
        else{
            
            if(format){
                
            
        
            for(int i = 0; i<array.length; i++){
                System.out.print("[");
                for(int j = 0; j<array[i].length; j++){
                    System.out.print(" "+array[i][j]);
                }
                System.out.print(" ]");
                System.out.println();
            }
        }
            else{
                
            
                for(int i = 0; i<array[0].length; i++){
                    System.out.print("[");
                    for(int j = 0; j<array.length; j++){
                        System.out.print(" "+array[j][i]);
                    }
                    System.out.print(" ]");
                    System.out.println();
                }
            
            }   
        
        }
    }    
    
    public static int [][] increasingMatrix(int width, int height, boolean format){
        int [][] myArray;
        int counter = 1;
        if(format){
            myArray = new int [height][width];
            for(int i = 0; i<height; i++){
                for(int j = 0; j<width; j++){
                    myArray[i][j]= counter;
                    counter++;
                }
            }
            
            
            
            
        }
        
        else{
            myArray = new int [width][height];
            for(int i = 0; i<width; i++){
                for(int j = 0; j<height; j++){
                    myArray[i][j]=counter+(j*width);
                }
                counter++;
            }
        }
        
        return myArray;
    }
    
    public static int[][] translate(int[][] array){
        int [][] translateArray = new int[array[0].length][array.length];
        for(int i = 0; i<array[0].length; i++){
            for(int j=0; j<array.length; j++){
                translateArray[i][j]=array[j][i];
            }
        }

        return translateArray;
    }
    
    public static int [][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
        if(formata==formatb){
            if(a.length!=b.length||a[0].length!=b[0].length){
                System.out.println("The arrays cannot be added.");
                return null;
            }
            else{
                
                if(formata==false){
                    translate(a);
                }
                
                if(formatb==false){
                    translate(b);
                }
                
                int [][] summation = new int [a.length][a[0].length];
                
                for(int i=0; i<a.length; i++){
                    for(int j=0; j<a[0].length; j++){
                        summation[i][j]=a[i][j]+b[i][j];
                    }
                }
                
                return summation;
                
                
            }
        }
        else{
            if(a.length!=b[0].length || a[0].length!=b.length){
                System.out.println("The arrays cannot be added.");
                return null;
            }
            else{
                if(formata==false){
                    translate(a);
                }
                
                if(formatb==false){
                    b= translate(b);
                    
                }
                
                int [][] summation = new int [a.length][a[0].length];
                
                for(int i=0; i<a.length; i++){
                    for(int j=0; j<a[0].length; j++){
                        summation[i][j]=a[i][j]+b[i][j];
                    }
                }
                
                return summation;
                
            }
        }
    }
}





