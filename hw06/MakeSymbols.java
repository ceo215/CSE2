//Colin Orr
//CSE 002
//Homework 6
//March 3, 2015

//This program will generate a random number between 1 and 100 and print a corresponding number of & or * depending on if the number is odd or even.


//Add class and main method
public class MakeSymbols{
    public static void main(String[]args){
        
        //Declare and assign the random number and the counter for the loops
        int myNumber = (int)(Math.random()*99+1);
        int counter = 0;
        
        //Prints the random number and the setup for the pattern.
        System.out.println("Random Number Generated: "+myNumber);
        System.out.print("The Output Pattern: ");
        
        //If the number is even, will execute this code
        if(myNumber%2==0){
            
            //Continues printing * until counter reaches appropriate number.
            do{
                System.out.print("*");
                counter++;
            }while (counter<myNumber);
        }
        
        //If the number is not even (odd) then this code will run.
        else{
            do{
                System.out.print("&");
                counter++;
            }while(counter<myNumber);
        }
        
        System.out.println();
        
        
    }
}    