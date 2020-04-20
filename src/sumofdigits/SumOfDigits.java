/*
 * Mouner Dabjan 
 * 4/20/2020
 * This program takes a number input by the user and finds the sum of all its digits 
 */
package sumofdigits;
import javax.swing.*;
/**
 *
 * @author User
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // asking the user for their input
       int input = Integer.parseInt(JOptionPane.showInputDialog("Please enter your number"));
       // checking if the user's input is a positive value 
       if (input < 0) {
           System.out.println("Please enter a positive number");
       }
       else {
           //outputting the sum to the user 
           System.out.println("The sum of of the digits of your number is " + sumDigits(input, 0));
       }
       
    }
    // method call 
    public static int sumDigits(int a, int s) {
        // checking if the number entered has only 1 digit 
        if (a<9 && a >=0) 
        {
            s += a;
            return s; 
        }
        // if not adding the rightmost digits until there is none 
        else {
            s += (a%10);
            a = a/10; 
            return sumDigits (a, s); 
        }
    }
    
}
