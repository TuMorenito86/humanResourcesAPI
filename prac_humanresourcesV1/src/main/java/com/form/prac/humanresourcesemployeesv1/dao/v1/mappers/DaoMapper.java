package com.form.prac.humanresourcesemployeesv1.dao.v1.mappers;

import java.util.List;

import org.mapstruct.Mapping;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.in.Pract00701ESRequest;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.out.Pract02701ESTransactionResponse;


@org.mapstruct.Mapper
public interface DaoMapper {
	
	Pract00701ESRequest mapBDtoToPract02701ESRequest(Long id);
	
	@Mapping(source = "data.empleado.id", target = "id")
	@Mapping(source = "data.empleado.nombre", target = "nombre")
	@Mapping(source = "data.empleado.apellido", target = "apellido")
	@Mapping(source = "data.empleado.email", target = "email")
	@Mapping(source = "data.empleado.telefono", target = "telefono")
	@Mapping(source = "data.empleado.fechaAlta", target = "fechaAlta")
	@Mapping(source = "data.empleado.jobId", target = "jobId")
	@Mapping(source = "data.empleado.salario", target = "salario")
	@Mapping(source = "data.empleado.comision", target = "comision")
	@Mapping(source = "data.empleado.managerId", target = "managerId")
	@Mapping(source = "data.empleado.departmentId", target = "departmentId")
	BDtoOutGetEmployeesGet mapBackendRestponseToBDtoOut(Pract02701ESTransactionResponse response);
}
