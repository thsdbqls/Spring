package d260306_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// xml 파일을 로드해야 한다
		ApplicationContext app 
		= new ClassPathXmlApplicationContext("d260306_02/setting.xml");
		// 클래스에 대한 경로를 xml의 애플리케이션의 흐름(맹락)
		// 애플리케이션의 흐름을 xml에 대한 클래스의 경로를 넣어준다(사용할 경로를 넣어준다) 
		
		// 최종적으로 사용하려는 객체는 Student 객체를 사용하려고 한다
		Student s=(Student)app.getBean("student");  // 강제 형 변화를 하여 사용할 bean을 선택한다
		System.out.println(s);
		
	}
}
