//Question 

package Java.Level1;
import java.util.*;
public class countNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter count down number ");
        int countDown= sc.nextInt();

        while(countDown>1){
            System.out.println("CountDown: " + countDown);
            countDown--;
        }
        System.out.println("count down reached to 1 Launch");
        sc.close();
    }
}
