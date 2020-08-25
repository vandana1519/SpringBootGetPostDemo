package com.appliance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appliance.model.ApplianceInfoModel;
import com.appliance.service.ApplianceService;

@RestController
@RequestMapping(value = "/appliances")
public class ApplianceController {

	@Autowired
	ApplianceService applianceService;

	/**
	 * This API gets called when user wants to fetch the list of all appliances
	 * present in the database.
	 *
	 * @return List<ApplianceInfoModel>
	 */

	@GetMapping
	public ResponseEntity<List<ApplianceInfoModel>> getAllAppliances() {

		// Invoking service layer for getting list of appliances from the database
		List<ApplianceInfoModel> applianceInfolist = applianceService.getAllAppliances();
		return new ResponseEntity<>(applianceInfolist, new HttpHeaders(), HttpStatus.OK);
	}

	/**
	 * This API gets called when user insert an appliance into the database.
	 * 
	 * @param appliance
	 * @return ApplianceInfoModel
	 */

	@PostMapping(value = "/insert")
	public ResponseEntity<ApplianceInfoModel> insertAppliance(@RequestBody ApplianceInfoModel applianceInfo) {

		// Invoking service layer for inserting an appliance information in the database by passing
		// appliance object as a parameter
		ApplianceInfoModel applianceDetails = applianceService.insertAppliance(applianceInfo);
		return new ResponseEntity<>(applianceDetails, new HttpHeaders(), HttpStatus.OK);
	}

}
