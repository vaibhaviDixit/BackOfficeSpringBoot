package bodhi.technology.backoffice.controller.dashhandler;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bodhi.technology.backoffice.model.usermodel.UserModel;
import bodhi.technology.backoffice.repository.userepo.UserRepository;

@Controller
@RequestMapping("/admin")
public class DashboardController {
	
/* Below are Test Controllers Modification required */	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/dashboard")
	private String dashboardController(Model model,Principal principal) {
		
//		UserModel user=userRepo.findByEmail(principal.getName());
//		model.addAttribute("user", user);
	
		
		return "dash/dashboard";
	}

}
