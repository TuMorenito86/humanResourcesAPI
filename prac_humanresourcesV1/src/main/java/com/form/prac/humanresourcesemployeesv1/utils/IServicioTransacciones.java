package com.form.prac.humanresourcesemployeesv1.utils;

import com.form.prac.humanresourcesemployeesv1.utils.model.RequestTransaction;

public interface IServicioTransacciones {


	public <T> Object invocar(String transactionName, RequestTransaction requestTransaction,
			Class<T> responseType);

}
