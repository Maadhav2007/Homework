class OverLoad
{
	public static void main(String[] args)
	{
		OverLoad student=new OverLoad();
		student.sum(7,"THALA");
		student.sum(8050480504l);
		student.sum(25+25+25);
	}
	void sum(int a,String b)
	{
		System.out.println("SCHOOL ID:"+a);
		System.out.println("NAME:"+a);
	}
	void sum(long no)
	{
		System.out.println("PHONE NO:"+no);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}