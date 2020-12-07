package bubblesort;

import java.text.DecimalFormat;
import java.util.*;

public class BubbleSort {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many numbers would you like to sort?");
        int sortNumber = input.nextInt();
        
        int[] numbers = new int[sortNumber];
        double average = 0;
        
        
        
        System.out.println("Enter a number");
        for (int i = 0; i < numbers.length; i++){
            if ( i <= 10){
                numbers[i] = input.nextInt();
            }else{
                System.out.print("");
            } average = average + numbers[i];
            
            
        }
        
        int length = numbers.length;
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    System.out.println(Arrays.toString(numbers));

                } else {
                    System.out.print("");
                }

            }

        }
        average = average/length;
        System.out.println("\nThe lowest number is: " + numbers[0]);
        System.out.println("The highest number is: " + numbers[length - 1]);        
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The average is: " + df.format(average));

    }

}
  