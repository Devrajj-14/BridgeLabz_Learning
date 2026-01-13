//question 15

package Java.java_program_elemnt_practice;
import java.util.*;
public class totalPrice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter unti price ");
        int unitPrice= input.nextInt();
        System.out.print("enter quantity ");
        int quantity = input.nextInt();

        int totalPrice= unitPrice*quantity;

        System.out.println("The total purchase price is INR "+ totalPrice +" if the quantity " + quantity + "  and unit price is INR "+ unitPrice);
    }
}