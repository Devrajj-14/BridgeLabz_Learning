package Java.Assesment4;
import java.util.*;
public class question_1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int maxSize= 10;
        //double[] sal=new double[maxSize];
        double[] bonus=new double[maxSize];

        //double[] year=new double[maxSize];
        double[] newSal=new double[maxSize];

        double[] oldSal=new double[maxSize];

        // double totalBonus= 0;
        // //double oldSal=0.0;
        // double TotalNewSal=0.0;
        
        for(int i=1; i<bonus.length; i++){
            System.out.print("employee " + (i+1));
            System.out.print("enter salary ");
            double s = sc.nextDouble();
            System.out.print("Enter year of experience ");
            double exp = sc.nextDouble();

            oldSal[i]=s;

            if(s<=0 || exp<=0){
                System.out.print("invaid for the increment ");
                i--;
            }
            if(exp>5){
                s *= 0.05;
            }else if(exp<5 && exp>0){
                s *=0.02;
            }
            newSal[i]=oldSal[i]+s;
            bonus[i]=s;

            System.out.println("the empluyee " + i + " zara has to pay the bonus of " + bonus[i] + " so the old Salary was " + oldSal[i] + " and the new salary will be " + newSal[i]);

            
        }
        sc.close();

    }
}
