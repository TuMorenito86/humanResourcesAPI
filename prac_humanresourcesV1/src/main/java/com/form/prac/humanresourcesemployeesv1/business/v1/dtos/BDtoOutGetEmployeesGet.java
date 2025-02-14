package com.form.prac.humanresourcesemployeesv1.business.v1.dtos;

import java.util.Date;

import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutGetEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutGetEmployeesJobIdEnum;

public class BDtoOutGetEmployeesGet {

	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private Date fechaAlta;
	private DtoOutGetEmployeesJobIdEnum jobId;
	private Double salario;
	private Double comision;
	private Long managerId;
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
}
