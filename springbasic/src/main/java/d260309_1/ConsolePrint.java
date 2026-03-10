package d260309_1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsolePrint implements Print {
	private Person person;

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("이름 :"+person.getName());
		System.out.println("주민번호 :"+person.getId());
		System.out.println("주소 :"+person.getAddress());
	}
	
}
