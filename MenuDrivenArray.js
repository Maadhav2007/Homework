import java.util.Scanner;

public class MenuDrivenArray 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            // Menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Bubble Sort (Ascending)");
            System.out.println("2. Find Largest Element");
            System.out.println("3. Display Original Array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Bubble Sort
                    int sorted[] = arr.clone(); // keep original safe
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (sorted[j] > sorted[j + 1]) {
                                int temp = sorted[j];
                                sorted[j] = sorted[j + 1];
                                sorted[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Sorted Array (Ascending):");
                    for (int i = 0; i < n; i++) {
                        System.out.print(sorted[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    // Find Largest Element
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Largest Element: " + max);
                    break;

                case 3:
                    // Display Original Array
                    System.out.println("Original Array:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}