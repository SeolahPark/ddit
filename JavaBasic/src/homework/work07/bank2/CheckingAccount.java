package homework.work07.bank2;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) {
			protectedBy.withdraw(amount - this.balance);
			this.balance = 0;
		} else
			this.balance -= amount;
		return true;
	}

}
