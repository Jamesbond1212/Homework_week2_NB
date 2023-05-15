package homework_week2_NB;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme07 {
    // create main method
    public static void main(String[] args) {
        // define scanner
        Scanner sc = new Scanner(System.in);
        fahrenheit(sc);
    }
// create static method
    public static void fahrenheit(Scanner sc){
        System.out.println(" Enter a degree in Fahrenheit:  ");
        double f = sc.nextDouble();
        double celsious = (( f - 32) * 5/9);
        System.out.println(f + " degree is equal to " + celsious + " in Celsious");
    }
}
