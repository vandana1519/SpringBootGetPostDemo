package com.appliance.service;

import java.util.List;

import com.appliance.model.ApplianceInfoModel;

public interface ApplianceService {
	
	/**
	 * Returns list of appliances available in the database.
	 * 
	 * @return List<ApplianceInfoModel>
	 */
	List<ApplianceInfoModel> getAllAppliances();
	
	/**
	 * Insert the given appliance information into the database.
	 * 
	 * @param entity
	 * @return ApplianceInfoModel
	 */
	ApplianceInfoModel insertAppliance(ApplianceInfoModel entity);

}
