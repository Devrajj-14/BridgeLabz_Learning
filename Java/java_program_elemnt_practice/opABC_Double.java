//Question 3 L2

package Java.java_program_elemnt_practice;

import java.util.Scanner;

public class opABC_Double {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter val of a");  
        double a = input.nextDouble();
        System.out.print("enter val of b");  
        double b = input.nextDouble();
        System.out.print("enter val of c");  
        double c= input.nextDouble();

        double op1= a+b*c;
        double op2= a*b+c;
        double op3= c+a/b;
        double op4= a%b+c;

        System.out.println("The results of Int Operations are " +op1 +"," + op2 +"," + op3 +" and "+ op4);
    }
}
