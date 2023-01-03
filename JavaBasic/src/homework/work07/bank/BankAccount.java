package homework.work07.bank;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) { // 예금, 저축, 입금
		this.balance += amount;
	}

	public boolean withdraw(int amount) { // 출금
		if (this.balance < amount) // 출금액이 잔액보다 크다면 false 반환.
			return false;
		else { // 아니라면 출금 후 true 반환.
			this.balance -= amount;
			return true;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		boolean isChecked = this.withdraw(amount); // 이체가 여부 확인 후
		if (isChecked) // 성공이라면 다른사람 계좌에 입금하기.
			otherAccount.deposit(amount);
		return isChecked; // 실패라면 false 반환.
	}
	// is...메서드 : boolean타입 (약속)
}
