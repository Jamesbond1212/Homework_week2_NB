package homework_week2_NB;

public class Programme02 {
    /**
     *      2.1 Declare two static variables
     *      2.2 Declare one static method
     *      2.3 Call both static variables into the static method inside the print statement.
     *      2.4 Declare the Main method.
     *      2.5 Call the static method into the Main method and Run the programme.
      */

   // 2.1 Declare two static variables

    static int a = 30;
    static int b = 40;

    //     2.4 Declare the Main method
    public static void main(String[] args) {

        myWorld(); // 2.5 Call the static method into the Main method and Run the programme.
       // Programme02.myWorld(); // 2.5 Call the static method into the Main method and Run the programme.(2 WAYS OF CALLING STATIC METHOD)
    }
    public static void myWorld(){
        // 2.3 Call both static variables into the static method inside the print statement.
        System.out.println(a);
        System.out.println(b);
    }
}
