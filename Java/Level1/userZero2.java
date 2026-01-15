//Question 11

package Java.Level1;
import java.util.*;
public class userZero2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double total=0;
        while(true){
            System.out.print("enter Num");
            double num=sc.nextDouble();
            total+=num;
            if(num<=0)break;
           
            
        }
        System.out.println("the total is "+ total);
    }
}
