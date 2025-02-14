package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoInPartialUpdateEmployeesPatch;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T11:36:06+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class PartialUpdateHumanResourcesPatchMapperImpl implements PartialUpdateHumanResourcesPatchMapper {

    @Override
    public BDtoInPartialUpdateEmployeesPatch mapDtoInPartialUpdateEmployeesPatchToBDtoInPartialUpdateEmployeesPatch(DtoInPartialUpdateEmployeesPatch dtoIn) {
        if ( dtoIn == null ) {
            return null;
        }

        BDtoInPartialUpdateEmployeesPatch bDtoInPartialUpdateEmployeesPatch = new BDtoInPartialUpdateEmployeesPatch();

        bDtoInPartialUpdateEmployeesPatch.setNombre( dtoIn.getNombre() );
        bDtoInPartialUpdateEmployeesPatch.setTelefono( dtoIn.getTelefono() );
        bDtoInPartialUpdateEmployeesPatch.setSalario( dtoIn.getSalario() );
        bDtoInPartialUpdateEmployeesPatch.setComision( dtoIn.getComision() );
        bDtoInPartialUpdateEmployeesPatch.setManagerId( dtoIn.getManagerId() );
        bDtoInPartialUpdateEmployeesPatch.setDepartmentId( dtoIn.getDepartmentId() );

        return bDtoInPartialUpdateEmployeesPatch;
    }
}
