package com.form.prac.humanresourcesemployeesv1.dao.v1.impl;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.business.v1.dtos.BDtoOutGetEmployeesGet;
import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesGetByIdEmployeesV1DAO;
import com.form.prac.humanresourcesemployeesv1.dao.v1.mappers.DaoMapper;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.in.Pract00701ESRequestGet;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.out.Pract00701ESTransactionResponseGet;
import com.form.prac.humanresourcesemployeesv1.utils.IServicioTransacciones;

@Component
public class HumanResourcesGetByIdEmployeesV1DAO implements IHumanResourcesGetByIdEmployeesV1DAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesGetByIdEmployeesV1DAO.class);

	@Autowired
	IServicioTransacciones servicioTransacciones;
	
	@Override
	public BDtoOutGetEmployeesGet humanResourcesGetByIdEmployeesV1(Long employeeId) {

		LOGGER.info("Capa DAO");
		// Mapper dto externo a dto intetno/negocio
		// DDtoInObject -> DaoInObject
		DaoMapper mapper = Mappers.getMapper(DaoMapper.class);
		Pract00701ESRequestGet request = mapper.mapBDtoToPract00701ESRequestGet(employeeId);

		// llamada a backend
		Pract00701ESTransactionResponseGet response = (Pract00701ESTransactionResponseGet)servicioTransacciones.invocar("PRACT027-01-ES", request, Pract00701ESTransactionResponseGet.class);

		// Mapper dto intetno/negocio a dto externo
		// DaoOutObject -> BDtoOutObject
		BDtoOutGetEmployeesGet bDtoOut = mapper.mapBackendResponseGetToBDtoOut(response.getData().getEmpleado());
		
		// retornar objeto Response
		return bDtoOut;
	}
	
	

}
