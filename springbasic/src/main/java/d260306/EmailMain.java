package d260306;

public class EmailMain {

	public static void main(String[] args) {
		Email email=new Email();
		email.setTitle("제목입니다");
		email.setBody("내용입니다");
		System.out.println(email.toString());
	}

}
