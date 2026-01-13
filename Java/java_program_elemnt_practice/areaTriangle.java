//Question 12

package Java.java_program_elemnt_practice;

import java.util.*;

public class areaTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter base in cm:");
        int cm_base= input.nextInt();
        System.out.print("enter height in cm");
        int cm_height= input.nextInt();

        double feet_base= cm_base/30.48;
        double feet_hight= cm_height/30.48;

        double inches_base= cm_base *0.3937;
        double inches_hight= cm_height *0.3937;

        double areaInCubicFeet= (feet_base * feet_hight)*1/2;
        double areaInCubicInches= (inches_base * inches_hight)*1/2;

        System.out.println("Your Height in cm is "+ cm_height + " while in feet is " + feet_hight + "and inches is" + inches_hight + "\n area of triangle in cubic inch "+ areaInCubicInches + "area of triangle in cubic feet" + areaInCubicFeet );

    }
}