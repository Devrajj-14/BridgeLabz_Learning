package Java.Assesment3;
import java.util.*;
public class question_9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[][] arr2D=new int[2][2];

        for(int i=0;i<arr2D.length;i++){
            for(int j=0; j<arr2D[i].length; j++){
                System.out.print("enter the num");
                arr2D[i][j]=sc.nextInt();

            }
        }
        int rows=arr2D.length;

        int columns=arr2D[0].length;
        int[] arr= new int[rows * columns];
        int index=0;

        for(int i=0; i<arr2D.length ;i++){
            for(int j=0; j<arr2D[i].length; j++){
            arr[index ]= arr2D[i][j];
            index++;
            }
        }
        System.out.print("2d to 1d arr as follows : " );
        for(int i=0; i<arr.length;i++){
            System.out.print( " "+ arr[i]+ " ");
        }

    }
}
