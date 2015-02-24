import java.util.Scanner;

public class practice{
    public static void main(String[]args){


Scanner myScanner = new Scanner(System.in);
int number = myScanner.nextInt();
int result = 0;
if(number>=100){
    

int number1 = number/100;
result = number1*8*8;
number -= number1*100;
}
if(number >= 10){
    int number2 = number/10;
result += number2*8;
number -= number2*10;
}

result += number;

    System.out.println(result);
    



    }
}
