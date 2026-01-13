//Question 16

package Java.java_program_elemnt_practice;
import java.util.*;

public class maxHandShake {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter the number of student: ");
        int n= input.nextInt();

        int combination = (n*(n-1))/2;

        System.out.print("the possible combination of n nukver of students aer :" + combination);
    }
    
}
