package com.form.prac.humanresourcesemployeesv1.facade.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;

import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoInPartialUpdateEmployeesPatch;

public interface ISrvHumanResourcesAPIemployeesEmployeeIdV1 {

	ResponseEntity<Void> humanResourcesDeleteEmployeeV1(@NonNull Long employeeId);
}

