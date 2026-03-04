class OperatorEvaluation 
 {
    public static void main(String[] args) 
	{
        int a = 10;
        int b = 5;
        int c = 15;

        int sum = a + b;
        int product = b * c;
        int difference = c - a;

        boolean rel1 = a > b;            
        boolean rel2 = c == (a + b);
        boolean rel3 = b != c;

        boolean log1 = (a > b) && (c > a);
        boolean log2 = (a < b) || (c > b);
        boolean log3 = !(a == c);

        System.out.println("Arithmetic Results:");
        System.out.println("a + b = " + sum);
        System.out.println("b * c = " + product);
        System.out.println("c - a = " + difference);

        System.out.println("\nRelational Results:");
        System.out.println("a > b : " + rel1);
        System.out.println("c == (a + b) : " + rel2);
        System.out.println("b != c : " + rel3);

        System.out.println("\nLogical Results:");
        System.out.println("(a > b) && (c > a) : " + log1);
        System.out.println("(a < b) || (c > b) : " + log2);
        System.out.println("!(a == c) : " + log3);
    }
}