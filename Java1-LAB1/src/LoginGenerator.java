public class LoginGenerator {

	public static void main(String[] args) {

		String[] studentNames = { "Budynek Piotr", "Chalupa Krystyna", "Wiezowiec Jan", "Szkieletor Andrzej",
				"Domek Marianna" };

		printMails(MailGenerator(studentNames, "@student.agh.edu.pl"));
	}

	public static String[] MailGenerator(String[] students, String domain) {

		for (int i = 0; i < students.length; i++) {
			String[] login;
			login = students[i].split(" ");
			students[i] = (login[1].substring(0, 3) + login[0].substring(0, 2) + domain).toLowerCase();
		}

		return students;

	}

	public static void printMails(String[] studentNames) {

		for (String studentName : studentNames) {
			System.out.println(studentName);
		}

	}

}
