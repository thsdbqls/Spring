package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","index 화면");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/insertform")
	public ModelAndView insert(int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message",id+"번째 insert 화면");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insert() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","insert 화면");
		mv.setViewName("index");
		return mv;
	}
	
}
