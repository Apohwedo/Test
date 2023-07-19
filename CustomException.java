public class CustomException extends Exception {
    
    private static final long serialVersionUID = -2785204172273166743L;

	/* constructor */
	public CustomException() {
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}
}
