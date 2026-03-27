import java.util.Scanner;
class Array2
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }
        int maxIndex = 0;
        for (int i = 1; i < n; i++) 
		{
            if (arr[i] > arr[maxIndex]) 
			{
                maxIndex = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;
        System.out.println("After swapping max with first: ");
        for (int i = 0; i < n / 2; i++) 
		{
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("After reversing: " );
        System.out.println("After sorting: " );
    }
}