import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1, string2;
		System.out.print("Enter a string 1:");
		string1 = scanner.next();
		System.out.print("Enter a string 2:");
		string2 = scanner.next();
		if(string1.compareToIgnoreCase(string2)==0)
			System.out.print("The two strings are the same.");
		else
			System.out.print("The two strings are not the same.");
	}
}
