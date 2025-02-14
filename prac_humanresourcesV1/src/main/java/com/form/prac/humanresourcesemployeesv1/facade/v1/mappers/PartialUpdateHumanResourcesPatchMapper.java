package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import org.mapstruct.Mapper;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoInPartialUpdateEmployeesPatch;

@Mapper
public interface PartialUpdateHumanResourcesPatchMapper {

	BDtoInPartialUpdateEmployeesPatch mapDtoInPartialUpdateEmployeesPatchToBDtoInPartialUpdateEmployeesPatch(
			DtoInPartialUpdateEmployeesPatch dtoIn);

}
