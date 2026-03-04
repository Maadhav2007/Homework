public class SmartTrafficSignal 
{
    public static void main(String[] args) 
	{

        System.out.print("Enter signal color (R, Y, G): ");
        String color = sc.nextLine();

        if (color.equals("R")) {
            System.out.println("STOP");
        }

        if (color.equals("Y")) {
            System.out.println("READY");
        }

        if (color.equals("G")) 
		{
            System.out.println("GO");
        }

    }
}