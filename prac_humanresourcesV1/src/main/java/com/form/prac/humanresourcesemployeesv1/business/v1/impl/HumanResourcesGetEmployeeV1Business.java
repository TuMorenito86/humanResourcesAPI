package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesGetEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;

@Component
public class HumanResourcesGetEmployeeV1Business implements IHumanResourcesGetEmployeeV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesGetEmployeeV1Business.class);

	@Override
	public BDtoOutGetEmployeesGet humanResourcesEmployeesGetEmployeeV1(Long employeeId) {
		LOGGER.info("humanResourcesEmployeesGetEmployeeV1 - in {}", employeeId);
		BDtoOutGetEmployeesGet bDtoOut = null;
		LOGGER.info("humanResourcesEmployeesGetEmployeeV1 - out {}", bDtoOut );
		return bDtoOut;
	}

}
