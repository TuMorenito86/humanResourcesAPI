package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesCreateEmployeesV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesCreateEmployeesV1DAO;

@Component
public class HumanResourcesCreateEmployeesV1Business implements IHumanResourcesCreateEmployeesV1Business {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesCreateEmployeesV1Business.class);
	@Autowired
	private IHumanResourcesCreateEmployeesV1DAO daoSrv;

	@Override
	public BDtoOutCreateEmployeesPost humanResourcesCreateEmployeesV1(BDtoInCreateEmployeesPost bDto) {
		LOGGER.info("humanResourcesCreateEmployeesV1 - i {}", bDto);
		return null;
	}

}
