//Question 14

package Java.java_program_elemnt_practice;
import java.util.*;

public class distInYards{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter dist in feet: ");
        double feet= input.nextDouble();

        double yard= feet/3;
        double miles= yard/1760;

        System.out.println("Your distance in feet is" + feet + "while in yard is" + yard + " and in miles " + miles);

    }
}