package e_oop;

public class Calculator {

	public long addition(long a, long b) {
		return a + b;
	}

	public long subtraction(long a, long b) {
		return a - b;
	}

	public long multiplication(long a, long b) {
		return a * b;
	}

	public long division(long a, long b) {
		return a / b;
	}

	public long remainder(long a, long b) {
		return a % b;
	}

//----------------------------------------------
	long a = 123456;
	long b = 654321;
	long result = 0;

	public void _addition() {
		result = this.a + this.b;
		System.out.println(this.result);
	}

	public void _multiplication() {
		result = this.result * this.a;
		System.out.println(this.result);
	}

	public void _division() {
		result = this.result / this.a;
		System.out.println(this.result);
	}

	public void _subtraction() {
		result = this.result - this.b;
		System.out.println(this.result);
	}

	public void _remainder() {
		result = this.result % this.a;
		System.out.println(this.result);
	}
}
//1. 123456 + 654321
//2. 1번의 결과값 * 123456
//3. 2번의 결과값 / 123456
//4. 3번의 결과값 - 654321
//5. 4번의 결과값 % 123456