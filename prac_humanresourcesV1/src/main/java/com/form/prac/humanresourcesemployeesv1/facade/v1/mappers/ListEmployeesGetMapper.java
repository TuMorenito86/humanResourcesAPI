package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutListEmployeesGet;

@Mapper
public interface ListEmployeesGetMapper {

	List<DtoOutListEmployeesGet> mapListBDtoOutListEmployeesGetToListDtoOutListEmployeesGet(
			List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1);

}
