package d260309;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsolePrint implements Print {

	Person person;

	public void print() {
		System.out.println("주민등록번호:"+person.getId());
		System.out.println("이름:"+person.getName());
		System.out.println("주소:"+person.getAddress());
	}
	
}
