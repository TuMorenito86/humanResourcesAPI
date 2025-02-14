package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutGetEmployeesGet;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T13:15:30+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class GetEmployeesGetMapperImpl implements GetEmployeesGetMapper {

    @Override
    public DtoOutGetEmployeesGet BDtoOutGetEmployeesGetToDtoOutGetEmployeesGet(BDtoOutGetEmployeesGet bDtoOut) {
        if ( bDtoOut == null ) {
            return null;
        }

        DtoOutGetEmployeesGet dtoOutGetEmployeesGet = new DtoOutGetEmployeesGet();

        dtoOutGetEmployeesGet.setId( bDtoOut.getId() );
        dtoOutGetEmployeesGet.setNombre( bDtoOut.getNombre() );
        dtoOutGetEmployeesGet.setApellido( bDtoOut.getApellido() );
        dtoOutGetEmployeesGet.setEmail( bDtoOut.getEmail() );
        dtoOutGetEmployeesGet.setTelefono( bDtoOut.getTelefono() );
        dtoOutGetEmployeesGet.setFechaAlta( bDtoOut.getFechaAlta() );
        dtoOutGetEmployeesGet.setJobId( bDtoOut.getJobId() );
        dtoOutGetEmployeesGet.setSalario( bDtoOut.getSalario() );
        dtoOutGetEmployeesGet.setComision( bDtoOut.getComision() );
        dtoOutGetEmployeesGet.setManagerId( bDtoOut.getManagerId() );
        dtoOutGetEmployeesGet.setDepartmentId( bDtoOut.getDepartmentId() );

        return dtoOutGetEmployeesGet;
    }
}
