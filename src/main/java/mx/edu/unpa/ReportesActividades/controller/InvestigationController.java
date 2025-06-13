package mx.edu.unpa.ReportesActividades.controller;

import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.unpa.ReportesActividades.domain.Investigation;
import mx.edu.unpa.ReportesActividades.repository.InvestigationRepository;
import mx.edu.unpa.ReportesActividades.service.InvestigationService;


@Controller
public class InvestigationController{
	
	
	@Autowired
	private InvestigationService investigationService;
	
	
	//OBTENER -> Ejecuta este método para encontrar la vista app.html
	//Responder al navegador
	@GetMapping(path = "/")
	public String index(Model model) {
		
		Investigation investigacion = new Investigation();
		
		Iterable<Investigation> investigationList = investigationService.findAll();
		
		//List<Student> studentList = studentRepository.findAll();
		
		model.addAttribute("investigation", investigation);
		model.addAttribute("investigationList", investigationList);
		

		return "app";
	}
	
	@GetMapping("/fnd")
	public String read(Investigation investigation, Model model) {
	    String url = "";

	    if (investigation.getId_investigation() != null) {
	        LinkedList<Investigation> investigationList = new LinkedList<>();
	        try {
	            Optional<Investigation> oInvestigation = investigationService.findById(investigation.getId_investigation());
	            investigationList.add(oInvestigation.get());
	            model.addAttribute("investigationList", investigationList);
	            url = "/qry.html";
	        } catch (Exception e) {
	            url = "redirect:/";
	        }
	    } else {
	        url = "redirect:/";
	    }
	    return url;
	}
	
	@GetMapping("/add")
	public String add (Investigation investigation) {
		return "add";
	}
	
	@PostMapping("/create")
	public String create (Investigation investigation) {
		investigationService.save(investigation);
		return "redirect:/" ;
	}
	
	// Update an user
	@GetMapping("/upd/{id}")
	public String upd(@PathVariable(value = "id") String investigacionId, Model model) {
	    Optional<Investigation> oInvestigation = investigationService.findById(investigationId);
	    model.addAttribute("investigation", oInvestigation);
	    return "/upd";
	}
	
	@PostMapping("/save")
	public String save(Investigation Investigation) {
	    if (Investigation != null) {
	    	investigationService.save(Investigation);
	    }
	    return "redirect:/";
	}
	
	@GetMapping("/del/{id}")
	public String delete(@PathVariable(value = "id") String investigationId) {
		investigationService.deleteById(investigationId);
		return "redirect:/";
	}
	
	
}