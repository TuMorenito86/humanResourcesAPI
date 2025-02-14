package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import org.mapstruct.Mapper;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoInCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutCreateEmployeesPost;

@Mapper
public interface CreateEmployeesPostMapper {

	BDtoInCreateEmployeesPost mapDtoInToBDtoIn(DtoInCreateEmployeesPost dtOIn);

	DtoOutCreateEmployeesPost mapBDtoOutToDtoOut(BDtoOutCreateEmployeesPost bDtoOut);

}
