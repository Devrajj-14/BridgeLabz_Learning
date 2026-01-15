//Question 2


package Java.Level2;
import java.util.Scanner;
public class leapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("year must be >= 1582");
        } else {
            boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
            System.out.println(isLeap ? "its a leap year" : "not a leap year");
        }
    }
}
