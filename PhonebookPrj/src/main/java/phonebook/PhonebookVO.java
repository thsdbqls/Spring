package phonebook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PhonebookVO {
	private int id;
	private String name;
	private String hp;
	private String email;
	private String memo;
	private String pic;
	

}
