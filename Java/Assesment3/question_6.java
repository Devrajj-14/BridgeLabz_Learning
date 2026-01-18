package Java.Assesment3;
import java.util.*;
public class question_6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[11];
        int sum=0;
        int mean=0;
        for(int i=1 ; i< arr.length;i++){
            System.out.print("enter the age of member "+ i +" : " );
            int age= sc.nextInt();
            arr[i]=age;
            sum += arr[i];

        }
        mean=sum/(arr.length);
        System.out.println("the mean of the team is " + mean);
    }
}
