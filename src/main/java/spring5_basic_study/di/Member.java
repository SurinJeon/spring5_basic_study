package spring5_basic_study.di;

import java.time.LocalDateTime;

public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;

	public Member(String email, String password, String name, LocalDateTime registerDateTime) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (!password.equals(oldPassword)) { // 같지 않더라면 아래 예외를 던짐
			throw new WrongIdPasswordException();
		}
		this.password = newPassword; // 같다면, 비번 변경 줄로 내려올 수 있음
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}

	@Override
	public String toString() {
		return String.format("Member [id=%s, email=%s, password=%s, name=%s]", id, email, password,
				name);
	}

}
