package com.form.prac.humanresourcesemployeesv1.facade.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;

import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutGetEmployeesGet;

public interface ISrvHumanResourcesAPIemployeesEmployeeIdV1 {

	ResponseEntity<DtoOutGetEmployeesGet> humanResourcesGetEmployeeV1(@NonNull Long employeeId);
}

