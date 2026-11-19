import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("\n----- JAVA OPERATORS -----");
         System.out.println("\n1. Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division and Modulus: Not possible");
        }
         System.out.println("\n2. Relational Operators");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("\n3. Logical Operators");
        System.out.println("(a > 0 && b > 0): " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0): " + (a > 0 || b > 0));
        System.out.println("!(a > b): " + (!(a > b)));

        
        System.out.println("\n4. Assignment Operators");
        int x = a;
        System.out.println("Initial x: " + x);

        x += b;
        System.out.println("x += b: " + x);

        x -= b;
        System.out.println("x -= b: " + x);

        x *= b;
        System.out.println("x *= b: " + x);

        if (b != 0) {
            x /= b;
            System.out.println("x /= b: " + x);

            x %= b;
            System.out.println("x %= b: " + x);
        }

       
        System.out.println("\n5. Unary Operators");
        int n = a;
        System.out.println("Unary plus: " + (+n));
        System.out.println("Unary minus: " + (-n));
        System.out.println("Logical NOT: " + (!(n > 0)));

     
        System.out.println("\n6. Increment Operator");
        int p = a;
        System.out.println("Before increment: " + p);
        System.out.println("Post-increment: " + (p++));
        System.out.println("After post-increment: " + p);
        System.out.println("Pre-increment: " + (++p));

      
        System.out.println("\n7. Decrement Operator");
        int q = b;
        System.out.println("Before decrement: " + q);
        System.out.println("Post-decrement: " + (q--));
        System.out.println("After post-decrement: " + q);
        System.out.println("Pre-decrement: " + (--q));

   
        System.out.println("\n8. Ternary Operator");
        String result = (a > b) ? "A is greater" :
                        (a < b) ? "B is greater" : "Both are equal";
        System.out.println(result);

      
        System.out.println("\nHello, " + name + "!");

        
        sc.close();
    }
}