package spring5_basic_study.config;

import org.springframework.context.annotation.Bean;

import spring5_basic_study.di.MemberDao;
import spring5_basic_study.di.MemberPrinter;

public class AppConf1 {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
