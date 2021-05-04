package spring5_basic_study.di;

/**
 * @author surin
 * insert 되기 전까지는 Member 말고 RegistRequest로 받겠다는 뜻 << 오히려 하나 더 나눈 것
 */
public class RegistRequest {

	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
}
