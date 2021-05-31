

package firstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginCheck logCheck;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginMsg() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomemsg(@RequestParam String name, @RequestParam String password, ModelMap modal) {
		if(!logCheck.isValid(name, password)) {
			return "login";
		}
		modal.addAttribute("name", name);
		modal.addAttribute("password", password);
		System.out.println("Loading in POST");
		return "welcome";		
	}
}