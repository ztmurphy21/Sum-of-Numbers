/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.of.numbers;

import java.util.Scanner;
import static sum.of.numbers.SumOfNumbers.sum;

/**
 *
 * @author zacha
 */
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number, any number, the sky is the limit!");
        number = a.nextInt();
        System.out.println("The sum of all numbers from 1 to " + number + " is " + sum(number));
    }
    public static double sum(int value){
            if (value > 0){
                return  value + sum(value-1);
            }else{
                return 0;
            }
        
}
}
