package com.form.prac.humanresourcesemployeesv1.dao.v1.mappers;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInPartialUpdateEmployeesPatch;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.in.Empleado;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.in.Pract03701ESRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T13:39:37+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class DaoMapperImpl implements DaoMapper {

    @Override
    public Pract03701ESRequest mapEmployeeIdInToPract03701ESRequest(Long employeeId, BDtoInPartialUpdateEmployeesPatch bDtoIn) {
        if ( employeeId == null && bDtoIn == null ) {
            return null;
        }

        Pract03701ESRequest pract03701ESRequest = new Pract03701ESRequest();

        if ( employeeId != null ) {
            if ( pract03701ESRequest.getEmpleado() == null ) {
                pract03701ESRequest.setEmpleado( new Empleado() );
            }
            longToEmpleado( employeeId, pract03701ESRequest.getEmpleado() );
        }
        if ( bDtoIn != null ) {
            if ( pract03701ESRequest.getEmpleado() == null ) {
                pract03701ESRequest.setEmpleado( new Empleado() );
            }
            bDtoInPartialUpdateEmployeesPatchToEmpleado( bDtoIn, pract03701ESRequest.getEmpleado() );
        }

        return pract03701ESRequest;
    }

    protected void longToEmpleado(Long long1, Empleado mappingTarget) {
        if ( long1 == null ) {
            return;
        }

        mappingTarget.setId( long1 );
    }

    protected void bDtoInPartialUpdateEmployeesPatchToEmpleado(BDtoInPartialUpdateEmployeesPatch bDtoInPartialUpdateEmployeesPatch, Empleado mappingTarget) {
        if ( bDtoInPartialUpdateEmployeesPatch == null ) {
            return;
        }

        mappingTarget.setNombre( bDtoInPartialUpdateEmployeesPatch.getNombre() );
        mappingTarget.setTelefono( bDtoInPartialUpdateEmployeesPatch.getTelefono() );
        mappingTarget.setSalario( bDtoInPartialUpdateEmployeesPatch.getSalario() );
        mappingTarget.setComision( bDtoInPartialUpdateEmployeesPatch.getComision() );
        mappingTarget.setManagerId( bDtoInPartialUpdateEmployeesPatch.getManagerId() );
        if ( bDtoInPartialUpdateEmployeesPatch.getDepartmentId() != null ) {
            mappingTarget.setDepartmentId( bDtoInPartialUpdateEmployeesPatch.getDepartmentId().name() );
        }
        else {
            mappingTarget.setDepartmentId( null );
        }
    }
}
