package com.form.prac.humanresourcesemployeesv1.business.v1;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutCreateEmployeesPost;

public interface IHumanResourcesCreateEmployeesV1Business {

	BDtoOutCreateEmployeesPost humanResourcesCreateEmployeesV1(BDtoInCreateEmployeesPost bDto);
}
