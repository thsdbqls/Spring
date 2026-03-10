package d260309_mvc;

import java.sql.Connection;

import lombok.Setter;

@Setter
public class MainDAO {

	// conn=DriverManager.getConnection(url, username, password);
	Connection conn;
	public void index() {
		System.out.println("dao 함수를 실행합니다");
		System.out.println(conn);
	}

}
