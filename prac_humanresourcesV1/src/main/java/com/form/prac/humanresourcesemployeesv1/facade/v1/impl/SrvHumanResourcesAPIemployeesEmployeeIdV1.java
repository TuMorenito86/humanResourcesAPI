package com.form.prac.humanresourcesemployeesv1.facade.v1.impl;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesPartialUpdateEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;
import com.form.prac.humanresourcesemployeesv1.facade.v1.ISrvHumanResourcesAPIemployeesEmployeeIdV1;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoInPartialUpdateEmployeesPatch;
import com.form.prac.humanresourcesemployeesv1.facade.v1.mappers.PartialUpdateHumanResourcesPatchMapper;

@RestController
@RequestMapping("/human-resources/v1/employees/{employee-id}")
public class SrvHumanResourcesAPIemployeesEmployeeIdV1 implements ISrvHumanResourcesAPIemployeesEmployeeIdV1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(SrvHumanResourcesAPIemployeesEmployeeIdV1.class);

	@Autowired
	private IHumanResourcesPartialUpdateEmployeeV1Business humanResourcesPartialUpdateEmployeeV1Business;
	
	@Override
	@PatchMapping
	public ResponseEntity<Void> humanResourcesPartialUpdateEmployeeV1(@PathVariable(name = "employee-id", required = true) Long employeeId,
			@RequestBody DtoInPartialUpdateEmployeesPatch dtoIn) {
		LOGGER.info("humanResourcesCreateEmployeesV1 - in {}, {}",employeeId, dtoIn);
		PartialUpdateHumanResourcesPatchMapper mapper = Mappers.getMapper(PartialUpdateHumanResourcesPatchMapper.class);
		BDtoInPartialUpdateEmployeesPatch bDtoIn = mapper.mapDtoInPartialUpdateEmployeesPatchToBDtoInPartialUpdateEmployeesPatch(dtoIn);
		humanResourcesPartialUpdateEmployeeV1Business.humanResourcesEmployeesPartialUpdateEmployeeV1(employeeId, bDtoIn);
		LOGGER.info("humanResourcesCreateEmployeesV1 - out ");
		return new ResponseEntity<>(HttpStatusCode.valueOf(204));
	}

}
