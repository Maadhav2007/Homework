import java.util.Scanner;
class IntToDouble 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result = num;
        System.out.println(result);

        sc.close();
    }
}