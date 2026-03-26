class LinearRec
{
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50,60};
		LinearRec l=new LinearRec ();
		int result = l.rockey(arr,0,40);
		System.out.println(result);
	}
	int rockey(int ar[],int i,int t)
	{
		if (i>t)
		{
			return -1;
		}
		if (ar[i]==t)
		{
			return i;
		}
		return rockey(ar,i+1,t);
	}
}