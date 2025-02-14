package com.form.prac.humanresourcesemployeesv1.dao.v1.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesJobIdEnum;
import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesListEmployeesV1DAO;
import com.form.prac.humanresourcesemployeesv1.utils.IServicioTransacciones;

@Component
public class HumanResourcesListEmployeesV1DAO implements IHumanResourcesListEmployeesV1DAO{
	
	@Autowired
	IServicioTransacciones servicioTransacciones;

	@Override
	public List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1(Long managerId,
			DtoInListEmployeesDepartmentIdEnum departmentId, DtoInListEmployeesJobIdEnum jobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
