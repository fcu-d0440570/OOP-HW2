import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean flag = true;
		String string1, string2;
		do {
			System.out.print("Enter a string 1:");
			string1 = scanner.next();
			System.out.print("Enter a string 2:");
			string2 = scanner.next();
			if (string1.compareToIgnoreCase(string2) == 0) {
				System.out.println("The two strings are the same.");
				flag = false;
			} else
				System.out.println("The two strings are not the same.");
		} while (flag);
		scanner.close();
	}
}
