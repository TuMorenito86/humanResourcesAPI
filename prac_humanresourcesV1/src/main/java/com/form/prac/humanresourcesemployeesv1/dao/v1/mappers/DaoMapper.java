package com.form.prac.humanresourcesemployeesv1.dao.v1.mappers;

import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.in.Pract04701ESRequest;

@org.mapstruct.Mapper
public interface DaoMapper {

	
	Pract04701ESRequest mapBDtoToPract04701ESRequest(Long employeeId);
}
