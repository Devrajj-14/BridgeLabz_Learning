//Question 5 L2

package Java.java_program_elemnt_practice;

import java.util.Scanner;

public class TemperaturConversion {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter temp in Fahrenheit ");
        Double fTemp= input.nextDouble();

        Double cTemp= (fTemp -32)* 5/9;

        System.out.println("The " + fTemp + " fahrenheit is " + cTemp + "celsius");

    }
}
