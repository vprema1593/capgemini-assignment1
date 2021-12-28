package unspportedexception;
import java.util.Scanner;

public class UnsupportedOperationException4 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter thr first number");
			int i=sc.nextInt();
			System.out.println("enter thr second number");
			int j=sc.nextInt();
			try
			{
				int k=i/j;
				System.out.println("answer= " + k);
			}
			catch(ArithmeticException e)
			{
				throw new UnsupportedOperationException("zero cannot divide by any number");
			}
		// TODO Auto-generated method stub

	}
	}
}
