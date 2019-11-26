package rover.exception;

public class PlateauInitializationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlateauInitializationException() {
		super();
	}

	public PlateauInitializationException(final String message) {
		super(message);
	}

	public PlateauInitializationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public PlateauInitializationException(final Throwable cause) {
		super(cause);
	}

}
