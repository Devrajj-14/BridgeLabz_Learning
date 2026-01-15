//Quesiton 9

package Java.Level1;
import java.util.*;
public class countNumUsingFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int countDown=sc.nextInt();

        for(int i=countDown; i>=0 ; i--){
            if(countDown>=1){
                System.out.println("count down "+ countDown);
                
            }else{
                System.out.println("launch "+countDown);
            }
            countDown--;
        }
        sc.close();
    }
    
}
