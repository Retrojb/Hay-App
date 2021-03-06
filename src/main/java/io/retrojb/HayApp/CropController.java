package io.retrojb.HayApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CropController {
	@Autowired
	CropRepository cropRepo;
	
	@Autowired
	FarmerRepository farmerRepo;
	
	@RequestMapping("/index/cropList")
	public String getAllCrops(Model model) {
		model.addAttribute("crops", cropRepo.findAll());
		return "cropList";
	}
	
	@RequestMapping("/index/cropList/cropDetail/{cropId}")
	public String getOneCropFromList(@PathVariable(name="cropId") Long cropId, Model model) {
		model.addAttribute("crop", cropRepo.findOne(cropId));
		return "cropDetail";
	}
	
	
	@RequestMapping("/index/{farmerUserName}/crops/{cropId}")
	public String getCrop(@PathVariable (name = "farmerUserName") String farmerUserName, 
						@PathVariable (name = "cropId") Long cropId,
									Model model) {
		model.addAttribute("farmer", farmerRepo.findByFarmerUserName(farmerUserName));
		model.addAttribute("crop", cropRepo.findOne(cropId));
		return "crop";
	}

}
