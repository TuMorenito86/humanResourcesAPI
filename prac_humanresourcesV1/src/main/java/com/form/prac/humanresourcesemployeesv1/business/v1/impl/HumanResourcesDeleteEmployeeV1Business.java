package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesDeleteEmployeeV1Business;

@Component
public class HumanResourcesDeleteEmployeeV1Business implements IHumanResourcesDeleteEmployeeV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesDeleteEmployeeV1Business.class);

	@Override
	public void humanResourcesEmployeesDeleteEmployeeV1(Long employeeId) {
		LOGGER.info("humanResourcesEmployeesDeleteEmployeeV1 - in {} {}", employeeId);

		LOGGER.info("humanResourcesEmployeesDeleteEmployeeV1 - out"  );
	}

}
