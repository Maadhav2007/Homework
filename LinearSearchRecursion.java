import java.util.Scanner;

class LinearSearchRecursion 
{

    
     int linearSearch(int arr[], int index, int key) 
	{
       
        if (index >= arr.length)
			{
            return -1;
        }

        if (arr[index] == key) 
		{
            return index;
        }

       
        return linearSearch(arr, index + 1, key);
    }

      void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, 0, key);

        if (result == -1) 
		{
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}