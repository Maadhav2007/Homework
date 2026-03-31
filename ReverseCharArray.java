 class ReverseCharArray
 {
    public static void main(String[] args)
	{
        
        
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        
        System.out.print("Original Array: ");
        for (char c : arr) 
		{
            System.out.print(c + " ");
        }

        
        int start = 0;
        int end = arr.length - 1;

        while (start < end) 
		{
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("\nReversed Array: ");
        for (char c : arr) 
		{
            System.out.print(c + " ");
        }
    }
}