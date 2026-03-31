import java.util.Scanner;

 class CountForty 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

     
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        
        int count = 0;
        for (int i = 0; i < n; i++) 
		{
            if (arr[i] == 40) 
			{
                count++;
            }
        }

        
        System.out.println("Count of 40: " + count);

        sc.close();
    }
}