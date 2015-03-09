//Colin Orr
//CSE 002
//March 10, 2015
//HW 07

//This program will create waves depending on the integer the user inputs, using the three loop types.

//Import the scanner
import java.util.Scanner;

//Add class and main method
public class waves{
    public static void main(String[]args){
        
        //Declare Important Variables
        int myNumber = 0;
        
        //Variables for While loop
        int counter1 = 0;
        int counter2 = 1;
        int counter3 =0;
        int counter4= 0;
        int counter5=1;
        int counter6=0;
        
        //Variables for Do-While loop
        int counterA = 0;
        int counterB = 1;
        int counterC =0;
        int counterD= 0;
        int counterE=1;
        int counterF=0;
        
        //Declare the scanner for user input
        Scanner myScanner = new Scanner(System.in);
        
        //Ask for input
        System.out.print("Please enter a number between 1 and 30: ");
        
        //Check if input is an integer and in the range
        for(int i=0; i<1; i++){
            if(myScanner.hasNextInt()){
                myNumber = myScanner.nextInt();
                System.out.println();
                if(myNumber>=1 && myNumber<=30){
                    
                    //FOR LOOP:
                    System.out.println("FOR LOOP: ");
                    //Starting with 1, loops wave up to their input
                    for(int j = 1; j<=myNumber; j++){
                        
                        //For odd numbers, prints a decreasing wave
                        if(j%2!=0){
                            for(int x=j; x>0; x--){
                                for(int k=0; k<x; k++){
                                    System.out.print(j+"");
                                }
                                System.out.println();
                            }
                        }
                        //For even numbers, prints an increasing wave
                        if(j%2==0){
                            for(int y=1;y<=j;y++){
                                for(int m=0; m<y; m++){
                                    System.out.print(j+"");
                                }
                                System.out.println();
                            }
                        }
                            
                            
                    }
                        
                }
                
            
                else{
                    i--;
                    System.out.println("Please enter a value in the range [1.30]. Try again: ");
                }
            }
            else{
                i--;
                System.out.println("Please enter an integer. Try again: ");
                myScanner.next();
            }
        }
        
        //WHILE LOOP:
        System.out.println();
        while(counter1<1){
                    System.out.println("WHILE LOOP: ");
                    
                    counter1++;
                    while(counter2<=myNumber){
                        
                        //odd numbers
                        if(counter2%2!=0){
                            counter3=counter2;
                            while(counter3>0){
                                counter4=0;
                                while(counter4<counter3){
                                    System.out.print(counter2+"");
                                    counter4++;
                                }
                                System.out.println();
                                counter3--;
                            }
                        }
                        //even numbers
                        if(counter2%2==0){
                            counter5=1;
                            while(counter5<=counter2){
                                counter6=0;
                                while(counter6<counter5){
                                    System.out.print(counter2+"");
                                    counter6++;
                                }
                                System.out.println();
                                counter5++;
                            }
                        }
                            
                    counter2++;        
                    }
                        
        }
        
        //DO-WHILE LOOP:
        System.out.println();
        do{
            System.out.println("DO-WHILE LOOP: ");
                    
                do{
                    //odd numbers    
                    if(counterB%2!=0){
                        counterC=counterB;
                        do{
                            counterD=0;
                            do{
                                System.out.print(counterB+"");
                                counterD++;
                            }while(counterD<counterC);
                            System.out.println();
                            counterC--;
                        }while(counterC>0);
                    }
                    
                    //even numbers    
                    if(counterB%2==0){
                        counterE=1;
                        do{
                            counterF=0;
                            do{
                                System.out.print(counterB+"");
                                counterF++;
                            }while(counterF<counterE);
                            System.out.println();
                            counterE++;
                        }while(counterE<=counterB);
                    }
                            
                    counterB++;        
                }while(counterB<=myNumber);
                        
        }while(counterA<0);        
        
    }
}