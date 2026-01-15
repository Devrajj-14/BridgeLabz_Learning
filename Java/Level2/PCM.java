//Question 3

package Java.Level2;
import java.util.Scanner;
public class PCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter physics marks");
        double phy = sc.nextDouble();
        System.out.print("enter chemistry mark");
        double chem = sc.nextDouble();
        System.out.print("enter maths mark");
        double math = sc.nextDouble();

        double avg = (phy + chem + math) /3;
        String grade;
        String rmk;

        if (avg >= 80) {
            grade = "A";
            rmk = "level 4";
        } else if (avg >= 70) {
            grade = "B";
            rmk = "level 3";
        } else if (avg >= 60) {
            grade = "C";
            rmk = "level 2";
        } else if (avg >= 50) {
            grade = "D";
            rmk = "level 1";
        } else if (avg >= 40) {
            grade = "E";
            rmk = "evel 1-";
        } else {
            grade = "R";
            rmk = "remedial";
        }

        System.out.printf("average is ", avg);
        System.out.println("grad= " + grade);
        System.out.println("remark = " + rmk);
    }
}
