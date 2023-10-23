package bodhi.technology.backoffice.controller.projecthandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("admin")
public class ProjectController {

/* Below are Test Controllers Modification required */	
	
	@GetMapping("/projects")
	private String assignProject() {
		
		return "project/projects";
	}
	
	@GetMapping("/projectlist")
	private String projectList() {
		
		return "project/projectlist";
	}
	
}
