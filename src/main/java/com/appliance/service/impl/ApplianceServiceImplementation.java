package com.appliance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appliance.model.ApplianceInfoModel;
import com.appliance.repository.ApplianceRepository;
import com.appliance.service.ApplianceService;

@Service
public class ApplianceServiceImplementation implements ApplianceService {

	@Autowired
	private ApplianceRepository repository;

	public List<ApplianceInfoModel> getAllAppliances() {
		
		// Finding the appliances information available in the database
		List<ApplianceInfoModel> applianceList = repository.findAll();

		// Checking if the appliance List is empty
		// If true, then return empty ArrayList Else return list of appliances
		if (applianceList.isEmpty()) {
			return new ArrayList<>();
		} else {
			return applianceList;
		}
	}

	public ApplianceInfoModel insertAppliance(ApplianceInfoModel entity) {
		
		// Saving the appliance information which is provided into the database
			entity = repository.save(entity);
			return entity;
		}

}
