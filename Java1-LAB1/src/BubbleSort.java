

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = new int[] { 4, 2, 0, 2, 10, 1, 9, 12, 3, 5 };
		sort(numbers);
		printNumbers(numbers);
	}

	public static void sort(int[] tableToSort) {

		for (int i = 0; i < tableToSort.length; i++) {
			for (int j = 0; j < tableToSort.length - 1; j++) {
				if (isGreaterThan(tableToSort[j], tableToSort[j + 1])) {
					tableToSort= swap(tableToSort,j, j + 1);
				}
			}
		}
	}

	public static int[] swap(int[] tabWithObjectToSwap,int indexFirst, int indexSecond) {		
		int temp = tabWithObjectToSwap[indexFirst];
		tabWithObjectToSwap[indexFirst] = tabWithObjectToSwap[indexSecond];
		tabWithObjectToSwap[indexSecond]= temp;
		return tabWithObjectToSwap;
	}

	public static boolean isGreaterThan(int x, int y) {
		return x > y;
	}

	public static void printNumbers(int[] tableToPrint) {
		for (int numberToPrint : tableToPrint) {
			System.out.print(numberToPrint + " ");
		}
	}

}
