package homework_week2_NB;

public class Programme04 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */

        // 4.1 Declare two instance and two static variables.
        int a = 10;
        static int b = 20;

        int c = 30;

        static int d = 40;

        //  4.5 Declare the Main method.
        public static void main(String[] args) {
            // 4.6 Call both instance and static methods into the Main method and run the programme.
            Programme04 obj1 = new Programme04(); // to run the instance method u need to create object
            obj1.m1();
            m2(); // u can run directly or by class name this static method
          // Programme04.m2(); (ANOTHER WAY OF RUNNING THE STATIC method)
        }
// * 4.2 Declare one instance method.

        public void m1(){
            //* 4.4  Call static variables into both instance inside the print statement.
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        }
        // 4.3 Declare one static method.
        public static void m2(){
            //  4.6 Call both instance and static methods into the Main method and run the programme.
            // creating object to call instance variable to static method

            Programme04 obj = new Programme04();
            System.out.println(obj.a);
            System.out.println(b);
            System.out.println(obj.c);
            System.out.println(d);

        }
}
