import java.util.Scanner;
class Bubble
{
Scanner sc= new Scanner(System.in);
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER THE ARRAY SIZE : ");
	int size=sc.nextInt();
	int ar[]=new int [size];
	Bubble b=new Bubble();
	b.get(ar);
	b.sort(ar);
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]+" ");
	}
	System.out.print("ENTER THE TARGET : ");
	int target=sc.nextInt();
	int result=b.search(ar,0,target);
	System.out.print(result);
}
void get(int ar[])
{
	for(int i=0;i<ar.length-1;i++)
	{
		System.out.print("ENTER THE INDEX OF "+i+" VALUE IS : ");
		ar[i]=sc.nextInt();
	}
	
}
void sort(int a[])
{
	for (int i=0;i<a.length-1;i++)
	{
		for (int j=0;j<a.length-1;j++)
		{
			if (a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
			    a[j+1]=temp;
			}
		}
	}
}


int search(int are[],int i,int t)
{
	if (i>are.length-1)
	{
		return-1;
	}
	if(are[i]==t)
	{
		return i;
	}
	return search(are,i+1,t);
}
}