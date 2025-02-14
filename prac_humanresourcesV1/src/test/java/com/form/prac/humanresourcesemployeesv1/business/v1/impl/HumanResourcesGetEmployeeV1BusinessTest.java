package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HumanResourcesGetEmployeeV1BusinessTest {

	@InjectMocks
	HumanResourcesGetEmployeeV1Business bSrv;

	@Test
	void testHumanResourcesEmployeesGetEmployeeV1() {
		bSrv.humanResourcesEmployeesGetEmployeeV1(null);
		fail("Not yet implemented");
	}

}
