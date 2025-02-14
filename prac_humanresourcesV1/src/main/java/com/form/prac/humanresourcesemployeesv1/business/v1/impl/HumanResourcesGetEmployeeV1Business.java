package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesGetEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesGetByIdEmployeesV1DAO;

@Component
public class HumanResourcesGetEmployeeV1Business implements IHumanResourcesGetEmployeeV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesGetEmployeeV1Business.class);
	@Autowired
	private IHumanResourcesGetByIdEmployeesV1DAO daoSrv;
	
	@Override
	public BDtoOutGetEmployeesGet humanResourcesEmployeesGetEmployeeV1(Long employeeId) {
		return daoSrv.humanResourcesGetByIdEmployeesV1(employeeId);
	}

}
