package Java.Assesment4;
import java.util.*;
public class question_4 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        long number = sc.nextLong();
        if (number < 0) number = -number;

        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[index] = 0;
            index++;
        } else {
            while (number != 0) {
                int digit = (int)(number % 10);
                if (index == maxDigit) {
                    maxDigit = maxDigit + 10;
                    int[] temp = new int[maxDigit];    

                    for (int i = 0; i < digits.length; i++) {
                        temp[i] = digits[i];
                    }
                    digits = temp;
                }

                digits[index] = digit;
                index++;

                number = number / 10;
            }
        }
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Display stored digits
        System.out.print("Digits stored: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit = " + largest);

        if (secondLargest == -1) {
            System.out.println("second largest digit nor available");
        } else {
            System.out.println("second largest digit " + secondLargest);
        }

        sc.close();
    
    }
}
