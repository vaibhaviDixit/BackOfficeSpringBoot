package bodhi.technology.backoffice.controller.userhandler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bodhi.technology.backoffice.model.usermodel.UserModel;
import bodhi.technology.backoffice.repository.userepo.UserRepository;
import bodhi.technology.backoffice.service.userservice.UserService;

@Controller
public class LoginController {

	@Autowired
 private UserService service;
	
	
	@GetMapping("/")
	public String loginPage(Model model) {
		
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "inout/signin";
	}
	
	
// Write here business logic to check user and redirect to dashboard with user session	
	@PostMapping("/loginProcess")
	public String loginProcess(Model model,HttpSession httpSession) {
		System.out.println(".........................................loginprocess");
	    
		return "dash/dashboard";
	}
}
