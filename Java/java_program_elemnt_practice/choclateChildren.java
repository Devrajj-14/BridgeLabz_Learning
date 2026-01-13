//Question 10 L2


package Java.java_program_elemnt_practice;

import java.util.*;
public class choclateChildren {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter number of choclates ");
        Double n= input.nextDouble();
        System.out.print("Enter number of children ");
        Double m= input.nextDouble();

        Double totalChoclatesReceived= n/m;
        Double remainingChoclate= (n%m);

        System.out.println("The number of chocolates each child gets is "+ totalChoclatesReceived +"and the number of remaining chocolates are "+ remainingChoclate);

    }
}
