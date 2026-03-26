class Recurtion
{
	public static void main(String[] args)
	{
		Recurtion r= new Recurtion();
		r.reverse(10);
	}
	void reverse(int i)
	{
		if(i==0)
		{
			return;
		}
		System.out.println(i);
		reverse(i-1);
	}
}