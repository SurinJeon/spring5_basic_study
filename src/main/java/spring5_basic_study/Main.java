package spring5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class)){ // parameter로 설정파일 넘겨줌
			Greeter g = ctx.getBean("greeter", Greeter.class);
			Greeter g2 = ctx.getBean("greeter", Greeter.class);
			
			// 비교용
			Greeter g3 = new Greeter();
			Greeter g4 = new Greeter();
			
			System.out.printf("%s%n", g==g2); // ==를 통해 주소값 비교해서 같음을 확인
			System.out.printf("%s%n", g3==g4);
			
			String msg = g.greet("Spring5");
			
			System.out.println(msg);
		}
	}
}
