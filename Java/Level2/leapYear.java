//Question 1

package Java.Level2;
import java.util.Scanner;
public class leapYear {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("year must be >= 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println("year is a leap year");
            } else if (year % 100 == 0) {
                System.out.println("Not a leap year");
            } else if (year % 4 == 0) {
                System.out.println("year is a leap ear");
            } else {
                System.out.println("not a leap year");
            }
        }
    }
}
