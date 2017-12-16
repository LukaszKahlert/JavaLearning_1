import java.util.ArrayList;

public class BankAccountBusinessCardDemo {
	public static void main(String[] args) {
		BusinessCard bc1 = new BusinessCard("Szymon", "Gasior");
		BusinessCard bc2 = new BankAccountBusinessCard("Szymon", "Gasior", 22222222, "Gorlice",
				"67 1234 5678 0000 0000 1234 5678");

		bc1.print();
		System.out.println();
		bc2.print();
	}

}

class BankAccountBusinessCard extends BusinessCard {

	private String bankAccount;

	public String getBankAccount() {
		return bankAccount;
	}

	public void setName(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public BankAccountBusinessCard(String name, String surname, int phone, String city, String bankAccount) {
		super(name, surname, phone, city);
		this.bankAccount = bankAccount;
	}

	public BankAccountBusinessCard(String name, String surname, String bankAccount) {
		super(name, surname);
		this.bankAccount = bankAccount;
	}

	protected ArrayList<String> getLines() {
		ArrayList<String> lines = super.getLines();
		lines.add(bankAccount);
		return lines;
	}

}
