package d260306;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.flogger.Flogger;

@NoArgsConstructor  // 입력값이 없는 생성자
@AllArgsConstructor  // 입력값이 있는 생성자
@Getter
@Setter
@ToString
public class Email {
	private String recvEmail;
	private String sendEmail;
	private String title;
	private String body;
}
