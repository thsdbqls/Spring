package d260306_02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private int id;
	private String name;
	private Score score;  //Score는 객체이다
	
	//score를 입력하는 방법은 기본 생성자, 필드생성자, set함수로 설정이 가능하다
	// 기본 생성자는 값이 고정이므로 사용이 거의 불가하다
	/*
	public Student() {
		score = new Score(100,90,80);
	}
	*/
	
	// 필드 생성자, set함수로 성적을 셋팅을 해야 한다.
	// 필드 생성자 : 반드시 값이 존재해야 하는 경우에 사용한다
	
	// 셋트 함수 : 반드시 값이 처음부터 존재하지 않아도 되는 경우에 사용한다
}
