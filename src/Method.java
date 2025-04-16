import com.sun.org.apache.bcel.internal.generic.RET;

public class Method {
    public static void main(String[] args) {
        myMethod();
        newLine();
        sayHello();
        newLine();
        myMethod("Saurav","Sarkar");
        newLine();
        checkAge(20);
        newLine();
        int z = sum(5,5);
        System.out.println(z);
        newLine();
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        newLine();
        int myNumOne = plusMethod(8, 5);
        double myNumTwo = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNumOne);
        System.out.println("double: " + myNumTwo);



    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void newLine() {
        System.out.println("\n");
    }


    static void myMethod(String fname , String lname) {
        System.out.println(fname + " " +lname);
    }



    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static int sum(int x , int y){
        return x + y ;
    }

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }




}
