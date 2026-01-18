package Java.Assesment3;
import java.util.*;
public class question_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number");
        int[] num = new int[5];

        for(int i=0 ; i<num.length;i++){
            num[i]=sc.nextInt();
            if(num[i]>0){
                System.out.println("the nuber is positive ");
            }else if(num[i]<0){
                System.out.println("the number is negative");
            }else if(num[i]==0){
                System.out.println("the number is zero");
            }

            if(num[i]%2==0){
                System.out.println("the number is even");
            }else{
                System.out.println("the number is odd");
            }
            if(num[0] > num[num.length-1]){
                System.out.println("the first number is biggre ");

            }else{
                System.out.println("the last number is bigger ");
            }
        }
        
    }
}
