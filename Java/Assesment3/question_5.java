package Java.Assesment3;
import java.util.*;
public class question_5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number ");
        double num = sc.nextDouble();
        double[] arr = new double[4];
        int a=0;
        for(int i=6; i<=9 ; i++){
            double multi =num*i;
            arr[a]=multi;
            System.out.println("the num " +num + " multiplied by " +i+ " is = "+ arr[a]);
            a++;
        }
    }
}
