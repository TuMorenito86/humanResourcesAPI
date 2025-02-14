package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutListEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutListEmployeesGet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T13:15:30+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class ListEmployeesGetMapperImpl implements ListEmployeesGetMapper {

    @Override
    public List<DtoOutListEmployeesGet> mapListBDtoOutListEmployeesGetToListDtoOutListEmployeesGet(List<BDtoOutListEmployeesGet> humanResourcesListEmployeesV1) {
        if ( humanResourcesListEmployeesV1 == null ) {
            return null;
        }

        List<DtoOutListEmployeesGet> list = new ArrayList<DtoOutListEmployeesGet>( humanResourcesListEmployeesV1.size() );
        for ( BDtoOutListEmployeesGet bDtoOutListEmployeesGet : humanResourcesListEmployeesV1 ) {
            list.add( bDtoOutListEmployeesGetToDtoOutListEmployeesGet( bDtoOutListEmployeesGet ) );
        }

        return list;
    }

    protected DtoOutListEmployeesGet bDtoOutListEmployeesGetToDtoOutListEmployeesGet(BDtoOutListEmployeesGet bDtoOutListEmployeesGet) {
        if ( bDtoOutListEmployeesGet == null ) {
            return null;
        }

        DtoOutListEmployeesGet dtoOutListEmployeesGet = new DtoOutListEmployeesGet();

        dtoOutListEmployeesGet.setId( bDtoOutListEmployeesGet.getId() );
        dtoOutListEmployeesGet.setNombre( bDtoOutListEmployeesGet.getNombre() );
        dtoOutListEmployeesGet.setApellido( bDtoOutListEmployeesGet.getApellido() );
        dtoOutListEmployeesGet.setEmail( bDtoOutListEmployeesGet.getEmail() );
        dtoOutListEmployeesGet.setTelefono( bDtoOutListEmployeesGet.getTelefono() );
        dtoOutListEmployeesGet.setFechaAlta( bDtoOutListEmployeesGet.getFechaAlta() );
        dtoOutListEmployeesGet.setJobId( bDtoOutListEmployeesGet.getJobId() );
        dtoOutListEmployeesGet.setSalario( bDtoOutListEmployeesGet.getSalario() );
        dtoOutListEmployeesGet.setComision( bDtoOutListEmployeesGet.getComision() );
        dtoOutListEmployeesGet.setManagerId( bDtoOutListEmployeesGet.getManagerId() );
        dtoOutListEmployeesGet.setDepartmentId( bDtoOutListEmployeesGet.getDepartmentId() );

        return dtoOutListEmployeesGet;
    }
}
