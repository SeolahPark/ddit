package homework.work07.bank;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "이름: " + firstName + " " + lastName + ", 잔고: " + String.format("%,d", this.account.getBalance()) + "원";
	}

}
