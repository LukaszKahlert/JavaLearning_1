import java.util.HashMap;
import java.util.LinkedList;

public class LyricsCounterBadVersion {

    private static final String LYRICS = "Dwunastu braci, wierzac w sny, zbadalo mur od marzen strony,\n" +
            "A poza murem plakal glos, dziewczecy glos zaprzepaszczony.\n" +
            "I pokochali glosu dzwiek i chetny domysl o Dziewczynie,\n" +
            "I zgadywali ksztalty ust po tym, jak spiew od zalu ginie...\n" +
            "Mowili o niej: \"lka, wiec jest!\" - I nic innego nie mowili,\n" +
            "I przezegnali caly swiat - i swiat zadumal sie w tej chwili...\n" +
            "Porwali mloty w twarda dlon i jeli w mury tluc z loskotem!\n" +
            "I nie wiedziala slepa noc, kto jest czlowiekiem, a kto mlotem?\n" +
            "\"O, predzej skruszmy zimny glaz, nim smierc Dziewczyne rdza powlecze!\" -\n" +
            "Tak, walac w mur, dwunasty brat do jedenastu innych rzecze.\n" +
            "Ale daremny byl ich trud, daremny ramion sprzeg i usil!\n" +
            "Oddali ciala swe na strwon owemu snowi, co ich kusil!\n" +
            "lamia sie piersi, trzeszczy kosc, prochnieja dlonie, twarze bledna...\n" +
            "I wszyscy w jednym zmarli dniu i noc wieczysta mieli jedna!\n" +
            "Lecz cienie zmarlych - Boze moj! - nie wypuscily mlotow z dloni!\n" +
            "I tylko inny plynie czas - i tylko mlot inaczej dzwoni...\n" +
            "I dzwoni w przod! I dzwoni wspak! I wzwyz za kazdym grzmi nawrotem!\n" +
            "I nie wiedziala slepa noc, kto tu jest cieniem, a kto mlotem?\n" +
            "\"O, predzej skruszmy zimny glaz, nim smierc Dziewczyne rdza powlecze!\" -\n" +
            "Tak, walac w mur, dwunasty cien do jedenastu innych rzecze.\n" +
            "Lecz cieniom zbraklo nagle sil, a cien sie mrokom nie opiera!\n" +
            "I powymarly jeszcze raz, bo nigdy dosc sie nie umiera...\n" +
            "I nigdy dosc, i nigdy tak, jak pragnie tego ow, co kona!...\n" +
            "I znikla tresc - i zginal slad - i powiesc o nich juz skonczona!\n" +
            "Lecz dzielne mloty - Boze moj - mdlej nie poddaly sie zalobie!\n" +
            "I same przez sie bily w mur, huczaly spizem same w sobie!\n" +
            "Huczaly w mrok, huczaly w blask i ociekaly ludzkim potem!\n" +
            "I nie wiedziala slepa noc, czym bywa mlot, gdy nie jest mlotem?\n" +
            "\"O, predzej skruszmy zimny glaz, nim smierc Dziewczyne rdza powlecze!\" -\n" +
            "Tak, walac w mur, dwunasty mlot do jedenastu innych rzecze.\n" +
            "I runal mur, tysiacem ech wstrzasajac wzgorza i doliny!\n" +
            "Lecz poza murem - nic i nic! Ni zywej duszy, ni Dziewczyny!\n" +
            "Niczyich oczu ani ust! I niczyjego w kwiatach losu!\n" +
            "Bo to byl glos i tylko - glos, i nic nie bylo oprocz glosu!\n" +
            "Nic - tylko placz i zal i mrok i niewiadomosc i zatrata!\n" +
            "Takiz to swiat! Niedobry swiat! Czemuz innego nie ma swiata?\n" +
            "Wobec klamliwych jawnie snow, wobec zmarnialych w nicosc cudow,\n" +
            "Potezne mloty legly w rzad, na znak spelnionych godnie trudow.\n" +
            "I byla zgroza naglych cisz. I byla proznia w calym niebie!\n" +
            "A ty z tej prozni czemu drwisz, kiedy ta proznia nie drwi z ciebie?";

    
    public static void main(String[] args) {
        HashMap<String, LinkedList<String>> wordBegins = new HashMap<>();  
        AssignAnalyzysOfPoemToHashMap(wordBegins);  
        printWordBegins(listOfWordsWhichLetterIsMostUsed(wordBegins));
    }
    
    /** This method checks which letters is most used and return list of words which are starting with this letter. */
    private static LinkedList<String> listOfWordsWhichLetterIsMostUsed(HashMap<String, LinkedList<String>> hashMapToCheck) {
    	
    	LinkedList<String> listOfWords = hashMapToCheck.get("A"); //List of words which letter is most used
    	for(String name : hashMapToCheck.keySet()) {              //initialized by using key "A" 
    		  LinkedList<String> listToCheck = hashMapToCheck.get(name);
    		  	if(listOfWords.size()<listToCheck.size()) {
    		  		listOfWords=listToCheck;
    		  	}
			}
    	return listOfWords;	  
    }
    
    
    private static final String[] SplittedLyric=getWordsInLyrics(); //splitting string into string[]
    
    /** This method assigns HashMap keys and values alphabetically 
     * ASSUMPTION: without distinction of large and small letters */
    private static HashMap<String, LinkedList<String>> AssignAnalyzysOfPoemToHashMap(HashMap<String, LinkedList<String>> hashMap) { 
        for( char c = 'A'; c <= 'Z'; c++ ) { 	
        	hashMap.put(c+"", getLinkedListStartingWithChar(c)); 									      												
        }
        return hashMap;
    }
    
    /** This method creates LinkedList of words which starts with typed argument char */
    private static LinkedList<String> getLinkedListStartingWithChar(char c){
    	LinkedList<String> myLinkedList = new LinkedList<>(); 
   	for (String word : SplittedLyric) {
			if(word.startsWith(c+"")	||	word.startsWith((c+"").toLowerCase())) { 
				myLinkedList.add(word);
			}
		}
    	return myLinkedList;
    }
    
    private static String[] getWordsInLyrics() {
        return LYRICS.split("\\W+");
    }
    
    /** This method prints all words in LinkedList typed in argument */
    private static void printWordBegins(LinkedList<String> linkedListToPrint) {
    	
        for (String word: linkedListToPrint) {
			System.out.println(word);
		}
    	
    }
     
}