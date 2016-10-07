import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		input = scanner.nextInt();
		if ((input % 2) == 0)
			System.out.println("The input integer is Even Number.");
		else
			System.out.println("The input integer is Odd Number.");
	}
}
