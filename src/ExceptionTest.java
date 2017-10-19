import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int count=0;
		while(true)
		{
		try
		{
			Scanner s = new Scanner(System.in);
			a = s.nextInt();
			b = s.nextInt();
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			count++;
			System.out.println("Divide by zero");
			if(count==3)
			{
				throw new ArithmeticException("threw Divide by zero"+e);	
			}
			
		}
		}
	}

}
