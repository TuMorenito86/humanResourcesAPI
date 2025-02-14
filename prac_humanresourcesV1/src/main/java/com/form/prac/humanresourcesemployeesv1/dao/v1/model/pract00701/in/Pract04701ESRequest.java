package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.in;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.utils.model.RequestTransaction;

public class Pract04701ESRequest implements RequestTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("employeeId")
	private Long employeeId;

	public Pract04701ESRequest(Long employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Pract04701ESRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pract04701ESRequest other = (Pract04701ESRequest) obj;
		return Objects.equals(employeeId, other.employeeId);
	}

	@Override
	public String toString() {
		return "Pract04701ESRequest [employeeId=" + employeeId + "]";
	}
	
	
}
