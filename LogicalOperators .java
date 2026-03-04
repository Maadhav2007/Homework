class LogicalOperators 
{
    public static void main(String[] args) 
	{
        int a = 10;
        int b = 5;

        boolean andResult = (a > b) && (b > 0);
        boolean orResult = (a < b) || (b > 0);
        boolean notResult = !(a == b);

        System.out.println("(a > b) && (b > 0) : " + andResult);
        System.out.println("(a < b) || (b > 0) : " + orResult);
        System.out.println("!(a == b)          : " + notResult);
    }
}