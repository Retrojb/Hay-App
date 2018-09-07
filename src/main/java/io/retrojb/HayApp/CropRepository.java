package io.retrojb.HayApp;

import org.springframework.data.repository.CrudRepository;

public interface CropRepository extends CrudRepository<Crop, Long> {

	Crop findByCropName(String cropName);

}
