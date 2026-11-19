public class Task5 {
    public static void main(String[] args) {

        int i;

        System.out.println("1. For Loop");

        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("2. While Loop");

        i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("3. Do-While Loop");

        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println("4. Enhanced For Loop");

        int arr[] = {10, 20, 30, 40, 50};

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println("5. Nested Loops");

        for (i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("6. Break");

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("7. Continue");

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
