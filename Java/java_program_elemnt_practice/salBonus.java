//Question 6 L2

package Java.java_program_elemnt_practice;
import java.util.*;

public class salBonus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter salary");
        int sal= input.nextInt();
        System.out.print("enter bonus ");
        int bonus= input.nextInt();

        int totalSal= sal+bonus;

        System.out.println(" The salary is INR " + sal + "and bonus is INR " + bonus + " . Hence Total Income is INR "+ totalSal);
    }
}
