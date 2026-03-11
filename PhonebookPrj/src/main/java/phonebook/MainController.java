package phonebook;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

@org.springframework.stereotype.Controller
@RequestMapping
public class MainController  {

	@RequestMapping("")
	public ModelAndView index(RedirectAttributes ra) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","index");
		/*
		Map<String, ?> flashAttributes 
		= ((RedirectAttributesModelMap) ra).getFlashAttributes();
		
		ra.addFlashAttribute("message", flashAttributes.containsKey("message"));
		*/
		//mv.setViewName("/WEB-INF/views/index.jsp");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/index")
	public String index2() {
		return "index2";
	}

}
