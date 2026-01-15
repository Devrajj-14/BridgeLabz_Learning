//Question 5

package Java.Level1;
import java.util.*;
public class votingAge {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your age");
        int age= sc.nextInt();

        if(age>=18){
            System.out.println("the person can vote");
        }
        else{
            System.out.println("The person can not vote");
        }
        sc.close();
    }
    
}
