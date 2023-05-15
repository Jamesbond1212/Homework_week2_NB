package homework_week2_NB;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Programme06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       area(sc);
    }
    // create static method

    public static void area(Scanner sc){
        // define radious variable
        int radious;
        //define value of pi
        final double pi = 3.14;
        double area;
        System.out.println("Enter radious of circle:  ");
        radious = sc.nextInt();
        area = pi * radious * radious;
        System.out.println("Area of circle is :  "+area);

    }

}
