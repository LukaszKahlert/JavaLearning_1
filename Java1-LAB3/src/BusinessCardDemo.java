import java.util.ArrayList;

public class BusinessCardDemo {
	public static void main(String[] args) {
		BusinessCard businessCard = new BusinessCard("Szymon", "Gasior", 22222222, "Gorlice");
		BusinessCard businessCard2 = new BusinessCard("Szymon", "Gasior");

		businessCard.print();
		System.out.println();
		businessCard2.print();
		businessCard.setName("Piotr");
		System.out.println("\n " + businessCard.getName());
	}
}

class BusinessCard {

	private String name;
	private String surname;
	private int phone;
	private String city;

	public BusinessCard(String name, String surname, int phone, String city) {
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.city = city;
	}

	public BusinessCard(String name, String surname) {
		this.name = name;
		this.surname = surname;
		phone = 123456789;
		city = "Kraków";
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPhone() {
		return phone;
	}

	public String getCity() {
		return city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void print() {
		ArrayList<String> lines = getLines();

		int maxLength = getMaxLength(lines);

		String starsLine = "";
		for (int i = 0; i < maxLength + 2; i++) {
			starsLine += "*";
		}

		System.out.println(starsLine);

		for (String line : lines) {
			int lengthDiff = maxLength - line.length();

			for (int i = 0; i < lengthDiff; i++) {
				line += " ";
			}

			line = "*" + line + "*";

			System.out.println(line);
		}

		System.out.println(starsLine);
	}

	private int getMaxLength(ArrayList<String> lines) {
		int maxLength = 0;

		for (String line : lines) {
			int lineLength = line.length();

			if (lineLength > maxLength) {
				maxLength = lineLength;
			}
		}

		return maxLength;
	}

	protected ArrayList<String> getLines() {
		ArrayList<String> lines = new ArrayList<>();

		lines.add(getName() + " " + getSurname());
		lines.add("tel. " + getPhone() + " adres: " + getCity());

		return lines;
	}
}