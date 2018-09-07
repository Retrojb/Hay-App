package io.retrojb.HayApp;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Farmer {
	
	@Id
	@GeneratedValue
	private Long farmerId;
	private String farmerUserName;
	private String password;
	private String farmName;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private String phoneNumber;
	
	@OneToMany (mappedBy = "farmer")
	private Collection<Crop> crops;
	
	
	public Farmer () {
		
	}
	
	public Farmer(String farmerUserName, String farmName, Crop... crops) {
		this.farmerUserName = farmerUserName;
		this.farmName = farmName;
		this.crops = Arrays.asList(crops);
	}

	public Farmer(String farmerUserName, String password, String farmName, String firstName, String lastName, String address, String city,
			String state, int zipCode, String phoneNumber, Crop... crops) {
		this.farmerUserName = farmerUserName;
		this.password = password;
		this.farmName = farmName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.crops = Arrays.asList(crops);
	}
	
	
	public Long getId() {
		return farmerId;
	}

	public String getFarmerUserName() {
		return farmerUserName;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getFarmName() {
		return farmName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public Collection<Crop> getCrops(){
		return crops;
	}
	
	
	public String toString() {
		return farmerUserName;
	}

}
