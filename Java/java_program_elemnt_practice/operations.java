//Question 11

package Java.java_program_elemnt_practice;
import java.util.*;

public class operations{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter num 1");
        int num1= input.nextInt();
        System.out.print("enter num 2");
        int num2= input.nextInt();

        int add=num1+num2;
        int sub=0;
        int div=0;
        if(num1>num2){                      //assuming the number1 and number 2 are not in the respective ways
            sub=num1-num2;
            div=num1/num2;
        }else if(num1<num2){
            sub= num2-num1;
            div=num2/num1;
        }
        int mul=num1*num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ num1 + "and"+ num2 + "are "+ add + "," + sub +"," + mul + "," + div);
    }
}