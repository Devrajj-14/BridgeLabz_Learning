//Question 7

package Java.Level1;
import java.util.*;

public class season {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter month number ");
        int month= sc.nextInt();
        System.out.print("enter the day ");
        int day=sc.nextInt();
        if(month==2)System.out.println("its not Spring Session ");
        
        if(month==3 && day>20 && day<32){
            System.out.println("its a spring season");
        }

        
        else if((month==4 || month==5) && day>0 && day<31){
            System.out.println("its a Spring Season");
        }
        else if(month==6 && day>0 && day <21){
            System.out.println("its a spring season");
        }else{
            System.out.println("its not Spring Season");
        }

        sc.close();

    }
}
