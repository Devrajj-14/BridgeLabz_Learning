//Question 2

package Java.Level1;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter num1");
        int num1= input.nextInt();
        System.out.print("enter num2");
        int num2=input.nextInt();
        System.out.print("enter num3");
        int num3=input.nextInt();   

        if(num1<num2 && num1<num3){
            System.out.println("first number is the smallest");
        }else {
            System.out.println("no first numer is not the smallest");
        }
    }
}
