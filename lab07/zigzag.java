//Colin Orr
//CSE 002
//March 6, 2015
//Lab 07

//This program will print a zigzag of asterisks using loops.

//Import Scanner
import java.util.Scanner;

//Add class and main method
public class zigzag{
    public static void main(String[]args){
        
        //Create variables useful for later
        Scanner myScanner = new Scanner(System.in);
        int nStars = 10;
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        String a = "Y";
        String b = "y";
        char c;
        String symbol = "*";
        String space = " ";
        
        //Accept user input
        
        while(counter == 0){
        System.out.println("Enter an integer between 3 and 33: ");
        
        
        //This while loop allows for repeated checks if user input is not an integer or in the right range.
        while(counter1<1){
            if(myScanner.hasNextInt()){
                nStars = myScanner.nextInt();
                
                //Checks if the nput is in the appropriate range,
                if (nStars>=3 && nStars<=33){
                    
                    //Print nStars
                    while(counter2<nStars){
                    System.out.print(symbol);
                    counter2++;
                    }
                    
                    System.out.println();
                    
                    //For loop will print additional spaces for each line printed
                    for(int i=2; i<nStars; i++){
                        symbol = space+symbol;
                        System.out.println(symbol);
                    }
                    
                    //Prints the final line of stars
                    while(counter3<nStars){
                    System.out.print("*");
                    counter3++;
                    counter1++;
                    
                    }
                    System.out.println();
        
                }
                
            //Tell user if they did not properly input a value
                else{
                    System.out.println("Please enter an integer within the range [3,33]. Try again.");
                }
            }
            
            else{
                System.out.println("Please enter an integer. Try again.");
                myScanner.next();
            }
        } 
        
            //Asks user if they would like to continue, resets variables so if they say yes, the code runs again        
            System.out.print("Enter y or Y to go again: ");
            c = myScanner.next().charAt(0);
            if(c=='Y' || c=='y'){
                counter1=0;
                counter2=0;
                counter3=0;
                symbol = "*";
               
            }
            
            //If they say no, the code terminates with the increment of counter.
            else{
                counter++;
            }
        }
    }
}