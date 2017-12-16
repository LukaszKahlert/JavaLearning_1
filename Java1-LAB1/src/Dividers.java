import java.util.ArrayList;
import java.util.Scanner;

public class Dividers {

	public static void main(String[] args) {

		int[] numberDividers;
		numberDividers = findDividers(readNumber());
		printDividers(numberDividers);

	}

	public static int readNumber() {

		int number = 0;
		Scanner scanner = new Scanner(System.in);
		boolean numberIsNotNatural = true;

		while (numberIsNotNatural) {
			System.out.println("Podaj liczb� naturaln�:");
			number = scanner.nextInt();

			if (number >= 1) {
				numberIsNotNatural = false;
			} else {
				System.out.println("To nie jest liczba naturalna. Podaj prawid�ow� liczb�:");
			}

		}
		return number;
	}

	public static boolean checkDivider(int a, int b) {
		return a % b == 0;
	}

	public static int[] findDividers(int x) {
		int i=0;
		int[] results= new int[(x/2)+1]; 		   			//assumption that all number has got max x/2 dividers
		for (int number = 1; number <= x/2; number++) {     //starting from i=1 because 
												   			// division by zero is not allowed
			if (checkDivider(x,number)) {	
				results[i]= number;
				i++;
			}								
		}
		results[i]=x;										// because x%x is always ==0 
		results=removeValueFromTable(results, 0);			// removing value 0 from table results
		return results;	
	}

	public static int[] removeValueFromTable(int[] tabArgs, int value) { //dodatkowa metoda przycinaj�ca tablic� 
		
		int newTableLenght = 0;
		for (int i = 0; i < tabArgs.length; i++) {
			if (tabArgs[i] !=value) {
				newTableLenght++;
			}
		}
		
		int[] newTable =new int[newTableLenght];
		int i=0;
		for (int tabArg: tabArgs) {
			if (tabArg != value) {
				newTable[i]=tabArg;
				i++;
			}
		}
	

		return newTable;

	}

	public static void printDividers(int[] tabArgs) {
		System.out.println("Dzielniki wynosz� odpowiednio");
		for (int tabArg : tabArgs) {
				System.out.println(tabArg);
		}
	}
	// wydaj� mi si�, �e bardziej eleganckim sposobem ni� utworzenie i przycinanie
	// tablicy (�eby zawiera�a dok�adnie
	// tyle dzielnik�w ile trzeba) jest utworzenie ArrayList. Nie mniej jednak w
	// poleceniu jest wyszczeg�owione,�e metoda findDividers
	// ma zwraca� tablic� dlatego zakomentowa�em t� metod�

	/*
	 * public static ArrayList<Integer> findDividers(int x) { ArrayList<Integer>
	 * listOfDividers = new ArrayList<Integer>();
	 * 
	 * for (int number = 1; number <= x / 2; number++) {
	 * 
	 * if (checkDivider(x, number)) { listOfDividers.add(number); } }
	 * listOfDividers.add(x); // because x%x is always ==0 return listOfDividers; }
	 */

	// przeci��ona metoda printDiviers (gdyby�my chcieli skorzysta� z metody
	// findDividers przyjmuj�cej ArrayList<Integer>
	/*
	 * public static void printDividers(ArrayList<Integer> listArgs) {
	 * System.out.println("Dzielniki wynosz� odpowiednio"); for (int arg : listArgs)
	 * { if (arg > 0) System.out.println(arg); }
	 */

}
