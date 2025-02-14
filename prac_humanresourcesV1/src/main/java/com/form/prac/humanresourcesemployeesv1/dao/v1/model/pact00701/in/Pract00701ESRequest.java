package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.in;

import java.util.Objects;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.in.Pract00701ESRequestGet;
import com.form.prac.humanresourcesemployeesv1.utils.model.RequestTransaction;

@Validated
public class Pract00701ESRequest implements RequestTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
		Pract00701ESRequest other = (Pract00701ESRequest) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pract00701ESRequestGet [id=" + id + "]";
	}

}
