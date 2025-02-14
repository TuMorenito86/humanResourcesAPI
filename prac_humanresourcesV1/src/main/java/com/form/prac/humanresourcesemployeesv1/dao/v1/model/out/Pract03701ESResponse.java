package com.form.prac.humanresourcesemployeesv1.dao.v1.model.out;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract03701ESResponse  implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1571127211750688431L;
	
	
	@NonNull
	@JsonProperty("modifyEmployeeResponseDTO")
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
		Pract03701ESResponse other = (Pract03701ESResponse) obj;
		return Objects.equals(empleado, other.empleado);
	}

	@Override
	public String toString() {
		return "Pract03701ESResponse [empleado=" + empleado + "]";
	}
	
	


}

