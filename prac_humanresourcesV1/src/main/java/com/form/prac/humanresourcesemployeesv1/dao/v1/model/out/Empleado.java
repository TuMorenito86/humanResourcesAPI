package com.form.prac.humanresourcesemployeesv1.dao.v1.model.out;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empleado  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7704741098124232069L;
	//Este es el empleado de Salida. (OUT)
	
	
	@NonNull
	@JsonProperty("id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + "]";
	}
	
	

}

