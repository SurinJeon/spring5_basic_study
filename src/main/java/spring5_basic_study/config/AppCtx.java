package spring5_basic_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_basic_study.di.ChangePasswordService;
import spring5_basic_study.di.MemberDao;
import spring5_basic_study.di.MemberListService;
import spring5_basic_study.di.MemberRegisterService;

@Configuration
public class AppCtx { // Assembler와 다른건 여기서는 Composite 관계임

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	
	@Bean
	public MemberListService memberLstSvc() {
		MemberListService listSvc = new MemberListService();
		listSvc.setMemberDao(memberDao());
		return listSvc;
	}
}
