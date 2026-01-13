//Question 8 L2

package Java.java_program_elemnt_practice;
import java.util.*;

public class sample2 {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = input.nextLine();
    System.out.print("Enter source City : ");
    String fromCity = input.nextLine();
    System.out.print("Enter via city : ");
    String viaCity= input.nextLine();
    System.out.print("Enter destination city :" );
    String toCity = input.nextLine();

    System.out.print("Enter distance between source to via ");
    Double distanceFromToVia=input.nextDouble();
    System.out.print("Enter time in min between source to via ");
    Double timeFromToVia= input.nextDouble();
    System.out.print("Enter distance between via to destinatiomn ");
    Double distanceViaToFinalCity= input.nextDouble();
    System.out.print("Enter time took in min between via to destination ");
    Double  timeViaToFinalCity= input.nextDouble();

     double totalDistance = distanceFromToVia + distanceViaToFinalCity;
    double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

}
}
