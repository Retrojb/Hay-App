package io.retrojb.HayApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class FarmerController {
	@Autowired
	FarmerRepository farmerRepo;
	
	@Autowired
	CropRepository cropRepo;
	
	@RequestMapping("/")
	public String home(Model model) {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String getIndex(Model model) {
		model.addAttribute("farmer", farmerRepo.findAll());
		return "index";
	}
	
}
