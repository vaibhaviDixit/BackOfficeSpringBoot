package bodhi.technology.backoffice.controller.quothandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/admin")
public class QuotController {
/* Below are Test Controllers Modification required */	
	
	@GetMapping("/quotgenerate")
	private String genQuotation() {
		
		return "quotation/quotcreate";
	}
	
	@GetMapping("/quotationlist")
	private String quotationList() {
		
		return "quotation/quotlist";
	}
}
