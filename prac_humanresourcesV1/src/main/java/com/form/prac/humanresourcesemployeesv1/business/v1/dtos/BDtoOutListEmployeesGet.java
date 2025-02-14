package com.form.prac.humanresourcesemployeesv1.business.v1.dtos;

import java.util.Date;

import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutListEmployeesJobIdEnum;

public class BDtoOutListEmployeesGet {

	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private Date fechaAlta;
	private DtoOutListEmployeesJobIdEnum jobId;
	private Double salario;
	private Double comision;
	private Long managerId;
	private DtoOutListEmployeesDepartmentIdEnum departmentId;

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

	public DtoOutListEmployeesJobIdEnum getJobId() {
		return jobId;
	}

	public void setJobId(DtoOutListEmployeesJobIdEnum jobId) {
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

	public DtoOutListEmployeesDepartmentIdEnum getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DtoOutListEmployeesDepartmentIdEnum departmentId) {
		this.departmentId = departmentId;
	}

}
