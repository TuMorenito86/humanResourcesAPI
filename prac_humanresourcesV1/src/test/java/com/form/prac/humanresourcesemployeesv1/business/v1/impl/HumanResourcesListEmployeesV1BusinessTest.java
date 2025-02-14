package com.form.prac.humanresourcesemployeesv1.business.v1.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HumanResourcesListEmployeesV1BusinessTest {

	@InjectMocks
	HumanResourcesListEmployeesV1Business bSrv;

	@Test
	void testHumanResourcesListEmployeesV1() {
		bSrv.humanResourcesListEmployeesV1(null, null, null);
		fail("Not yet implemented");
	}

}
