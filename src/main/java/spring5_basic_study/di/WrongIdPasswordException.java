package spring5_basic_study.di;

@SuppressWarnings("serial")
public class WrongIdPasswordException extends RuntimeException {

	public WrongIdPasswordException() {
	}

	public WrongIdPasswordException(String message) {
		super(message);
	}

}
