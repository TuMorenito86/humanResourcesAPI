package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesPartialUpdateEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;

@Component
public class HumanResourcesPartialUpdateEmployeeV1Business implements IHumanResourcesPartialUpdateEmployeeV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesPartialUpdateEmployeeV1Business.class);

	@Override
	public void humanResourcesEmployeesPartialUpdateEmployeeV1(Long employeeId,
			BDtoInPartialUpdateEmployeesPatch bDtoIn) {
		LOGGER.info("humanResourcesEmployeesPartialUpdateEmployeeV1 - in {} {}", employeeId, bDtoIn);

		LOGGER.info("humanResourcesEmployeesPartialUpdateEmployeeV1 - out"  );
	}

}
