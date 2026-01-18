package Java.Assesment4;
import java.util.*;
public class question_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        int[] height=new int[3];

        for(int i=0; i<age.length; i++){
            System.out.println("enter age ");
            int Age= sc.nextInt();
            System.out.println("enter height");
            int Height=sc.nextInt();

            age[i]=Age;
            height[i]=Height;
        }
        for(int i=0; i<age.length-2; i++){
            if(age[i]>age[i+1] && age[i]>age[i+2]){
                System.out.println("Amar is the oldest " );
            }
            else if(age[i]<age[i+1] && age[i+1]>age[i+2]){
                System.out.println("Akhbar is the oldest " );
            }else{
                System.out.println("Anthni is the oldest " );
            }   

            if(height[i]>height[i+1] && height[i]>height[i+2]){
                System.out.println("Amar is the tallest " );
            }
            else if(height[i]<height[i+1] && height[i+1]>height[i+2]){
                System.out.println("Akhabr is the tallest " );
            }else{
                System.out.println("Anthni is the tallest " );
            }
        }
        sc.close();
    }
}
