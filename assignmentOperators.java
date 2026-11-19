public class assignmentOperators {
    public static void main(String[] args) {
        int a = 50;
        int b = 73;
        System.out.println("==========Assignment Operators==========");
        System.out.println("a = b: " + (a = b));
        System.out.println("a += b: " + (a += b));
        System.out.println("a -= b: " + (a -= b));
        System.out.println("a *= b: " + (a *= b));
        System.out.println("a /= b: " + (a /= b));
    
        a %= b;
        System.out.println("a %= b: " + a);
    }
}
