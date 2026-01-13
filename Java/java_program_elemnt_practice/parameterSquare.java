//Question 13

package Java.java_program_elemnt_practice;
import java.util.*;

public class parameterSquare{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter side:");
        int side= input.nextInt();
        int parameter= 4*side;

        System.out.print("The length of the side is "+ side + "whose perimeter is " + parameter);
    }
}