package homework_week2_NB;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme03 {
    // 3.1 Declare one instance and one static variable.
    int a = 10;
    static int b = 20;

//  3.5 Declare the Main method.
       public static void main(String[] args) {
           // 3.6 Call both instance and static methods into the Main method and run the programme.
           Programme03 obj1 = new Programme03(); // to run the instance method u need to create object
           obj1.m1();
           m2(); // u can run directly or by class name this static method

}
// * 3.2 Declare one instance method.

    public void m1(){
           //* 3.4 Call static variables into both instance inside the print statement.
        System.out.println(a);
        System.out.println(b);

    }
    //  3.3 Declare one static method.
    public static void m2(){
           //  3.4 Call static variables into static methods inside the print statement.
        // creating object to call instance variable to static method
           Programme03 obj = new Programme03();
        System.out.println(obj.a);
        System.out.println(b);

    }

}
