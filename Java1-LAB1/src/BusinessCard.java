import java.util.Scanner;

public class BusinessCard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj imie:");
		String name = scanner.next();

		System.out.println("Podaj nazwisko:");
		String surname = scanner.next();

		System.out.println("Podaj numer telefonu");
		int tel = scanner.nextInt();

		System.out.println("Podaj miasto:");
		String city = scanner.next();

		String line1 = ("* " + name + " " + surname);
		String line2 = ("* tel. " + tel + " adres: " + city);
		String stars = "**";

		if (line2.length() > line1.length()) {
			for (int i = 0; i < line2.length(); i++) {
				stars += "*";
			}
			int lenghtDifferenceBeetwenLines = stars.length() - line1.length();
			for (int i = 0; i < lenghtDifferenceBeetwenLines - 1; i++) {
				line1 += " ";
			}
			line1 += "*";
			line2 += " *";
		} else {
			for (int i = 0; i < line1.length(); i++) {
				stars += "*";
			}
			int lenghtDifferenceBeetwenLines = stars.length() - line2.length();
			for (int i = 0; i < lenghtDifferenceBeetwenLines - 1; i++) {
				line2 += " ";
			}
			line2 += "*";
			line1 += " *";
		}
		System.out.println(stars);
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(stars);
	}

}
