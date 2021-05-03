package spring5_basic_study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정파일이라는 것을 의미함
public class AppContext {
	
	@Bean // Singleton Pattern (여기서 만들어두고 계속 던져주기만 함)
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
}
