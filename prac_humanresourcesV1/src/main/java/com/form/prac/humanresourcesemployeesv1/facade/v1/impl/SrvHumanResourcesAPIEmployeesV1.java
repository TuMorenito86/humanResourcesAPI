package com.form.prac.humanresourcesemployeesv1.facade.v1.impl;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.form.prac.humanresourcesemployeesv1.business.v1.IHumanResourcesListEmployeesV1Business;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInListEmployeesJobIdEnum;
import com.form.prac.humanresourcesemployeesv1.facade.v1.ISrvHumanResourcesAPIEmployeesV1;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.mappers.ListEmployeesGetMapper;

@RestController
@RequestMapping("/human-resources/v1")
public class SrvHumanResourcesAPIEmployeesV1 implements ISrvHumanResourcesAPIEmployeesV1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(SrvHumanResourcesAPIEmployeesV1.class);

	@Autowired
	private IHumanResourcesListEmployeesV1Business humanResourcesListEmployeesV1Business;

	@Override
	@GetMapping("/employees")
	public ResponseEntity<List<DtoOutListEmployeesGet>> humanResourcesListEmployeesV1(@RequestParam(name = "managerId", required = false) Long managerId,
			@RequestParam(name = "departmentId", required = false) DtoInListEmployeesDepartmentIdEnum departmentId, @RequestParam(name = "jobId", required = false) DtoInListEmployeesJobIdEnum jobId) {
		LOGGER.info("humanResourcesListEmployeesV1 - in {} {} {}", managerId, departmentId, jobId);
		ListEmployeesGetMapper mapper = Mappers.getMapper(ListEmployeesGetMapper.class);
		List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1 = humanResourcesListEmployeesV1Business.humanResourcesListEmployeesV1(managerId, departmentId, jobId);
		List<DtoOutListEmployeesGet> response = mapper.mapListBDtoOutListEmployeesGetToListDtoOutListEmployeesGet(humanResourcesListEmployeesV1);
		LOGGER.info("humanResourcesListEmployeesV1 - out {response}");
		return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
	}

}
