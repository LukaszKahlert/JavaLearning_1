
import java.util.Scanner;


public class Srednia{

public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Podaj liczbe ocen:");
	
	int numbersOfGrades = scanner.nextInt();
	
	int[] grades = new int[numbersOfGrades];
	
	for(int i=0; i<grades.length; i++)
	{
		int actualGrade= i+1;
		System.out.println("Podaj ocene nr "+ actualGrade+":");
		grades[i]= scanner.nextInt();
	}
	
	System.out.println("Srednia wynosi: " +average(grades));
	System.out.println("Najwy¿sza ocena to: " +maxGrade(grades));
}


public static double average(int[] marks) {
    int sum = 0;

    for(int i=0; i<marks.length; i++) {
        sum += marks[i];
    }

    return sum/(double)marks.length;
}

public static int maxGrade(int[] marks) {
	
	int max = marks[0];
	for (int i = 1; i < marks.length; i++) {
		if (marks[i]> max) {
			max= marks[i];
		}
	}
	return max;
}

}