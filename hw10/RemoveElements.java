//Colin Orr
//CSE 002
//April 7, 2015
//HW 10

//This program will use methods to arrange inputs in arrays.

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
    String answer="";
    do{
      System.out.print("Random input 10 ints [0-9]");
      num = randomInput();
      String out = "The original array is:";
      out += listArray(num);
      System.out.println(out);
 
      System.out.print("Enter the index ");
      index = scan.nextInt();
      newArray1 = delete(num,index);
      String out1="The output array is ";
      out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      System.out.println(out1);
 
      System.out.print("Enter the target value ");
      target = scan.nextInt();
      newArray2 = remove(num,target);
      String out2="The output array is ";
      out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      System.out.println(out2);
       
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static int[] randomInput(){
      int [] a = new int [10];
      for(int i=0; i<10; i++){
          a[i]= (int) (Math.random()*10);
      }
      return a;
  }
  
  public static int[] delete(int [] list, int pos){
      int [] c = new int[9];

      if(pos<10&&pos>=0){
          for(int i=0; i<10; i++){
              if(i==pos){
                  continue;
              }
              else if(i>pos){
                  c[i-1]=list[i];
              }
              else{
                  c[i]=list[i];
              }
              
          }
          return c;
      }
        else{
          System.out.println("The index is not valid.");
          return list;
      }
  }
  
  public static int[] remove(int [] list, int target){
      int counter = 0;
      for(int i = 0; i<10; i++){
          if(list[i]==target){
              counter+=1;
          }
      }
      int arraySize = 10 - counter;
      int[] b = new int[arraySize];
      int counter2 = 0;
      for(int i=0; i<10; i++){
          if(list[i]==target){
              counter2+=1;
              continue;
          }
          else{
              b[i-counter2]=list[i];
          }
          
      }
      return b;
      
  }
    
}