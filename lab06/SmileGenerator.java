//Colin Orr
//CSE 002
//February 27, 2015
//Lab 06

//This program will utilize all sorts of loops to generate smiley faces in various ways.

//Add class and main method.
public class SmileGenerator{
    public static void main(String[]args){
        
        //first set of smileys
        for (int i=1; i<6; i++){
            System.out.print(":)");
        }
        
        //Print a space before the next set
        System.out.println();
        
        
        //Declare variable needed for second set
        int counter = 1;
        
        while (counter<6){
            System.out.print(":)");
            counter++;
        }
        
        System.out.println();
        
        
        //Declare variable needed for third set
        int counter2 = 1;
        
        do{
            System.out.print(":)");
            counter2++;
        }while (counter2<6);
        
        System.out.println();
        
        //Step 2 and 3
        
        int myNumber= (int)(Math.random()*100+1);
        for(int j=0; j<myNumber; j++){
            System.out.print(":)");
            if(j>30){
                break;
            }
        }
        System.out.println();
        
        //Step 4
        
        int smileCounter = 1;
        String smile = ":)";
        
        while (smileCounter<myNumber){
            System.out.println(smile);
            smile += ":)";
            if (smileCounter>30){
                break;
            }
            smileCounter++;
            
                           
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}