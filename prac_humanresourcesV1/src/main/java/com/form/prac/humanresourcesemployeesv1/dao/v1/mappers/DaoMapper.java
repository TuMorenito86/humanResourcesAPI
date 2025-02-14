package com.form.prac.humanresourcesemployeesv1.dao.v1.mappers;

import java.util.List;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract01701.out.Empleado;

@org.mapstruct.Mapper
public class DaoMapper {

	List<BDtoOutListEmployeesGet> mapBackendRestponseToListBDtoOut(List<Empleado> list);
}
