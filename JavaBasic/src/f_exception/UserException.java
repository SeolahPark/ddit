package f_exception;

public class UserException extends Exception {

	@Override
	public void printStackTrace() {
		System.err.println("UserException 발생.");
	}
}
