package homework_week2_NB;

/**
 * Write a Java program to swap two variables.
 */

public class Programme15 {
    public static void main(String[] args) {

        int a, b, temp;
        a = 20;
        b = 30;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
