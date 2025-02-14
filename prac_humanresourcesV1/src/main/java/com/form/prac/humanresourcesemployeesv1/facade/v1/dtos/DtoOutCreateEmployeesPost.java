package com.form.prac.humanresourcesemployeesv1.facade.v1.dtos;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DtoOutCreateEmployeesPost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3371118112510510019L;
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
		DtoOutCreateEmployeesPost other = (DtoOutCreateEmployeesPost) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "DtoOut [id=" + id + "]";
	}
	
	
}
