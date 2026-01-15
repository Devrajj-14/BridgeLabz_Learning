//Question 12

package Java.Level1;
import java.util.Scanner;

public class naturalNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        if (n < 0) {
            System.out.println("Not a natural number.");
        }
        long sumLoop= 0;
        int i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }
        long sumFormula = (long) n * (n + 1) / 2;

        System.out.println("Sum using while loop = " + sumLoop);
        System.out.println("Sum using formula = " + sumFormula);
        System.out.println("Both results match? = " + (sumLoop == sumFormula));

        sc.close();
    }
}
