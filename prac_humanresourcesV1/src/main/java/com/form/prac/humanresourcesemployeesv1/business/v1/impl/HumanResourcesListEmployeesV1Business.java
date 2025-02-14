package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesListEmployeesV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesJobIdEnum;
import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesListEmployeesV1DAO;

@Component
public class HumanResourcesListEmployeesV1Business implements IHumanResourcesListEmployeesV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesListEmployeesV1Business.class);

	@Autowired
	private IHumanResourcesListEmployeesV1DAO daoSrv;
	@Override
	public List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1(Long managerId, DtoInListEmployeesDepartmentIdEnum departmentId,
			DtoInListEmployeesJobIdEnum jobId) {
		LOGGER.info("humanResourcesListEmployeesV1 - in {} {} {}", managerId, departmentId, jobId);
		//Se añade la llamada
		List<BDtoOutListEmployeesGet> bDtoOut = daoSrv.humanResourcesListEmployeesV1(managerId, departmentId, jobId);
		LOGGER.info("humanResourcesListEmployeesV1 - out {}", bDtoOut);
		return bDtoOut;
	}

}
