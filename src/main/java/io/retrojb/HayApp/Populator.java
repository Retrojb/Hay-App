package io.retrojb.HayApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

//@Service
public class Populator implements CommandLineRunner{

		@Autowired
		FarmerRepository farmerRepo;
		
		@Autowired
		CropRepository cropRepo;

		@Override
		public void run(String... args) throws Exception {
			Farmer farmerJoe = farmerRepo.save(new Farmer("joeDaFarmer", "poop", "Joe", "Famer","Hickory Farm", "222 farmer rd", "Newark", "Ohio", 45603, "888-999-0000"));
			Farmer farmerDick = farmerRepo.save(new Farmer("Dick", "podunck ranch"));

			Crop hay = cropRepo.save(new Crop("Hay", "grass", true, farmerDick));
			Crop straw = cropRepo.save(new Crop("Straw", "grass", false));
//			
		}
		
		
		
	
}
