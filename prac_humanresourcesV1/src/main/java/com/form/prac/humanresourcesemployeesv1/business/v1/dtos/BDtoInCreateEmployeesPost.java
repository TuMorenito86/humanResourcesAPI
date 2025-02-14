package com.form.prac.humanresourcesemployeesv1.business.v1.dtos;

import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInCreateEmployeesJobIdEnum;

public class BDtoInCreateEmployeesPost {

	private String apellido;
	private String email;
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
	public String toString() {
		return "DtoIn [apellido=" + apellido + ", email=" + email + ", jobId=" + jobId + "]";
	}

}
