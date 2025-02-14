package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesListEmployeesV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesJobIdEnum;

@Component
public class HumanResourcesListEmployeesV1Business implements IHumanResourcesListEmployeesV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesListEmployeesV1Business.class);

	@Override
	public List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1(Long managerId, DtoInListEmployeesDepartmentIdEnum departmentId,
			DtoInListEmployeesJobIdEnum jobId) {
		LOGGER.info("humanResourcesListEmployeesV1 - in {} {} {}", managerId, departmentId, jobId);
		List<BDtoOutListEmployeesGet> bDtoOut = null;
		LOGGER.info("humanResourcesListEmployeesV1 - out {}", bDtoOut);
		return bDtoOut;
	}

}
