//Colin Orr
//CSE 002
//April 28, 2015
//HW 13

//This program will create and manipulate a four dimensional array of doubles

import java.util.Scanner;
import java.util.Random;

public class FourDwin{
    public static void main(String[]args){
        
        int userInput1 = 0;
        int userInput2 = 0;
        int counter1 = 0;
        int counter2 = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        //Check Input
        
        do{
            System.out.print("Enter an integer X: ");
            if(!myScanner.hasNextInt()){
                System.out.println("Invalid Input. Must be an integer.");
                myScanner.next();
                continue;
            }
            userInput1=myScanner.nextInt();
            if(userInput1<=0){
                System.out.println("Invalid Input. Must be greater than 0.");
                continue;
            }
            counter1++;
        }while(counter1==0);
        
        do{
            System.out.print("Enter an integer Y where Y>X: ");
            if(!myScanner.hasNextInt()){
                System.out.println("Invalid Input. Must be an integer.");
                myScanner.next();
                continue;
            }
            userInput2=myScanner.nextInt();
            if(userInput2<=userInput1){
                System.out.println("Invalid Input. Must be greater than X.");
                continue;
            }
            counter2++;
        }while(counter2==0);
        
        //Allocate space to make array ragged
        Random randomGenerator = new Random();
        double [][][][] myArray = new double [3][][][];
        for(int i = 0; i<myArray.length; i++){
            myArray[i]=new double [randomInRange(userInput1,userInput2,randomGenerator)][][];
            for (int j =0; j<myArray[i].length;j++){
                myArray[i][j]=new double [randomInRange(userInput1,userInput2,randomGenerator)][];
                for(int k=0; k<myArray[i][j].length;k++){
                    myArray[i][j][k]=new double [randomInRange(userInput1,userInput2,randomGenerator)];
                }
            }
        }
        
        //Fill array with random doubles rounded to one decimal
        for(int w = 0; w<myArray.length; w++){
            for (int x =0; x<myArray[w].length;x++){
                for(int y=0; y<myArray[w][x].length;y++){
                    for(int z=0; z<myArray[w][x][y].length;z++){
                        myArray[w][x][y][z]= (double) Math.round((Math.random()*30+1)*10)/10;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Original Array:");
        
        printArray(myArray);
        
        System.out.println();
        System.out.println();
        
        for(int q = 0; q< myArray.length; q++){
            sort3DArray(myArray[q]);
        }
        
        sort4DArray(myArray);
        
        System.out.println("Sorted Array:");
        
        printArray(myArray);
        
        System.out.println();
        System.out.println();
        
        statArray(myArray);
        

        
        
    }
    
    public static int randomInRange(int start, int end, Random random){
    
        long range = (long) end - (long) start + 1;
        long fraction = (long)(range*random.nextDouble());
        int randomNumber = (int)(fraction+start);
        return randomNumber;
    }
    
    public static void printArray(double [][][][] array){
        System.out.print("{");
        for(int i = 0; i<array.length; i++){
            System.out.print("{");
            for(int j = 0; j<array[i].length; j++){
                System.out.print("{");
                for(int k =0; k<array[i][j].length;k++){
                    System.out.print("{");
                    for(int l =0; l<array[i][j][k].length;l++){
                        System.out.print(array[i][j][k][l]+",");
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("} ");
        }
        System.out.print("}");
    }
    
    public static void statArray(double [][][][] array){
        double sum = 0;
        double mean = 0;
        double elements = 0.0;
        
        for(int w = 0; w<array.length; w++){
            for (int x =0; x<array[w].length;x++){
                for(int y=0; y<array[w][x].length;y++){
                    for(int z=0; z<array[w][x][y].length;z++){
                        sum += array[w][x][y][z];
                        elements+=1.0;
                    }
                }
            }
        }
        
        mean = sum/elements;
        elements = (int) elements;
        System.out.println("Members: "+elements);
        System.out.printf("Sum: %.2f\n",sum);
        System.out.printf("Mean: %.2f\n",mean);
    }
    
    public static void sort3DArray(double [][][] array){

        for(int x = 0; x<array.length; x++){
            for (int y = 0; y<array[x].length;y++){
                for(int z = 0; z<array[x][y].length; z++){
                    int index = z;
                    double temp = 0;
                    for(int w =z; w<array[x][y].length; w++){
                        if(array[x][y][w]<array[x][y][index]){
                            index = w;
                        }
                    }
                    temp = array[x][y][index];
                    array[x][y][index]=array[x][y][z];
                    array[x][y][z]=temp;
                }
            }
        }
    }
        
    
    
    public static void sort4DArray(double [][][][] sort){
        for(int x = 1; x<sort.length; x++){
            double [][][] key = sort[x];
            int y = x-1;
            while(y>-1 && sort[y].length>key.length){
                sort[y+1]=sort[y];
                y--;
            }
            sort[y+1]=key;
            
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

