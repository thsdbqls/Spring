package d260309;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// print라는 인터페이스를 이용하여 내용을 출력하는 처리
		// 출력한 관한 사항은 setting.xml파일에 bean으로 작성하여 처리
		// bean==객체 생성, bean속성 중 id==변수명
		// 최종 사용하려는 객체는 인터페이스를 이용하여 처리할 것임(*****)
		ApplicationContext app
		= new ClassPathXmlApplicationContext("d260309/setting.xml");
		Print p = (Print) app.getBean("consoleprint");
		Print gp = (Print) app.getBean("gridprint");
		p.print();
		gp.print();
}
}
