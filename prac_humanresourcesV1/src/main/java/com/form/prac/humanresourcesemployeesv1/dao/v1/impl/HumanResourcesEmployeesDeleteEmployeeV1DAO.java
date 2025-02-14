package com.form.prac.humanresourcesemployeesv1.dao.v1.impl;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.form.prac.humanresourcesemployeesv1.dao.v1.IHumanResourcesEmployeesDeleteEmployeeV1DAO;
import com.form.prac.humanresourcesemployeesv1.dao.v1.mappers.DaoMapper;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.in.Pract04701ESRequest;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.out.Pract04701ESTransactionResponse;
import com.form.prac.humanresourcesemployeesv1.utils.IServicioTransacciones;

@Component
public class HumanResourcesEmployeesDeleteEmployeeV1DAO implements IHumanResourcesEmployeesDeleteEmployeeV1DAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(HumanResourcesEmployeesDeleteEmployeeV1DAO.class);
	
	@Autowired
	IServicioTransacciones servicioTransacciones;

	@Override
	public void humanResourcesEmployeesDeleteEmployeeV1(Long employeeId) {

		LOGGER.info("Capa DAO");
		
		DaoMapper mapper = Mappers.getMapper(DaoMapper.class);
		Pract04701ESRequest request = mapper.mapBDtoToPract04701ESRequest(employeeId);
		
		Pract04701ESTransactionResponse response = (Pract04701ESTransactionResponse) servicioTransacciones.invocar("PRACT047-01-ES", request, Pract04701ESTransactionResponse.class);
		
		LOGGER.info("Dato eliminado: " + response.getData().getIsDeleted().toString());
	}
	
	
}
