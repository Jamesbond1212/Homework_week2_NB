package homework_week2_NB;

public class Programme01 {
    /**
     *             1.1 Declare two instance variables.
     *             1.2 Declare one instance method.
     *             1.3 Call both instance variables into the instance method inside the print statement.
     *             1.4 Declare the Main method.
     *             1.5 Call the above instance method into the Main method and Run the programme.
     *
     */
    // 1.1 Declare two instance variables.
    int a = 10;
    int b = 20;

    // 1.4 Declare the Main method.
    public static void main(String[] args) {
        Programme01 obj = new Programme01(); //    1.5 Call the above instance method into the Main method and Run the programme.
        obj.myName();
    }
    // 1.2 Declare one instance method.
    public void myName(){
        // 1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(b);
    }


}
