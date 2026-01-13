//Question 6

package Java.java_program_elemnt_practice;

public class discount{
    public static void main(String[] args){
        int UnivFees=125000;
        int discount= 10;

        int discountPrice=UnivFees * discount / 100;
        int finalFees= UnivFees - discountPrice;

        System.out.println("The discount amount is INR " + discountPrice + " and final discounted fee is INR" + finalFees);
    }
}