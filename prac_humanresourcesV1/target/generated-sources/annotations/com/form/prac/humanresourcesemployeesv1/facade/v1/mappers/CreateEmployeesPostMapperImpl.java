package com.form.prac.humanresourcesemployeesv1.facade.v1.mappers;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoInCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoInCreateEmployeesPost;
import com.form.prac.humanresourcesemployeesv1.facade.v1.dtos.DtoOutCreateEmployeesPost;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T13:15:30+0100",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class CreateEmployeesPostMapperImpl implements CreateEmployeesPostMapper {

    @Override
    public BDtoInCreateEmployeesPost mapDtoInToBDtoIn(DtoInCreateEmployeesPost dtOIn) {
        if ( dtOIn == null ) {
            return null;
        }

        BDtoInCreateEmployeesPost bDtoInCreateEmployeesPost = new BDtoInCreateEmployeesPost();

        bDtoInCreateEmployeesPost.setApellido( dtOIn.getApellido() );
        bDtoInCreateEmployeesPost.setEmail( dtOIn.getEmail() );
        bDtoInCreateEmployeesPost.setJobId( dtOIn.getJobId() );

        return bDtoInCreateEmployeesPost;
    }

    @Override
    public DtoOutCreateEmployeesPost mapBDtoOutToDtoOut(BDtoOutCreateEmployeesPost bDtoOut) {
        if ( bDtoOut == null ) {
            return null;
        }

        DtoOutCreateEmployeesPost dtoOutCreateEmployeesPost = new DtoOutCreateEmployeesPost();

        dtoOutCreateEmployeesPost.setId( bDtoOut.getId() );

        return dtoOutCreateEmployeesPost;
    }
}
