//Question 9

package Java.java_program_elemnt_practice;

import java.util.*;

public class univDiscount{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter fee: ");
        int fee = input.nextInt();
        System.out.print("enter discount: ");
        double discount= input.nextInt();

        double discountedAmount= (fee * discount)/100;
        double finalFee= fee-discountedAmount;
        System.out.println("The discount amount is INR " + discountedAmount + "and final discounted fee is INR " + finalFee);
    }
}