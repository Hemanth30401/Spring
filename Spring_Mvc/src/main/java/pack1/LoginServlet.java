package pack1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginServlet 
{
	@RequestMapping(path="/LoginServlet",method=RequestMethod.GET)
	public String getLogin(@RequestParam("userName")String userName,
			@RequestParam("password")String password,Model model) {
		model.addAttribute("userName",userName);
		model.addAttribute("password",password);
		return "Home";
	}
}
