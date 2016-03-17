
package sum.of.numbers;

import java.util.Scanner;
import static sum.of.numbers.SumOfNumbers.sum;

/**
 *
 * @author Zach Murphy
 */
public class SumOfNumbers {
//main method 
    public static void main(String[] args) {
        //scanner object
        Scanner a = new Scanner(System.in);
        //declaring variables
        int number;
        //getting info from users
        System.out.println("Please enter a number, any number, the sky is the limit!");
        number = a.nextInt();
        //output from recursion method
        System.out.println("The sum of all numbers from 1 to " + number + " is " + sum(number));
    }
    
    //recursion method 
    public static double sum(int value){
        //calculation    
        if (value > 0){
                return  value + sum(value-1);
            }else{
                return 0; // this needs to be zero other wise if you make it one for example output will be off by +1...
            }
        
}
}
