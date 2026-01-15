//Question 17

package Java.Level1;
import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eter salary");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0.0;
        if (years > 5) {
            bonus = 0.05 * salary;
        }
        System.out.println("Bonus amount = " + bonus);
    }
}
