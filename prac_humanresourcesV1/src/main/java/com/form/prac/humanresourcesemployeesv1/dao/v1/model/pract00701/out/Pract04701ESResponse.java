package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.out;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract04701ESResponse {
	
	@JsonProperty("isDeleted")
	private Boolean isDeleted;

	public Pract04701ESResponse(Boolean isDeleted) {
		super();
		this.isDeleted = isDeleted;
	}

	public Pract04701ESResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isDeleted);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pract04701ESResponse other = (Pract04701ESResponse) obj;
		return Objects.equals(isDeleted, other.isDeleted);
	}

	@Override
	public String toString() {
		return "Pract04701ESResponse [isDeleted=" + isDeleted + "]";
	}
	
	

}
