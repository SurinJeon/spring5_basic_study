package spring5_basic_study.di;

import org.springframework.stereotype.Component;

@Component
public class MemberPrinter {

	public void print(Member member) {
		System.out.printf("회원정보: 아이디 >> %s, 이메일 >> %s, 이름 >> %s, 등록일 >> %tF%n"
				, member.getId(), member.getEmail(), member.getName(), member.getRegisterDateTime());
	}
}
