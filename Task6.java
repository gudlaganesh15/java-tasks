import java.util.Arrays;
    public class Task6 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("1. Array Declaration and Initialization");
        System.out.println(Arrays.toString(numbers));

        System.out.println("2. Array Index");
        System.out.println(numbers[0]);

        System.out.println("3. Array Length");
        System.out.println(numbers.length);

        System.out.println("4. Updating Array Values");
        numbers[0] = 100;
        System.out.println(Arrays.toString(numbers));

        System.out.println("5. Traversing an Array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("6. One Dimensional Array");
        int[] oneD = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(oneD));

        System.out.println("7. Two Dimensional Array");
        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("8. String Array");
        String[] names = {"Ram", "Sam", "John"};
        System.out.println(Arrays.toString(names));

        System.out.println("9. Object Array");
        Object[] objects = {101, "Java", 25.5, true};
        System.out.println(Arrays.toString(objects));

        System.out.println("10. Arrays Utility Class");
        System.out.println(Arrays.toString(numbers));

        System.out.println("11. Arrays.sort()");
        int[] sortArr = {50, 10, 40, 20, 30};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));

        System.out.println("12. Arrays.toString()");
        System.out.println(Arrays.toString(sortArr));

        System.out.println("13. Arrays.copyOf()");
        int[] copy = Arrays.copyOf(sortArr, sortArr.length);
        System.out.println(Arrays.toString(copy));

        System.out.println("14. Arrays.equals()");
        System.out.println(Arrays.equals(sortArr, copy));

        System.out.println("15. Find Largest Element");
        int largest = numbers[0];
        for (int n : numbers) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println(largest);

        System.out.println("16. Find Smallest Element");
        int smallest = numbers[0];
        for (int n : numbers) {
            if (n < smallest) {
                smallest = n;
            }
        }
        System.out.println(smallest);

        System.out.println("17. Find Sum of Elements");
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum);

        System.out.println("18. Search for an Element");
        int search = 30;
        boolean found = false;

        for (int n : numbers) {
            if (n == search) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Element Found" : "Element Not Found");

        System.out.println("19. Sort an Array");
        int[] unsorted = {5, 2, 8, 1, 9};
        Arrays.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));

        System.out.println("20. Reverse an Array");
        for (int i = unsorted.length - 1; i >= 0; i--) {
            System.out.print(unsorted[i] + " ");
        }
    }
}