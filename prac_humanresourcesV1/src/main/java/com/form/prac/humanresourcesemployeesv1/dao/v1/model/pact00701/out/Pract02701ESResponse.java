package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.out;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract02701ESResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3896937678987543401L;
	
	@NonNull
	@JsonProperty("empleado")
	private EmpleadoList empleado;

	public EmpleadoList getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoList empleado) {
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
		Pract02701ESResponse other = (Pract02701ESResponse) obj;
		return Objects.equals(empleado, other.empleado);
	}

	@Override
	public String toString() {
		return "Pract02701ESResponse [empleado=" + empleado + "]";
	}

}
