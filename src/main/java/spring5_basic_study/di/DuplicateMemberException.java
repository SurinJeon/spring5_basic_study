package spring5_basic_study.di;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException {

	public DuplicateMemberException() {
	}

	public DuplicateMemberException(String message) {
		super(message);
	}

	
}
