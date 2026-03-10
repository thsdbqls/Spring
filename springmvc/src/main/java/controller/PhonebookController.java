package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/phonebook")
public class PhonebookController {

	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","welcom to phonebook mvc");
		//mv.setViewName("WEB-INF/views/index.jsp");
		mv.setViewName("index");
		 return mv;
	}
	
	@RequestMapping("insertform")
	public ModelAndView insertform() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","insert form 처리");
		//mv.setViewName("WEB-INF/views/index.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("insert")
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","insert 처리");
		//mv.setViewName("WEB-INF/views/index.jsp");
				mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("views")
	public ModelAndView views() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","전체리스트 처리");
		//mv.setViewName("WEB-INF/views/index.jsp");
				mv.setViewName("index");
		return mv;
	}
	
	//http://localhost:8888/phonebook/view?id=100
	@RequestMapping("view")
	public ModelAndView view(int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message",id+"번째 view 처리");
		//mv.setViewName("WEB-INF/views/index.jsp");
				mv.setViewName("index");
		return mv;
	}
}
