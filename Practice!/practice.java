import java.util.Scanner;

public class practice{
    public static void main(String[]args){

int j = 4;
int k = 16;

switch (j){
 case 1: 
  System.out.print(1+" "); 
  k /= 2;
case 2:
  System.out.print(2+" ");
  k %= 5;
case 3:
  System.out.printf("3 ");
  k -= 4;
  break;   
default:
  
  k *= 5;
}
System.out.printf("k = %2.2f\n",(double)k);
System.out.printf("k = %4.2f\n", (double)k);

    }
}
