package d260309_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	ApplicationContext app = 
			new ClassPathXmlApplicationContext("d260309_1/setting.xml");
	Print p = (Print) app.getBean("getconsoleprint");  // 가져올 이름을 입력
	
	p.print();
}
}