class EvenRec
{
	public static void main(String[] args)
	{
		EvenRec er=new EvenRec();
		er.even(i%2)==0);
	}
	void even(int i)
	{
		if ((i%2)==0)
		{
			System.out.println(i+"is even");
			even(1+i);
		}
	}
}