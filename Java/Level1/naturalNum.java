//Question 4

package Java.Level1;
import java.util.Scanner;
public class naturalNum {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter Number");
        int num= input.nextInt();
        
        if(num>0){
            int sum= num*(num+1)/2;
            System.out.println("the sum of "+num+" natural numcers is " +sum);
        }else{
            System.out.println("the entered number is not natural ");
        }
        input.close();
    }
}
