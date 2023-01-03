package homework.work07.bank2;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] account;
	private int numberOfAccounts;

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return account[index];
	}

	public void addAccount(BankAccount account) {
		this.account[numberOfAccounts] = account;
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return "이름: " + firstName + " " + lastName + ", 계좌의 갯수: " + numberOfAccounts;
	}

}