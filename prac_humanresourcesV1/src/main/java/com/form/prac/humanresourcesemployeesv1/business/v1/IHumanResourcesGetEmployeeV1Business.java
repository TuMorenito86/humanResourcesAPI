package com.form.prac.humanresourcesemployeesv1.business.v1;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;

public interface IHumanResourcesGetEmployeeV1Business {

	BDtoOutGetEmployeesGet humanResourcesEmployeesGetEmployeeV1(Long employeeId);

}
