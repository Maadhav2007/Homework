import java.util.*;

 class SearchMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();
                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Array is empty!");
                    } else {
                        System.out.println("Array elements:");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Array is empty!");
                        break;
                    }
                    System.out.print("Enter element to search (Linear): ");
                    int key1 = sc.nextInt();
                    boolean found1 = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key1) {
                            System.out.println("Element found at position: " + (i + 1));
                            found1 = true;
                            break;
                        }
                    }
                    if (!found1) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Array is empty!");
                        break;
                    }

                    // Sort array before binary search
                    Arrays.sort(arr, 0, n);

                    System.out.print("Enter element to search (Binary): ");
                    int key2 = sc.nextInt();

                    int low = 0, high = n - 1;
                    boolean found2 = false;

                    while (low <= high) {
                        int mid = (low + high) / 2;

                        if (arr[mid] == key2) {
                            System.out.println("Element found at position: " + (mid + 1));
                            found2 = true;
                            break;
                        } else if (arr[mid] < key2) {
                            low = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }

                    if (!found2) {
                        System.out.println("Element not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}