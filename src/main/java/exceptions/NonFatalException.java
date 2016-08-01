package exceptions;

public class NonFatalException extends Exception{
	private static final long serialVersionUID = 1L;

	public NonFatalException() {
		super();
	}

	public NonFatalException(String message) {
		super(message);
	}

	public NonFatalException(String message, Throwable thrw) {
		super(message, thrw);
	}

}
