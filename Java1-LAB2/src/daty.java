import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.time.LocalDate;
import java.time.Period;

class daty {

	public static void main(String[] args) {
		LocalDate date = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Wybierz jedn¹ z dostêpnych opcji");
		System.out.println("1 - recznie podana data");
		System.out.println("2 - losowa data");


		Boolean isValid = false;
		while (!isValid) {
			int optionChoosen = scan.nextInt();
			switch (optionChoosen) {

			case 1:
				isValid=true;
				date = createUserDate();
				printResults(date);
				break;

			case 2:
				isValid=true;
				date = createRandomDate();
				printResults(date);
				break;

			default:
				isValid=false;
				System.out.println("Nie ma takiej opcji");
				break;
			}
		}
	}

	public static void printResults(LocalDate date) {
		System.out.println("Wczytana data to:");
		System.out.println(date);

		System.out.println("Dzisiejsza data to:");
		LocalDate dateNow = LocalDate.now();
		System.out.println(dateNow);
		calculateAndPrintDifferenceBetweenDates(date, dateNow);
	}

	public static void calculateAndPrintDifferenceBetweenDates(LocalDate dateTimeFirst, LocalDate dateTimeSecond) {
		Period period = dateTimeFirst.until(dateTimeSecond);
		long yearsBetween = Math.abs(period.getYears());
		long monthsBetween = Math.abs(period.getMonths());
		long daysBetween = Math.abs(period.getDays());
		System.out.println("\n Miêdzy datami jest ró¿nica " + yearsBetween + " lat " + monthsBetween + " miesiêcy "
				+ daysBetween + " dni");
	}

	public static LocalDate createUserDate() {
		boolean isValid = false;
		LocalDate date = null;
		while (!isValid) {
			try {
				Scanner scan = new Scanner(System.in);

				System.out.println("Podaj dzieñ");
				int day = scan.nextInt();

				System.out.println("Podaj miesi¹c");
				int month = scan.nextInt();

				System.out.println("Podaj rok");
				int year = scan.nextInt();

				date = LocalDate.of(year, month, day);
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.print("Poda³eœ liczbê w z³ym formacie \n");
			}
		}
		return date;
	}

	public static LocalDate createRandomDate() {
		int day = randomizer(1, 28);
		int month = randomizer(1, 12);
		int year = randomizer(1900, 2015);

		LocalDate date = LocalDate.of(year, month, day);
		return date;
	}

	public static int randomizer(int from, int to) {
		Random random = new Random();
		int result = random.nextInt(to - from + 1) + from;
		return result;
	}

}