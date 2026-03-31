class Student
{
	String studentname;
	String studentdep;
	int studentage;
	int studentrollno;
	
	
	public static void main(String[] args)
	{
		Student s = new Student();
		s.studentname = "Ram";
		s.studentdep = "cse";
        s.studentage =	15;	
		s.studentrollno = 001;
		System.out.println(s.studentname+" "+s.studentage+" "+s.studentrollno);
		
		
		Student s1 = new Student();
		s1.studentname = "arun";
		s1.studentdep = "it";
        s1.studentage = 24;	
		s1.studentrollno = 18;
		System.out.println(s1.studentname+" "+s1.studentage+" "+s1.studentrollno);
		
		
		
		Student s2 = new Student();
		s2.studentname = "rahul";
		s2.studentdep = "ece";
        s2.studentage =	23;	
		s2.studentrollno = 047;
		System.out.println(s2.studentname+" "+s2.studentage+" "+s2.studentrollno);

	
	}
}