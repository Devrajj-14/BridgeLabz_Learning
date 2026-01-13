//Question 1 L2 

package Java;
import java.util.*;

public class questionReminder {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter num1");
        int num1= input.nextInt();
        System.out.print("enter num2");
        int num2= input.nextInt();

        int quotient= num1/num2;
        int remender= num1%num2;

        System.out.println("The Quotient is "+ quotient + "and Reminder is. " + remender + "  of two number "  + num1 + " and  " + num2);

    }   
}
