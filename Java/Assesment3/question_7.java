package Java.Assesment3;
import java.util.*;
public class question_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number ");
        int num = sc.nextInt();
        int size=num/2 +1;
        //int[] arr= new int[size];
        int[] odd=new int[size];
        int[] eve= new int[size];
        
        int oddidx=0;
        int eveidx=0;

        for(int i=1; i<num; i++){
            if(i%2==0){
                eve[eveidx]=i;
                eveidx++;
            }else{
                odd[oddidx]=i;
                oddidx++;
            }
        }
        System.out.println("the odd numberes are : ");
        for(int i=0 ; i< oddidx ;i++){
            System.out.print( odd[i] +" ");
        }
        System.out.println("\nthe even number are : ");
        for(int i=0; i<eveidx; i++){
            System.out.print(eve[i] + " ");
        }
    }
}
