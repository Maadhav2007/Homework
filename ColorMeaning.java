import java.util.Scanner;

  class ColorMeaning 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1 → Red");
        System.out.println("2 → Green");
        System.out.println("3 → Blue");
        System.out.print("Enter your choice (1-3): ");

        int choice = sc.nextInt();

        switch(choice) 
		{
            case 1:
                System.out.println("Red means Danger");
                break;
            case 2:
                System.out.println("Green means Nature");
                break;
            case 3:
                System.out.println("Blue means Sky");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-3.");
        }

        sc.close();
    }
}