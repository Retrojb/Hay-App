package io.retrojb.HayApp;

import org.springframework.data.repository.CrudRepository;

public interface FarmerRepository extends CrudRepository<Farmer, Long> {

	Farmer findByFarmerUserName(String farmerUserName);

}
