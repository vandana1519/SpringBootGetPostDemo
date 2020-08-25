package com.appliance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testspring")
public class ApplianceInfoModel {

	@Id
	@GeneratedValue
	@Column(name = "Appliance_Id")
	private Long applianceId;

	@Column(name = "Model_Number")
	private String modelNumber;
	
	@Column(name = "Serial_Number")
	private String serialNumber;
	
	@Column(name = "Brand")
	private String brand;
	
	@Column(name = "Categoy")
	private String category;

	/* Getters Setters */

	public String getModelNumber() {
		return modelNumber;
	}

	public Long getApplianceId() {
		return applianceId;
	}

	public void setApplianceId(Long applianceId) {
		this.applianceId = applianceId;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
    public String toString() {
        return "ApplianceInfoModel [Appliance Id =" + applianceId + ", Model_Number=" + modelNumber + 
                ", Serial_Number=" + serialNumber + ", Brand=" + brand + " , Category=" + category + "]";
    }

}
