package Java.Assesment3;
import java.util.*;
public class question_3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number to be multiliec");
        int[] multi = new int[11];
        int num= sc.nextInt();
        
        for(int i=1; i<=multi.length;i++){
            int multiplic= num*i;
            multi[i] = multiplic;
            System.out.println("the " + num + " multiplied to " +i+ " is " + multiplic);   
        }
    }
}