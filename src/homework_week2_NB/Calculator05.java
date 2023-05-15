package homework_week2_NB;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * //and division methods all with parameters and use string concatenation
 * //methods.(Note: Two static and Two instance methods.)
 */

public class Calculator05 {

    // main method
    public static void main(String[] args) {
        // Define Scanner
        Scanner sc = new Scanner(System.in);
        addition(sc);
        substraction("Enter first number :  ", "Enter second number :  ", sc);
        Calculator05 obj = new Calculator05(); // create object to run instance method of multiplication and division
        obj.multiplication("Enter first number :  ", "Enter second number :  ", sc);
        obj.division("Enter first number :  ", "Enter second number :  ", sc);

    }

    // create 2 static method of addition and subtraction
    public static void addition(Scanner sc) {

        System.out.println("Enter first number :  ");
        int a = sc.nextInt();
        System.out.println("Enter second number :  ");
        int b = sc.nextInt();
        int ans = a + b;
        System.out.println("Addition of " + a + " and " + b + "is : " + ans);

    }

    public static void substraction(String a, String b, Scanner sc) {
        System.out.println(a);
        int number1 = sc.nextInt();
        System.out.println(b);
        int number2 = sc.nextInt();
        int ans = number1 - number2;
        System.out.println("Substraction of " + number1 + " and " + number2 + " is  : " + ans);

    }

    // create 2 instance methods of Multiplication and Division
    public void multiplication(String a, String b, Scanner sc) {
        System.out.println(a);
        int number1 = sc.nextInt();
        System.out.println(b);
        int number2 = sc.nextInt();
        int ans = number1 - number2;
        System.out.println("Multiplication of " + number1 + " and " + number2 + " is  : " + ans);

    }

    public void division(String a, String b, Scanner sc) {
        System.out.println(a);
        int number1 = sc.nextInt();
        System.out.println(b);
        int number2 = sc.nextInt();
        int ans = number1 - number2;
        System.out.println("Division of " + number1 + " and " + number2 + " is  : " + ans);
    }
}