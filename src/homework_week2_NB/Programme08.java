package homework_week2_NB;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */
public class Programme08 {
    // create main method
    public static void main(String[] args) {
        //define scanner
        Scanner sc = new Scanner(System.in);
        Programme08 obj = new Programme08();
        obj.area(sc);
    }

    // Create instance method
    public void area(Scanner sc) {
        System.out.println(" Enter the width of the triangle:  ");
        double width = sc.nextDouble();
        System.out.println(" Enter the height of the traingle:  ");
        double height = sc.nextDouble();
        double area = (width * height) / 2;
        System.out.println(" Area of Triangle is :  " + area);

    }

}
