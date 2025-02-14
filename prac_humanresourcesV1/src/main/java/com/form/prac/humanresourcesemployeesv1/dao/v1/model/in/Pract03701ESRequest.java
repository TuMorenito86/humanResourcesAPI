package com.form.prac.humanresourcesemployeesv1.dao.v1.model.in;

import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.utils.model.RequestTransaction;

public class Pract03701ESRequest implements RequestTransaction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8725180461345795106L;
	
	
	@NonNull
	@JsonProperty("modifyEmployeeRequestDTO")
	private Empleado empleado;

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pract03701ESRequest other = (Pract03701ESRequest) obj;
		return Objects.equals(empleado, other.empleado);
	}

	@Override
	public String toString() {
		return "Pract03701ESRequest [empleado=" + empleado + "]";
	}
	
	


}
