//Question 9 L2

package Java.java_program_elemnt_practice;
import java.util.Scanner;

public class perimeterTriangle {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Side1 ");
        int side1= input.nextInt();
        
        int parameter=3*side1;

        int total = 5000%parameter;

        System.out.println("The total number of rounds the athlete will run is " + total + "to complete 5 km" );


        
    }
}
