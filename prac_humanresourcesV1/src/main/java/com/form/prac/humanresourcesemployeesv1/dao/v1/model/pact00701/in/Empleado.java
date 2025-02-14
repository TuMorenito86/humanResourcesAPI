package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.in;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8287675723427658893L;
	@NonNull
	@JsonProperty("apellido")
	private String apellido;
	@NonNull
	@JsonProperty("email")
	private String email;
	@NonNull
	@JsonProperty("jobId")
	private String jobId;

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

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
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
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& Objects.equals(jobId, other.jobId);
	}

	@Override
	public String toString() {
		return "Empleado [apellido=" + apellido + ", email=" + email + ", jobId=" + jobId + "]";
	}

}
