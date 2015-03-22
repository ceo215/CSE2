//Colin Orr
//CSE 002
//March 24, 2015
//HW 08

//This program will use a main method provided by the teacher and provide other methods to complete the program

//Import the scanner
import java.util.Scanner;

//Add Class
public class HW8{
    
    //Add Main Method Provided by teacher
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure boxes in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    //Add Method for the giant
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    //Add Method for the cave
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //Add Method for the box
    public static void box(){
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    //Add Method for getInput(Scanner,"Cc")
    public static String getInput(Scanner scan, String string){
        String answer = scan.next();       
        if (answer.equals("C")||answer.equals("c")){

        }
        else{
            System.out.println("Yea Right LOSER!");
            System.exit(0);
        }
        return answer;
    }
    
    //Add Method for getInput(Scanner scan)
    public static String getInput(Scanner scan){
        String string = "nothing";
        if (scan.hasNextInt()){
            
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("It is the One Ring to rule them all!");
                    break;
                case 2:
                    System.out.println("It is empty...");
                    break;
                case 3:
                    System.out.println("It is full of gold!");
                    break;
                default:
                    System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                    System.exit(0);
        }
        }
        else{
            System.out.println("Not an option! You get nothing! Better restart the game LOL");
            System.exit(0);
        }
        return string;
        
    }
    
    //Add Method for getInput(Scanner scan, String string, int trial)
    public static  String getInput(Scanner scan, String string, int trial){
        //trial = 10, string = AaEe, scan
        
        for(int i = 1; i<=trial;i++){
            String attackOrRun = scan.next();
            if (attackOrRun.equals("A")||attackOrRun.equals("a")){
                int math = (int) (Math.random()*2);
                if (math==1){
                    System.out.println("Critical Hit!");
                    if (i!=10){
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    }
                }
                else{
                    System.out.println("Gosh! How can you miss it!?");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    i--;
                    
                }
                
            }
            else if (attackOrRun.equals("E")||attackOrRun.equals("e")){
                int escape = (int) (Math.random()*10+1);
                if (escape==10){
                    i = 11;
                    System.out.println("You escaped the Giant!");
                    
                }
                else{
                    System.out.println("You could not get away!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                    i--;                
                    
                }
                
            }
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
        
    
        }
        return string;
    } 
    
    
    
    
    
    
    
    
    
}