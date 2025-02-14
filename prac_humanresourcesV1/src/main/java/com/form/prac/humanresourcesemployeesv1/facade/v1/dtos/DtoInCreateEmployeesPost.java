package com.form.prac.humanresourcesemployeesv1.facade.v1.dtos;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInCreateEmployeesJobIdEnum;

@Validated
public class DtoInCreateEmployeesPost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4331504127172353316L;
	@NonNull
	@JsonProperty("apellido")
	private String apellido;
	@NonNull
	@JsonProperty("email")
	private String email;
	@NonNull
	@JsonProperty("jobId")
	private DtoInCreateEmployeesJobIdEnum jobId;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DtoInCreateEmployeesJobIdEnum getJobId() {
		return jobId;
	}

	public void setJobId(DtoInCreateEmployeesJobIdEnum jobId) {
		this.jobId = jobId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, email, jobId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DtoInCreateEmployeesPost other = (DtoInCreateEmployeesPost) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& Objects.equals(jobId, other.jobId);
	}

	@Override
	public String toString() {
		return "DtoIn [apellido=" + apellido + ", email=" + email + ", jobId=" + jobId + "]";
	}

}
