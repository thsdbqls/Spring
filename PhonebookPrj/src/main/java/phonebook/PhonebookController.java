package phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/phonebook/")
public class PhonebookController {
	
	@Autowired
	PhonebookService service;
	
	// 입력폼 /phonebook/insertform
	@RequestMapping("insertform")
	public String insertform() {
		return "insertform";
	}
	// 입력 처리   /phonebook/insert
	// 입력 처리 후 페이지에 전달할 값이 있는지 여부를 확인해야한다
	// (성공 또는 실패 메시지가 있다고 가정하면 ModelAndView를 사용해야한다)
	// (성공 또는 실패 메시지가 없다라고 가정할 경우 String을 사용한다)
	@RequestMapping("insert")
	public String insert(PhonebookVO pb, RedirectAttributes ra) {
		System.out.println(pb);
		ra.addFlashAttribute("message","success");  // 이것은 1번만 전달하는 명령이다.
		return "redirect:/index";
		//return "redirect:/";
	}
	
	// 전체 출력
	
	// 선택 출력
	
	// 수정폼
	
	// 삭제
}
