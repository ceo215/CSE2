//Colin Orr
//CSE 002
//April 3, 2015
//Lab 09

//This program will generate random sentences.

import java.util.Random;
import java.util.Scanner;

public class Methods{
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int i = 0;
        while(i<1){
            String sentence = "The "+adjective()+" "+subject()+" "+verb()+" the "+adjective()+" "+object()+".";
            System.out.println(sentence);
        
            System.out.print("Would you like another sentence? 0 for yes, anything else quits: ");
            int question = myScanner.nextInt();
            if(question == 0){
                continue;
    
            }    
            else{
                i++;
            }
        }
    }
    
    public static String adjective(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String word = "nothing";
        switch (randomInt){
            
            case 0:
                 word = "happy";
                return word;
                
            case 1:
                 word = "sad";
                return word;
                
            case 2:
                 word = "angry";
                return word;
                
            case 3:
                 word = "quick";
                return word;
                
            case 4:
                 word = "homely";
                return word;
                
            case 5:
                 word = "beautiful";
                return word;
                
            case 6:
                 word = "crazy";
                return word;
                
            case 7:
                 word = "hopeless";
                return word;
                
            case 8:
                 word = "boisterous";
                return word;
                
            case 9:
                 word = "red";
                return word;
            default:
                return word;
                
        }
    }
        public static String subject(){
            Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String word = "nothign";
        switch (randomInt){
            
            
            case 0:
                 word = "man";
                return word;
                
            case 1:
                 word = "giraffe";
                return word;
                
            case 2:
                 word = "ant";
                return word;
                
            case 3:
                 word = "anteater";
                return word;
                
            case 4:
                 word = "T-rex";
                return word;
                
            case 5:
                 word = "woman";
                return word;
                
            case 6:
                 word = "murderer";
                return word;
                
            case 7:
                 word = "prisoner";
                return word;
                
            case 8:
                 word = "captain";
                return word;
                
            case 9:
                 word = "rabbit";
                return word;
            default:
                return word;
                
        }
    }
        public static String verb(){
            Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String word = "nothing";
        switch (randomInt){
            
            case 0:
                 word = "skipped";
                return word;
                
            case 1:
                 word = "passed";
                return word;
                
            case 2:
                 word = "killed";
                return word;
                
            case 3:
                 word = "danced";
                return word;
                
            case 4:
                 word = "walked";
                return word;
                
            case 5:
                 word = "ate";
                return word;
                
            case 6:
                 word = "failed";
                return word;
                
            case 7:
                 word = "typed";
                return word;
                
            case 8:
                 word = "baked";
                return word;
                
            case 9:
                 word = "smoked";
                return word;
            default:
                return word;
                
        }
    }
        public static String object(){
            Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String word = "nothing";
        switch (randomInt){
            
            case 0:
                 word = "cake";
                return word;
                
            case 1:
                 word = "computer";
                return word;
                
            case 2:
                 word = "cat";
                return word;
                
            case 3:
                 word = "fox";
                return word;
                
            case 4:
                 word = "ball";
                return word;
                
            case 5:
                 word = "balloon";
                return word;
                
            case 6:
                 word = "baboon";
                return word;
                
            case 7:
                 word = "dog";
                return word;
                
            case 8:
                 word = "pelican";
                return word;
                
            case 9:
                 word = "rat";
                return word;
            
            default:
                return word;
                
        }
    }
}