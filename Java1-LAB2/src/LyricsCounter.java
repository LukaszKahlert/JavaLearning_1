import java.util.HashMap;
import java.util.LinkedList;

public class LyricsCounter {

	private static final String LYRICS = "Dwunastu braci, wierzac w sny, zbadalo mur od marzen strony,\n"
			+ "A poza murem plakal glos, dziewczecy glos zaprzepaszczony.\n"
			+ "I pokochali glosu dzwiek i chetny domysl o Dziewczynie,\n"
			+ "I zgadywali ksztalty ust po tym, jak spiew od zalu ginie...\n"
			+ "Mowili o niej: \"lka, wiec jest!\" - I nic innego nie mowili,\n"
			+ "I przezegnali caly swiat - i swiat zadumal sie w tej chwili...\n"
			+ "Porwali mloty w twarda dlon i jeli w mury tluc z loskotem!\n"
			+ "I nie wiedziala slepa noc, kto jest czlowiekiem, a kto mlotem?\n"
			+ "\"O, predzej skruszmy zimny glaz, nim smierc Dziewczyne rdza powlecze!\" -\n"
			+ "Tak, walac w mur, dwunasty brat do jedenastu innych rzecze.\n"
			+ "Ale daremny byl ich trud, daremny ramion sprzeg i usil!\n"
			+ "Oddali ciala swe na strwon owemu snowi, co ich kusil!\n"
			+ "lamia sie piersi, trzeszczy kosc, prochnieja dlonie, twarze bledna...\n"
			+ "I wszyscy w jednym zmarli dniu i noc wieczysta mieli jedna!\n"
			+ "Lecz cienie zmarlych - Boze moj! - nie wypuscily mlotow z dloni!\n"
			+ "I tylko inny plynie czas - i tylko mlot inaczej dzwoni...\n"
			+ "I dzwoni w przod! I dzwoni wspak! I wzwyz za kazdym grzmi nawrotem!\n"
			+ "I nie wiedziala slepa noc, kto tu jest cieniem, a kto mlotem?\n"
			+ "\"O, predzej skruszmy zimny glaz, nim smierc Dziewczyne rdza powlecze!\" -\n"
			+ "Tak, walac w mur, dwunasty cien do jedenastu innych rzecze.\n"
			+ "Lecz cieniom zbraklo nagle sil, a cien sie mrokom nie opiera!\n"
			+ "I powymarly jeszcze raz, bo nigdy dosc sie nie umiera...\n"
			+ "I nigdy dosc, i nigdy tak, jak pragnie tego ow, co kona!...\n"
			+ "I znikla tresc - i zginal slad - i powiesc o nich juz skonczona!\n"
			+ "Lecz dzielne mloty - Boze moj - mdlej nie poddaly sie zalobie!\n"
			+ "I same przez sie bily w mur, huczaly spizem same w sobie!\n"
			+ "Huczaly w mrok, huczaly w blask i ociekaly ludzkim potem!\n"
			+ "I nie wiedziala slepa noc, czym bywa mlot, gdy nie jest mlotem?\n"
			+ "\"O, predzej skruszmy zimny glaz, nim smierc Dziewczyne rdza powlecze!\" -\n"
			+ "Tak, walac w mur, dwunasty mlot do jedenastu innych rzecze.\n"
			+ "I runal mur, tysiacem ech wstrzasajac wzgorza i doliny!\n"
			+ "Lecz poza murem - nic i nic! Ni zywej duszy, ni Dziewczyny!\n"
			+ "Niczyich oczu ani ust! I niczyjego w kwiatach losu!\n"
			+ "Bo to byl glos i tylko - glos, i nic nie bylo oprocz glosu!\n"
			+ "Nic - tylko placz i zal i mrok i niewiadomosc i zatrata!\n"
			+ "Takiz to swiat! Niedobry swiat! Czemuz innego nie ma swiata?\n"
			+ "Wobec klamliwych jawnie snow, wobec zmarnialych w nicosc cudow,\n"
			+ "Potezne mloty legly w rzad, na znak spelnionych godnie trudow.\n"
			+ "I byla zgroza naglych cisz. I byla proznia w calym niebie!\n"
			+ "A ty z tej prozni czemu drwisz, kiedy ta proznia nie drwi z ciebie?";

	private static final String[] SplittedLyric = getWordsInLyrics(); // splitting 

	private static String[] getWordsInLyrics() {
		return LYRICS.split("\\W+");
	}

	public static void main(String[] args) {
		HashMap<String, LinkedList<String>> wordBegins = groupWordWithLetters(SplittedLyric);
		printLinkedList(listOfWordsWhichLetterIsMostUsed(wordBegins));
	}

	/**
	 * This method group HashMap by key - letter of the alphabet and 
	 * value - words beginning with given letter of the alphabet
	 * @param hashMapToCheck
	 * @return grouped HashMap
	 */
	public static HashMap<String, LinkedList<String>> groupWordWithLetters(String[] lyrics) {
		HashMap<String, LinkedList<String>> wordBeginsToAnalyze = new HashMap<>();
		for (String word : lyrics) {
			word = word.toLowerCase();
			String firstLetterOfWord = String.valueOf(word.charAt(0));
			if (!wordBeginsToAnalyze.containsKey(firstLetterOfWord)) {
				LinkedList<String> values = new LinkedList<String>();
				values.add(word);
				wordBeginsToAnalyze.put(firstLetterOfWord, values);
			} else {
				wordBeginsToAnalyze.get(firstLetterOfWord).add(word);
				wordBeginsToAnalyze.put(firstLetterOfWord, wordBeginsToAnalyze.get(firstLetterOfWord));
			}
		}
		return wordBeginsToAnalyze;
	}

	/**
	 * This method checks which LinkedList has bigger size
	 * @param hashMapToCheck
	 * @return LinkedList of words which has most used letter
	 */
	private static LinkedList<String> listOfWordsWhichLetterIsMostUsed(
			HashMap<String, LinkedList<String>> hashMapToCheck) {
		LinkedList<String> resultList = new LinkedList<String>();
		LinkedList<String> listToCheck = new LinkedList<String>();
		for (String name : hashMapToCheck.keySet()) {
			listToCheck = hashMapToCheck.get(name);
			if (resultList.size() < listToCheck.size()) {
				resultList = listToCheck;
			}
		}
		return resultList;
	}

	/**
	 * This method prints all words in LinkedList typed in argument
	 * @param linkedListToPrint
	 */
	public static void printLinkedList(LinkedList<String> linkedListToPrint) {

		for (String word : linkedListToPrint) {
			System.out.println(word);
		}

	}
}

