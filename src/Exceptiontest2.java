import java.util.Scanner;

public class Exceptiontest2 {
	public static void Main(String args[])
	{
		boolean flag = false;
		int a,b;
		while(!flag)
		{
			try
			{
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				b = s.nextInt();
				System.out.println(a/b);
				flag = false;
			}
			catch(Exception e)
			{
				System.out.println("Divide by zero");
			}
		}
	}

}
