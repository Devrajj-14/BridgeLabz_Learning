//Question 1 

package Java.Level1;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter num: ");
        int num= input.nextInt();
        if(num%5==0){
            System.out.println("Nuber is divisible by 5 ");
        }else{
            System.out.println("The num is not divisible by 5");
        }
        input.close();
    }
    
}
