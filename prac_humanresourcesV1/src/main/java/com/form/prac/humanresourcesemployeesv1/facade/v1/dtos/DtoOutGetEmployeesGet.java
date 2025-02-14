package com.form.prac.humanresourcesemployeesv1.facade.v1.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutGetEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutGetEmployeesJobIdEnum;

public class DtoOutGetEmployeesGet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4474565317119687144L;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("nombre")
	private String nombre;
	@JsonProperty("apellido")
	private String apellido;
	@JsonProperty("email")
	private String email;
	@JsonProperty("telefono")
	private String telefono;
	@JsonProperty("fechaAlta")
	private Date fechaAlta;
	@JsonProperty("jobId")
	private DtoOutGetEmployeesJobIdEnum jobId;
	@JsonProperty("salario")
	private Double salario;
	@JsonProperty("comision")
	private Double comision;
	@JsonProperty("managerId")
	private Long managerId;
	@JsonProperty("departmentId")
	private DtoOutGetEmployeesDepartmentIdEnum departmentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public DtoOutGetEmployeesJobIdEnum getJobId() {
		return jobId;
	}

	public void setJobId(DtoOutGetEmployeesJobIdEnum jobId) {
		this.jobId = jobId;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public DtoOutGetEmployeesDepartmentIdEnum getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DtoOutGetEmployeesDepartmentIdEnum departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, comision, departmentId, email, fechaAlta, id, jobId, managerId, nombre, salario,
				telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DtoOutGetEmployeesGet other = (DtoOutGetEmployeesGet) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(comision, other.comision)
				&& Objects.equals(departmentId, other.departmentId) && Objects.equals(email, other.email)
				&& Objects.equals(fechaAlta, other.fechaAlta) && Objects.equals(id, other.id)
				&& Objects.equals(jobId, other.jobId) && Objects.equals(managerId, other.managerId)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(salario, other.salario)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "DtoOutListEmployeesGet [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", fechaAlta=" + fechaAlta + ", jobId=" + jobId + ", salario=" + salario
				+ ", comision=" + comision + ", managerId=" + managerId + ", departmentId=" + departmentId + "]";
	}

}
