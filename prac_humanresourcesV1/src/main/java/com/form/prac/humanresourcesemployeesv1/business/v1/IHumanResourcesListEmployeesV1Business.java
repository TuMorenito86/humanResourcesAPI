package com.form.prac.humanresourcesemployeesv1.business.v1;

import java.util.List;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesJobIdEnum;

public interface IHumanResourcesListEmployeesV1Business {

	List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1(Long managerId,
			DtoInListEmployeesDepartmentIdEnum departmentId, DtoInListEmployeesJobIdEnum jobId);

}
