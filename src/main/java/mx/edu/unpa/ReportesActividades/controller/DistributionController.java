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

import mx.edu.unpa.ReportesActividades.domain.Distribution;
import mx.edu.unpa.ReportesActividades.repository.DistributionRepository;
import mx.edu.unpa.ReportesActividades.service.DistributionService;


@Controller
public class DistributionController{
	
	
	@Autowired
	private DistributionService distributionService;
	
	
	//OBTENER -> Ejecuta este método para encontrar la vista app.html
	//Responder al navegador
	@GetMapping(path = "/")
	public String index(Model model) {
		
		Distribution cliente = new Distribution();
		
		Iterable<Distribution> distributionList = distributionService.findAll();
		
		//List<Student> studentList = studentRepository.findAll();
		
		model.addAttribute("distribution", distribution);
		model.addAttribute("distributionList", distributionList);
		

		return "app";
	}
	
	@GetMapping("/fnd")
	public String read(Distribution distribution, Model model) {
	    String url = "";

	    if (distribution.getId_distribution() != null) {
	        LinkedList<Distribution> distributionList = new LinkedList<>();
	        try {
	            Optional<Distribution> oDistribution = distributionService.findById(distribution.getId_distribution());
	            distributionList.add(oDistribution.get());
	            model.addAttribute("distributionList", distributionList);
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
	public String add (Distribution distribution) {
		return "add";
	}
	
	@PostMapping("/create")
	public String create (Distribution distribution) {
		distributionService.save(distribution);
		return "redirect:/" ;
	}
	
	// Update an user
	@GetMapping("/upd/{id}")
	public String upd(@PathVariable(value = "id") String distributionId, Model model) {
	    Optional<Distribution> oDistribution = distributionService.findById(distributionId);
	    model.addAttribute("distribution", oDistribution);
	    return "/upd";
	}
	
	@PostMapping("/save")
	public String save(Distribution Distribution) {
	    if (Distribution != null) {
	    	distributionService.save(Distribution);
	    }
	    return "redirect:/";
	}
	
	@GetMapping("/del/{id}")
	public String delete(@PathVariable(value = "id") String distributionId) {
		distributionService.deleteById(distributionId);
		return "redirect:/";
	}
	
	
}