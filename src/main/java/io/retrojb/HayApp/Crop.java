package io.retrojb.HayApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Crop {

	@Id
	@GeneratedValue

	private Long cropId;
	private String cropName;
	private String cropType;
	private boolean delivery;
	
	@ManyToOne
	@JsonIgnore
	private Farmer farmer;
	
	public Crop() {
	}

	public Crop(String cropName, String cropType, boolean delivery) {
		this.cropName = cropName;
		this.cropType = cropType;
		this.delivery = delivery;

	}

	public Crop(String cropName, String cropType, boolean delivery, Farmer farmer) {
		this.cropName = cropName;
		this.cropType = cropType;
		this.delivery = delivery;
		this.farmer = farmer;
	}

	public Long getId() {
		return cropId;
	}

	public String getCropName() {
		return cropName;
	}

	public String getCropType() {
		return cropType;
	}

	public boolean isDelivery() {
		return delivery;
	}
	
	public Farmer getFarmer() {
		return farmer;
	}

}
