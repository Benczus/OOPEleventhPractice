package exceptionTest;

public class IntegerNotPrimeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerNotPrimeException() {
		super("Integer is not a prime!");
		// TODO Auto-generated constructor stub
	}

	public IntegerNotPrimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
