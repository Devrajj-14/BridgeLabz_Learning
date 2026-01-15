//Question 6

package Java.Level1;
import java.util.*;

public class checkNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number ");
        int num= sc.nextInt();
        if(num>0)System.out.println("the number entered is positive ");
        else if(num==0)System.out.println("the entered number is zero ");
        else System.out.println("The entered number is negative ");

        sc.close();
    }
}