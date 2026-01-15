//Question 13

package Java.Level1;
import java.util.Scanner;
public class naturalNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("not a natural number");
            sc.close();
            return;
        }
        long sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        long sumFormula = (long) n * (n + 1) / 2;

        System.out.println("Sum using for loop = " + sumLoop);
        System.out.println("sum using formula = " + sumFormula);
        System.out.println("both results match? = " + (sumLoop == sumFormula));

    }

}
