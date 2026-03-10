package d260306_01;

public class Main {

	public static void main(String[] args) {
		// DI(Dependency Inject/ 의존삽입)
		// 성적은 반드시 있어야 한다.(가정)
		// 최종적으로 사용하려는 객체는 Student 객체를 사용하려고 한다
		// Student는 Score를 필요로 한다.
		// 처음 생성하는 객체는 Score를 생성하고 Student를 생성한다.
		Score score=new Score(100,90,80);
		Student s = new Student(101,"hong",score);
		//s.setScore(score);  // 이렇게 하면 주입이 되는 것이다
		
		System.out.println(s);
		
	}

}
