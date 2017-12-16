import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class kolekcje {

	public static void main(String[] args) {
		String[] names = new String[] { "Ala", "Ola", "Asia", "Basia", "Asia", "Ola", "Ela", "Ela", "Ewa", "Ala" };
		ArrayList<String> myList = new ArrayList<>();
		Set<String> myHashSet = new HashSet<>();
		for (int i = 0; i < names.length; i++) {
			myList.add(names[i]);
			myHashSet.add(names[i]);
		}

		for (String name : myList) {
			System.out.println(name);
		}

		System.out.println();

		for (String name : myHashSet) {
			System.out.println(name);
		}

		System.out.println();
		// pobieranie trzeciego elementu listy
		String element = myList.get(2);
		System.out.println(element);

		// czy lista zawiera element "Ola"
		boolean isListContain = false;
		System.out.println("Lista zawiera element Ola: " + myList.contains("Ola"));

		// czy zbiór zawiera element "Ola"
		boolean isHashContain = false;
		System.out.println("Zbiór zawiera element Ola: " + myHashSet.contains("Ola"));

		// metoda remove(int index) dla arraylist

		// metoda remove(object o) dla hashset

	}

}