import java.util.Scanner;
class PassByValue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PassByValue p1 = new PassByValue();
		int a = sc.nextInt();
		p1.add(a);
		System.out.println(a);
	}
	void add(int num)
	{
		num = num + 30;
		System.out.println(num);
	}
}