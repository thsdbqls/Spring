package d260309_mvc;

import java.sql.Connection;

import lombok.Setter;

@Setter
public class MainController {
	
	MainService service;
	
	public void index() {
		service.index();
		System.out.println("홈페이지에 오신것을 환영합니다.");
	}

	
}
