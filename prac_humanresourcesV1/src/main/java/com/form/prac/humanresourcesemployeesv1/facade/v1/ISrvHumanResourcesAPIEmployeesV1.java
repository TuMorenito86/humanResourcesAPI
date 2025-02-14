package com.form.prac.humanresourcesemployeesv1.facade.v1;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesJobIdEnum;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutListEmployeesGet;

public interface ISrvHumanResourcesAPIEmployeesV1 {

	ResponseEntity<List<DtoOutListEmployeesGet>> humanResourcesListEmployeesV1(Long managerId, DtoInListEmployeesDepartmentIdEnum departmentId, DtoInListEmployeesJobIdEnum jobId);
}
