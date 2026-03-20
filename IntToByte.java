import java.util.Scanner;

public class IntToByte 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        byte result = (byte) num;
        System.out.println(result);
		sc.close();
    }
}