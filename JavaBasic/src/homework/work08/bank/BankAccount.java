package homework.work08.bank;

public abstract class BankAccount {
	protected int balance;

	public abstract String getAccountType();

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public boolean withdraw(int amount) {
		if (this.balance < amount) // 출금액이 잔액보다 크다면 false 반환.
			return false;
		else { // 아니라면 출금 후 true 반환.
			this.balance -= amount;
			return true;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		boolean check = this.withdraw(amount); // 이체가 여부 확인 후
		if (check) // 성공이라면 다른사람 계좌에 입금하기.
			otherAccount.deposit(amount);
		return check; // 실패라면 false 반환.
	}

	@Override
	public String toString() {
		return String.format("잔액: %,d", balance);
	}

}
