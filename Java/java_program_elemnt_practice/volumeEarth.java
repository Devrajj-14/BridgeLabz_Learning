//Question 7

package Java.java_program_elemnt_practice;

public class volumeEarth{
    public static void main(String[] args){
        double radius = 6378;
        double volume = (4/3.0) * Math.PI * Math.pow(radius, 3);
        double volumeInCubicMiles = volume * 0.23;
        System.out.println("The volume of earth in cubic kilometers is " +volume + " and cubic miles is  " +volumeInCubicMiles);
    }
}