package Java.Assesment3;
import java.util.*;
public class question_10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number ");
        int num=sc.nextInt();
        String[] arr= new String[num+1];
        System.out.print("Your fizz buzz as follows : ");
        for(int i=1; i<arr.length; i++){
            if (i % 3 == 0 && i % 5 == 0) { 
                arr[i] = "FizzBuzz";
            }
            else if(i%3==0){
                arr[i]="Fizz";
            }else if(i%5==0){
                arr[i]="Buzz";
            }else{
                arr[i]=String.valueOf(i);
            }
            System.out.print(" " + arr[i] + " ");
        }
    }
}
