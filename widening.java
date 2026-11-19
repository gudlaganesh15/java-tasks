public class widening {
    public static void main(String[] args) {
        System.out.println("==========Widening casting==========");
       int a = 25;
       double b = a;
       System.out.println(" Widening casting:" + b);


       System.out.println("==========Narrowing casting==========");
       double c = 35.3;
       int d = (int) c;
       System.out.println("Narrowing casting:" +d);
    }
}