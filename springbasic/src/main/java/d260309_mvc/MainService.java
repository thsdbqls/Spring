package d260309_mvc;

import java.sql.Connection;

import lombok.Setter;

@Setter
public class MainService {
	
	MainDAO dao;
	
	public void index() {
		dao.index();
		System.out.println("Service를 실행");
	}

}
