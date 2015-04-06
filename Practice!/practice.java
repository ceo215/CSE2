import java.util.Scanner;

public class practice{
    public static void main(String[]args){
    
        Scanner myScanner = new Scanner (System.in);
        int value = 0;
        int i = 0;
        do{
            System.out.println("Input a positive integer (0 to exit): ");
            if (myScanner.hasNextInt()){
                value = myScanner.nextInt();
                if (value>0){
                if(value==0){
                    System.out.println("Goodbye");
                    i++;
                }
                boolean answer = isPrime(value);
                if(answer==true){
                    System.out.println("Prime!");
                }
                }
                else{
                    System.out.println("Not prime");
                }
            }
            else{
                System.out.println("Invalid");
                myScanner.next();
            }
            
            
            
            
        }while(i<1);
        
        
    }
    
    public static boolean isPrime(int a){
        int i=0;
        for(i=2; i<=(int)Math.sqrt(a); i++){
            if(a%i==0){
                return false;}
            
                
            
            }
            return true;
            
        }
    
}
