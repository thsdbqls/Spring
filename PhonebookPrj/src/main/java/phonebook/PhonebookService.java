package phonebook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhonebookService {
	@Autowired
	PhonebookDAO dao;
	
	public PhonebookService() {
		
	}
	public List<PhonebookVO> getPhonebooks() {
		return dao.findAll();
	}
	
	public boolean insert(int id, String name, String hp, String email, String memo,String pic) {
		PhonebookVO pb=new PhonebookVO(id, name, hp, email, memo, pic);
		int result=dao.save(pb);
		if(result>0) return true;
		else return false;
	}
	public PhonebookVO getPhonebook(int id) {
		return dao.findById(id);
	}

}
