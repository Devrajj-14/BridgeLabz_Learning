//Question 18

package Java.Level1;
import java.util.Scanner;
public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + "= " + (num * i));


        }

    }
}
