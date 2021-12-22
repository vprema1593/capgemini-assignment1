import java.util.Scanner;


public class ParentSingleton {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = scanner.nextInt();
		scanner.close();s sum = 0;
		try {
			sum = num1 / num2;
			System.out.println("Sum of these numbers: " + sum);
		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException Occurred");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurred");
		}

	}

}
