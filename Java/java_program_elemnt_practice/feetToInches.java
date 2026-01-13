//Question 10

package Java.java_program_elemnt_practice;
import java.util.*;

public class feetToInches{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter height in cm");
        double cm = input.nextInt();

        double feet= cm/30.48;
        double inches= cm *0.3937;

        System.out.print("Your Height in cm is "+ cm + "  while in feet is " + feet + " and inches is " + inches);

    }
}
