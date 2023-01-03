package homework.work07.bank;

public class Bank {
	Customer[] customers;
	int numberOfCustomers;

	public Bank() {
		this.customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers++] = customer;
	}

	public int getNumberOfCustomers() {
		return this.numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return this.customers;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}

}
