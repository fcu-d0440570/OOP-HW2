import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intInput;
		String stringInput;
		float floatInput;
		System.out.print("Enter a integer:");
		intInput = scanner.nextInt();
		System.out.print("Enter a float point number:");
		floatInput = scanner.nextFloat();
		System.out.print("Enter a you name:");
		stringInput = scanner.next();
		System.out.format("Hi %s, the multiplication of %d and %f is %ef.", stringInput, intInput, floatInput,
				intInput * floatInput);
	}
}
