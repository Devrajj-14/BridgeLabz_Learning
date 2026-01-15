package Java.Level1;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a positive integre");
        int n = sc.nextInt();
        long factorl = 1;
        int i = 1;
        while (i <= n) {
            factorl *= i;
            i++;
        }
        
        
        System.out.println("factorial of "+ n + "= " + factorl);



    }
    
}
