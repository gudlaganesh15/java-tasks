import java.io.*;
import java.sql.SQLException;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Task11 {

    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    static void method1() {
        method2();
    }

    static void method2() {
        System.out.println("Exception Propagation Example");
        throw new ArithmeticException("Error in method2");
    }

    public static void main(String[] args) {

        System.out.println("1. Checked and Unchecked Exceptions");

        try {
            FileReader file = new FileReader("test.txt");
            file.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        try {
            int num = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        System.out.println("2. Multiple Catch Blocks");

        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        } catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("3. Try Catch Finally");

        try {
            int result = 10 / 2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        } finally {
            System.out.println("Finally Block Executed");
        }

        System.out.println("4. Throw and Throws");

        try {
            checkAge(15);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("5. Exception Propagation");

        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("6. Custom Exception");

        try {
            checkAge(20);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("7. Try With Resources");

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Hello Java");
            System.out.println("File Written Successfully");
        } catch (IOException e) {
            System.out.println("File Error");
        }

        System.out.println("8. Other Checked Exceptions");

        try {
            Class.forName("java.lang.String");
            System.out.println("Class Found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }

        try {
            throw new SQLException("Database Error");
        } catch (SQLException e) {
            System.out.println("SQLException");
        }

        System.out.println("9. Common Java Exceptions");

        try {
            String value = "Java";
            System.out.println(value.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }

        System.out.println("Program Completed");
    }
}