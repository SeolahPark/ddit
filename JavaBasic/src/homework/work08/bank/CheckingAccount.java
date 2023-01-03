package homework.work08.bank;

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
			int tmp = amount - balance;
			balance = 0;
			protectedBy.balance -= tmp;
		}
		return true;
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}

}
