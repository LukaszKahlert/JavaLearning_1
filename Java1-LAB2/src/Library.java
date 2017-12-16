import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {

		HashMap<String, Integer> myHashMap = createBooksCounter();
		printWhiteRavens(findWhiteRavens(myHashMap));
		findAndPrintUniqueBooks(BOOKS);
	}

	private static String[] BOOKS = { "Priests Of Dawn", "Chicken Abroad", "Lord With Sins", "Chicken Abroad",
			"Fish And Horses", "Mistress Of Devotion", "Bandit Of The Void", "Lord With Sins",
			"Guardians And Gangsters", "Lions Of Dread", "Chicken Abroad", "Future Of Fire", "Priests Of Dawn",
			"Fish And Horses", "Chicken Abroad", "Fish And Horses", "Guardians And Gangsters", "Inception Of Heaven",
			"Lord With Sins", "Future Of Fire", "Driving Into The Depths", "Starting The Demons", "Maid With Blue Eyes",
			"Mistress Of Devotion", "Lovers In The Forest", "Fish And Horses", "Maid With Blue Eyes",
			"Destruction Of The Faceless Ones", "Guardians And Gangsters", "Chicken Abroad" };

	public static HashMap<String, Integer> createBooksCounter() {

		HashMap<String, Integer> myHashMap = new HashMap<>();
		for (String BOOK : BOOKS) {
			countBook(myHashMap, BOOK);
		}
		return myHashMap;
	}

	public static void countBook(HashMap<String, Integer> booksCounter, String book) {
		int firstAttemptOfBook = 1;
		if (booksCounter.containsKey(book)) {
			int updatedKey = (booksCounter.get(book)) + 1;
			booksCounter.put(book, updatedKey);
		} else {
			booksCounter.put(book, firstAttemptOfBook);
		}
	}

	public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter) {
		ArrayList<String> myArrayList = new ArrayList<>();
		for (String key : booksCounter.keySet()) {
			if (booksCounter.get(key) == 1) {
				myArrayList.add(key);
			}
		}
		return myArrayList;
	}

	public static void printWhiteRavens(ArrayList<String> whiteRavens) {
		System.out.println("Bia³e kruki to:");
		for (String whiteRaven : whiteRavens) {
			System.out.println(whiteRaven);
		}
	}
	
	public static void findAndPrintUniqueBooks(String[] books) {
		HashSet<String> myHashSetBook = new HashSet<>();
		for (String book : books) {
			myHashSetBook.add(book);
		}
		System.out.println("\nUnikalne tytu³y ksi¹¿ke(bez powtórek):");
		for (String book : myHashSetBook) {
			System.out.println(book);
		}
		
		Set<String> treeSetBook = new TreeSet<String>(myHashSetBook);       //to get 
		System.out.println("\nUnikalne tytu³y ksi¹¿ke(bez powtórek) ALFABETYCZNIE:");
		for (String book : treeSetBook) {
			System.out.println(book);
		}
	}
	
}