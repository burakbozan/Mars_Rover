package rover.exception;

public class CommandInitializationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommandInitializationException() {
		super();
	}

	public CommandInitializationException(final String message) {
		super(message);
	}

	public CommandInitializationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public CommandInitializationException(final Throwable cause) {
		super(cause);
	}

}
