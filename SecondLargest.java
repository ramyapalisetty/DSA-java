import java.util.Scanner;

public class SecondLargest {

    public static int getSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // No second distinct largest element
        }

        return secondLargest;
    }

    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) { 
    

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSecondLargest(arr);

        if (result == -1) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second largest element is: " + result);
        }

        sc.close();
    }
}
}
