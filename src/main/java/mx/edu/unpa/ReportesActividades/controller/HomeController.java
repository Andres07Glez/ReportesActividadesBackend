package mx.edu.unpa.ReportesActividades.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
	@GetMapping("/")
	public String index() {
		
		return "prueba";
	}
	
}

/*@Controller
public class HomeController {
	@GetMapping(path = "/")
	public String index(Model model) {
		model.addAttribute("mensaje");
		
		return "app";
	}
	

}*/
