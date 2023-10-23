package bodhi.technology.backoffice.controller.emphandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("admin")
public class EmployeeController {

/* Below are Test Controllers Modification required */	
	
	@GetMapping("/empenroll")
	private String enrollEmployee() {
		
		return "emp/enrollemp";
	}
	
	@GetMapping("/listemployee")
	private String employeeList() {
		
		return "emp/emplist";
	}
}
