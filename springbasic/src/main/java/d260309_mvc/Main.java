package d260309_mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	ApplicationContext app = 
			new ClassPathXmlApplicationContext("d260309_mvc/setting.xml");
	MainController controller
	=(MainController)app.getBean("controller");
	
	controller.index();
}
}