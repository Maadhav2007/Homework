import java.util.Scanner;

 class StudentMenu  
{

    static int[] marks = new int[5];
    static int sum = 0;
    static double avg = 0;

   
    static void getMarks(Scanner sc) 
	{
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }

    
    static int total() 
	{
        sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        return sum;
    }

    
    static double average() 
	{
        avg = total() / 5.0;
        return avg;
    }

    
    static void grade()
	{
        avg = average();

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 75)
            System.out.println("Grade: B");
        else if (avg >= 60)
            System.out.println("Grade: C");
        else if (avg >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter marks");
            System.out.println("2. Calculate total");
            System.out.println("3. Calculate average");
            System.out.println("4. Find grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    getMarks(sc);
                    break;
                case 2:
                    System.out.println("Total = " + total());
                    break;
                case 3:
                    System.out.println("Average = " + average());
                    break;
                case 4:
                    grade();
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