import java.util.Scanner;
class Amstro
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER THE YOUR NUMBER = ");
	int a=sc.nextInt();
	int temp=a;
	int rev=0;
	int sum=0;
	while(a>0)
	{
		rev=a%10;
		sum=(rev*rev*rev)+sum;
		a=a/10;
	}
	   if (temp==sum)
	   {
		   System.out.println(sum+" NUMBER IS A AMSTRONG ");
	   }
	   else
	   {
		   System.out.println(sum+" NUMBER IS NOT A AMSTRONG ");
		   
	   }
	}
}