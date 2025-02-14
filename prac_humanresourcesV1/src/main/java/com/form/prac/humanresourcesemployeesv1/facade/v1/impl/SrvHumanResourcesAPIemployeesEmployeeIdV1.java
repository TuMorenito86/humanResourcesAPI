package com.form.prac.humanresourcesemployeesv1.facade.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesDeleteEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.facade.v1.ISrvHumanResourcesAPIemployeesEmployeeIdV1;

@RestController
@RequestMapping("/human-resources/v1/employees/{employee-id}")
public class SrvHumanResourcesAPIemployeesEmployeeIdV1 implements ISrvHumanResourcesAPIemployeesEmployeeIdV1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(SrvHumanResourcesAPIemployeesEmployeeIdV1.class);

	@Autowired
	private IHumanResourcesDeleteEmployeeV1Business humanResourcesDeleteEmployeeV1Business;
	
	@Override
	@DeleteMapping
	public ResponseEntity<Void> humanResourcesDeleteEmployeeV1(@PathVariable(name = "employee-id", required = true) Long employeeId) {
		LOGGER.info("humanResourcesCreateEmployeesV1 - in {}",employeeId );
		humanResourcesDeleteEmployeeV1Business.humanResourcesEmployeesDeleteEmployeeV1(employeeId);
		LOGGER.info("humanResourcesCreateEmployeesV1 - out");
		return new ResponseEntity<>(HttpStatusCode.valueOf(204));
	}
}
