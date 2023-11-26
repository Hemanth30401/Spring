package pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller 
{
	@RequestMapping("India")
	public ModelAndView t1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("India");
		return mv;
	}
	@RequestMapping("Pak")
	public String t2() {
		return "Pak";
	}
	@RequestMapping("Nz")
	public String t3() {
		return "Nz";
	}
	@RequestMapping("Aus")
	public String t4() {
		return "Aus";
	}
	@RequestMapping("/reg")
	public String RegForm() {
		return "reg";
	}
	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}
	
}
