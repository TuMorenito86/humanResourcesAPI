package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesDeleteEmployeeV1Business;
import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesEmployeesDeleteEmployeeV1DAO;

@Component
public class HumanResourcesDeleteEmployeeV1Business implements IHumanResourcesDeleteEmployeeV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesDeleteEmployeeV1Business.class);

	@Autowired
	private IHumanResourcesEmployeesDeleteEmployeeV1DAO daoSrv;
	
	@Override
	public void humanResourcesEmployeesDeleteEmployeeV1(Long employeeId) {
		LOGGER.info("humanResourcesEmployeesDeleteEmployeeV1 - in {} {}", employeeId);
		daoSrv.humanResourcesEmployeesDeleteEmployeeV1(employeeId);
		LOGGER.info("humanResourcesEmployeesDeleteEmployeeV1 - out"  );
	}

}
