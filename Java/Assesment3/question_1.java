package Java.Assesment3;
import java.util.*;

public class question_1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter age");
        int[] age= new int[10];


        for(int i=0; i<age.length;i++){
            age[i]=sc.nextInt();
            if(age[i]<=0)System.out.println("invalid age");
            else if(age[i]>=18){
                System.out.println("the sutudent with age " +age[i] +" can vote");
            }
            else if(age[i]<18 && age[i]>0){
                System.out.println("the student with the age " + age[i] + " cannot vote");
            }
        }

    }
}