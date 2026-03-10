package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FrontController implements Controller {
	
	public FrontController() {
		System.out.println("/index front controller object gen.");
	}

	@Override
	public ModelAndView handleRequest
	(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("/index exec!!");
		// 1) 데이터를 서비스에 요청하고
		// 2) 요청된 서비스를 request.setAttribute에 저장하고 (mv.addObject)
		// 3) 페이지 이동 (mv.setViewName)
		// 1)2)3) ModelAndView에서 모두 들어 있는 형태이다
		
		ModelAndView mv = new ModelAndView();  // model(데이터) view(페이지)
		mv.addObject("message","welcom to spring mvc");  // 데이터를 저장하고
		mv.setViewName("WEB-INF/views/index.jsp");  // 페이지 이동에 해당한다
		
		return mv;
	}
}
