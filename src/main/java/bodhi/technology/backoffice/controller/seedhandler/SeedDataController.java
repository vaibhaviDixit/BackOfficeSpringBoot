package bodhi.technology.backoffice.controller.seedhandler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bodhi.technology.backoffice.service.userservice.UserService;

@Controller
public class SeedDataController {
	
	@Autowired
	 private UserService service;
	
	@GetMapping("/seeduser")
	private String createUser() {
		service.createRoles();
		System.out.println("Roles Created ");
		service.createDefaultUser();
		System.out.println("User Created");
		return "seed/seeddata";
	}
	
}
