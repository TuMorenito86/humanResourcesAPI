package com.form.prac.humanresourcesemployeesv1.dao;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;

public interface IHumanResourcesUpdateEmployeeV1DAO {

	void humanResourceUpdateEmployeeV1(Long employeeId, BDtoInPartialUpdateEmployeesPatch bDtoIn);

}