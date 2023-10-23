package bodhi.technology.backoffice.controller.userhandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bodhi.technology.backoffice.model.usermodel.RoleModel;
import bodhi.technology.backoffice.model.usermodel.UserModel;
import bodhi.technology.backoffice.service.userservice.UserService;

@Controller
@RequestMapping("/admin")
public class UserController {
/* Below are Test Controllers Modification required  */		
	
	@GetMapping("/profile")
	private String profile() {
		
		return "dash/profile";
	}
	
}
