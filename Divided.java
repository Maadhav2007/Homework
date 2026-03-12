import java.util.Scanner;
class Divided
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" ENTER THE STARTING NUMBER= ");
		int start=sc.nextInt();
		System.out.print(" ENTER THE ENDING NUMBER= ");
		int end=sc.nextInt();
        for (int i=start;i<=end;i++)
        {
		if(i % 5==0)
		{
		System.out.println(" THIS NUMBER IS DIVIDED BY 5 = "+i);	
		}
		else
		{
		System.out.println(" THIS NUMBER IS  NOT DIVIDED BY 5 = "+i);	
			
		}
	}
  }     		
}		
