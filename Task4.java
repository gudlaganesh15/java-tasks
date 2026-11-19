public class Task4 {
    public static void main(String[] args) {

        int age = 20;
        int marks = 85;
        int a = 10, b = 20, c = 30;
        int choice = 2;
        int i;

        if (age >= 18) {
            System.out.println("1. Eligible to vote");
        }

        if (age >= 18) {
            System.out.println("2. Adult");
        } else {
            System.out.println("Minor");
        }

        if (marks >= 90) {
            System.out.println("3. Grade A");
        } else if (marks >= 75) {
            System.out.println("3. Grade B");
        } else {
            System.out.println("3. Grade C");
        }

        if (age >= 18) {
            if (marks >= 50) {
                System.out.println("4. Nested if condition is true");
            }
        }

        if (a < b && b < c) {
            System.out.println("5. Multiple conditions are true");
        }

        if (age >= 18 && age <= 60) {
            System.out.println("6. AND condition");
        }

        if (age < 18 || age > 60) {
            System.out.println("OR condition");
        }

        if (!(age < 18)) {
            System.out.println("NOT condition");
        }

        switch (choice) {
            case 1:
                System.out.println("7-10. Monday");
                break;

            case 2:
                System.out.println("7-10. Tuesday");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("11. Continue example:");

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }
    }
}
