package com.form.prac.humanresourcesemployeesv1.business.v1;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;

public interface IHumanResourcesPartialUpdateEmployeeV1Business {

	void humanResourcesEmployeesPartialUpdateEmployeeV1(Long employeeId, BDtoInPartialUpdateEmployeesPatch bDtoIn);

}
