package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HumanResourcesCreateEmployeesV1BusinessTest {

	@InjectMocks
	HumanResourcesCreateEmployeesV1Business bSrv;

	@Test
	void testHumanResourcesCreateEmployeesV1() {
		bSrv.humanResourcesCreateEmployeesV1(null);
		fail("Not yet implemented");
	}

}
