package bodhi.technology.backoffice.controller.billhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/admin")
public class BillController {

/* Below are Test Controllers Modification required */	
	
	@GetMapping("/billgenerate")
	private String genBill() {
		
		return "billgen/billcreate";
	}
	
	@GetMapping("/billlist")
	private String quotationList() {
		
		return "billgen/billlist";
	}
}
