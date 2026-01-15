//Question 3

package Java.Level1;
import java.util.*;
public class findLargest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter num1");
        int num1 = sc.nextInt();        
        System.out.print("enter num2");
        int num2 = sc.nextInt();
        System.out.print("enter num3");
        int num3 = sc.nextInt();       
        
        if(num1>num2 && num1>num3){
            System.out.println("value1 is the largest that is  "+ num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("value2 is the largest that is. " +num2);
        }else{
            System.out.println("value3 is the largest that is. " +num3);
        }
        sc.close();
    }

}

