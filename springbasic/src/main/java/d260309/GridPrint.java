package d260309;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GridPrint implements Print {
	private Person p;

	public void print() {
		System.out.println("+-----------------------------------------------+");
		System.out.println("|  이름  |      주민등록번호      |         주소         |");
		System.out.println("+-----------------------------------------------+");
		System.out.println("| "+p.getName() +"  |  "+p.getId()+"   |       "+p.getAddress()+"     |");
		System.out.println("+-----------------------------------------------+");
	}	
}
