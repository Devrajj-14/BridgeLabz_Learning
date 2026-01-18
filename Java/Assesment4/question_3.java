package Java.Assesment4;
import java.util.*;
public class question_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[10];
        int oldIdx=0;
        int largest=0;
        
        for(int i=0; i<arr.length; i++){
            System.out.print("Ener the numberes one by one : ");
            int digit=sc.nextInt();
            arr[i]=digit;

            if(arr[i]>arr[oldIdx])oldIdx=i;
            largest=arr[oldIdx];

        }
        System.out.println("the largest number is : "+ largest);
        sc.close();
    }
}
