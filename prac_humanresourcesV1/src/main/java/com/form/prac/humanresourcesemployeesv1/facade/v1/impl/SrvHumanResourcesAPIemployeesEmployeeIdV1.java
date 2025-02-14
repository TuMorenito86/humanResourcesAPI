package com.form.prac.humanresourcesemployeesv1.facade.v1.impl;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesGetEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.ISrvHumanResourcesAPIemployeesEmployeeIdV1;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.mappers.GetEmployeesGetMapper;

@RestController
@RequestMapping("/human-resources/v1/employees/{employee-id}")
public class SrvHumanResourcesAPIemployeesEmployeeIdV1 implements ISrvHumanResourcesAPIemployeesEmployeeIdV1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(SrvHumanResourcesAPIemployeesEmployeeIdV1.class);

	@Autowired
	private IHumanResourcesGetEmployeeV1Business humanResourcesGetEmployeeV1Business;
	
	@Override
	@GetMapping
	public ResponseEntity<DtoOutGetEmployeesGet> humanResourcesGetEmployeeV1(@PathVariable(name = "employee-id", required = true) Long employeeId) {
		LOGGER.info("humanResourcesCreateEmployeesV1 - in {}",employeeId );
		BDtoOutGetEmployeesGet bDtoOut = humanResourcesGetEmployeeV1Business.humanResourcesEmployeesGetEmployeeV1(employeeId);
		GetEmployeesGetMapper mapper = Mappers.getMapper(GetEmployeesGetMapper.class);
		DtoOutGetEmployeesGet dtoOut = mapper.BDtoOutGetEmployeesGetToDtoOutGetEmployeesGet(bDtoOut);
		LOGGER.info("humanResourcesCreateEmployeesV1 - out {}",dtoOut );
		return new ResponseEntity<>(dtoOut, HttpStatusCode.valueOf(200));
	}


}
