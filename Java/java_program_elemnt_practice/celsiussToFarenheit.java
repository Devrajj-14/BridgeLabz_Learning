//Question 4 L2

package Java.java_program_elemnt_practice;
import java.util.*;

public class celsiussToFarenheit{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter temp in celsius ");
        Double temp= input.nextDouble();

        Double fTemp= ((temp*9)/5)+32;

        System.out.println("The " + temp + " celsius is " + fTemp + "fahrenheit");


    }
}