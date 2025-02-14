package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import org.mapstruct.Mapper;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutGetEmployeesGet;

@Mapper
public interface GetEmployeesGetMapper {

	DtoOutGetEmployeesGet BDtoOutGetEmployeesGetToDtoOutGetEmployeesGet(BDtoOutGetEmployeesGet bDtoOut);

}
