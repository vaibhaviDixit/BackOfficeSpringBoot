package bodhi.technology.backoffice.controller.admhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdmissionController {
/* Below are Test Controllers Modification required  */	
	
	@GetMapping("/admission")
	private String admission(Model model) {
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "adm/admission";
	}
	
	@PostMapping("/admissionProcess")
	private String admissionRegister(Model model) {
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "adm/admission";
	}
	
	
	@GetMapping("/listadmission")
	private String admissionList(Model model) {
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "adm/admissionlist";
	}
	
	@GetMapping("/addcourse")
	private String courseAdd(Model model) {
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "adm/addcours";
	}
	
	@GetMapping("/addinternship")
	private String internshipAdd(Model model) {
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "adm/addinternship";
	}
	
	@GetMapping("/admreport")
	private String admissionReport(Model model) {
		model.addAttribute("cname","Bodhi Technology");
		model.addAttribute("cweb","https://bodhi-tech.web.app");
		return "adm/admittion_report";
	}
}
