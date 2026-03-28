import java.util.Scanner; 
class MergeSortMenu 
{

    static int arr[];
    static int n;

   
    static void mergeSortAsc(int arr[], int left, int right) 
	{
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortAsc(arr, left, mid);
            mergeSortAsc(arr, mid + 1, right);

            mergeAsc(arr, left, mid, right);
        }
    }

    static void mergeAsc(int arr[], int left, int mid, int right) 
	{
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) 
		{
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    
    static void mergeSortDesc(int arr[], int left, int right) 
	{
        if (left < right) 
		{
            int mid = (left + right) / 2;

            mergeSortDesc(arr, left, mid);
            mergeSortDesc(arr, mid + 1, right);

            mergeDesc(arr, left, mid, right);
        }
    }

    static void mergeDesc(int arr[], int left, int mid, int right) 
	{
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) 
		{
            if (L[i] >= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

   
    static void findMedian() 
	{
        if (n == 0) {
            System.out.println("Array is empty!");
            return;
        }

        mergeSortAsc(arr, 0, n - 1);

        if (n % 2 == 0) {
            double median = (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;
            System.out.println("Median: " + median);
        } else {
            System.out.println("Median: " + arr[n / 2]);
        }
    }

    
    static void display()
	{
        if (n == 0) 
		{
            System.out.println("Array is empty!");
            return;
        }

        System.out.print("Array: ");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter Array");
            System.out.println("2. Sort Ascending (Merge Sort)");
            System.out.println("3. Sort Descending (Merge Sort)");
            System.out.println("4. Find Median");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();
                    arr = new int[n];
                    System.out.println("Enter elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    mergeSortAsc(arr, 0, n - 1);
                    System.out.println("Sorted in Ascending Order.");
                    break;

                case 3:
                    mergeSortDesc(arr, 0, n - 1);
                    System.out.println("Sorted in Descending Order.");
                    break;

                case 4:
                    findMedian();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        
    }
}