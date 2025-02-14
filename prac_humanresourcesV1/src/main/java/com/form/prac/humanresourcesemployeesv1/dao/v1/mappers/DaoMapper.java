package com.form.prac.humanresourcesemployeesv1.dao.v1.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.in.Pract03701ESRequest;

@Mapper
public interface DaoMapper {
	@Mapping(source = "employeeId", target = "empleado.id")
	@Mapping(source = "bDtoIn.nombre", target = "empleado.nombre")
	@Mapping(source = "bDtoIn.telefono", target = "empleado.telefono")
	@Mapping(source = "bDtoIn.salario", target = "empleado.salario")
	@Mapping(source = "bDtoIn.comision", target = "empleado.comision")
	@Mapping(source = "bDtoIn.managerId", target = "empleado.managerId")
	@Mapping(source = "bDtoIn.departmentId", target = "empleado.departmentId")
	Pract03701ESRequest mapEmployeeIdInToPract03701ESRequest(Long employeeId, BDtoInPartialUpdateEmployeesPatch bDtoIn);
}
