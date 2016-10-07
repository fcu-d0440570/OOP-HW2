import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		String number;
		System.out.println("Enter a integer:");
		input = scanner.nextInt();		
		switch (input) {
		case 1:
			number = "ONE";
			break;
		case 2:
			number = "TWO";
			break;
		case 3:
			number = "THREE";
			break;
		case 4:
			number = "FOUR";
			break;
		case 5:
			number = "FIVE";
			break;
		case 6:
			number = "SIX";
			break;
		case 7:
			number = "SEVEN";
			break;
		case 8:
			number = "EIGHT";
			break;
		case 9:
			number = "NINE";
			break;
		default:
			number = "OTHER";
		}
		System.out.println("The input integer is ¡§" + number + "¡¨.");
	}
}
