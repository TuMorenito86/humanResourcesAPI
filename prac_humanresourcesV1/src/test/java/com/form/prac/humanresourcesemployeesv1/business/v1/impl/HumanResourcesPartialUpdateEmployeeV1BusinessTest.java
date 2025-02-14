package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HumanResourcesPartialUpdateEmployeeV1BusinessTest {

	@InjectMocks
	HumanResourcesPartialUpdateEmployeeV1Business bSrv;

	@Test
	void testHumanResourcesEmployeesPartialUpdateEmployeeV1() {
		bSrv.humanResourcesEmployeesPartialUpdateEmployeeV1(null, null);
		fail("Not yet implemented");
	}

}
