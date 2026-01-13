//Question 5

package Java.java_program_elemnt_practice;

public class equalDivisin{
    public static void main(String[] args){
        int pen=14;
        int NumberOfStudents=3;

        int pensPerStudent=pen/NumberOfStudents;
        int remainingPens=pen%NumberOfStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is" + remainingPens);
    }
}