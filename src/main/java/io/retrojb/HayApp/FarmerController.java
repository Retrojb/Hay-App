package io.retrojb.HayApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FarmerController {
	@Autowired
	FarmerRepository farmerRepo;
	
	@Autowired
	CropRepository cropRepo;
	
	@RequestMapping("/")
	public String landingPage(Model model) {
		return "redirect:/index";
	}
	
	@RequestMapping("/home")
	public String getHome(Model model) {
		return "home";
	}
	
	@RequestMapping("/index")
	public String getIndex(Model model) {
	model.addAttribute("farmers", farmerRepo.findAll());
		return "index";
	}
	
	@RequestMapping("/index/{farmerUserName}")
	public String getFarmer(@PathVariable (name = "farmerUserName")String farmerUserName,
							Model model) {
		model.addAttribute("farmer", farmerRepo.findByFarmerUserName(farmerUserName));
		return "farmer";
	}
	
	
	@RequestMapping("/farmerLogin")
	public String getFarmerLogin(Model model) {
//	model.addAttribute("farmerLogin", farmerRepo.findAll());
		return "farmerLogin";
	}
	@RequestMapping("/buyerLogin")
	public String getBuyerLogin(Model model) {
//	model.addAttribute("buyerLogin", farmerRepo.findAll());
		return "buyerLogin";
	}
	
}
