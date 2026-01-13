//Question 11 L2 

package Java.java_program_elemnt_practice;
import java.util.*;
public class simpleInterest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter principal ");
        int principal=input.nextInt();
        System.out.print("Enter rate ");
        int rate= input.nextInt();
        System.out.print("Enter time ");
        int time= input.nextInt();

        int simpleInterest= principal * rate * time / 100;

        System.out.print("The Simple Interest is  " + simpleInterest + " for Principa " + principal + " Rate of Interest " + rate + " and Time " + time);
    }
}
