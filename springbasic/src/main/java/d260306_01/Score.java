package d260306_01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor 
public class Score {
private int kor;
private int eng;
private int math;

//score를 입력하는 방법은 기본 생성자, 필드생성자, set함수로 설정이 가능하다

}
